import React, {Component} from "react";
import {Redirect, Route, Switch, withRouter} from 'react-router-dom';
import {connect} from "react-redux";

import WelcomePage from "./authentication/components/WelcomePage";
import DashboardPage from "./dashboard/components/DashboardPage";
import {firebase} from "./firebase";
import {PW_FORGET_PATH, REGISTER_PATH} from "./constants/Routes";
import DevelopmentInfo from "./components/DevelopmentInfo";
import WebLoading from "./components/WebLoading";
import {compose} from 'recompose';

class AppRouter extends Component {

    state = {
        isAppLoaded: false
    };

    componentDidMount() {
        const {onSetAuthUser} = this.props;

        firebase.auth.onAuthStateChanged(authUser => {
            if(authUser) {
                onSetAuthUser(authUser);
                this.props.history.push("/dashboard");
            } else {
                onSetAuthUser(null)
            }
            this.setState({isAppLoaded: true});
        });
    }

    render() {
        const path = new RegExp(`(${PW_FORGET_PATH}|${REGISTER_PATH}|/)`);
        return (
            <div className="developmentInfoContainer">
                <DevelopmentInfo isAppLoaded={this.state.isAppLoaded}/>
                <Switch>
                    {!this.state.isAppLoaded && <Route component={WebLoading}/>}
                    {this.props.authUser ?
                        <Route path="/dashboard" component={DashboardPage}/> :
                        <Route exact path="/(register|pw-forget|)/" component={WelcomePage}/>
                    }
                    <Route component={NoMatch}/>
                </Switch>
            </div>
        )
    }
}

const mapDispatchToProps = (dispatch) => ({
    onSetAuthUser: (authUser) => dispatch({type: 'AUTH_USER_SET', authUser})
});

const mapStateToProps = (state) => ({
    authUser: state.sessionState.authUser
});

const NoMatch = ({location}) => (
    <div>
        <h3>No match for <code>{location.pathname}</code></h3>
    </div>
);

export default compose(
    withRouter,
    connect(mapStateToProps, mapDispatchToProps)
)(AppRouter);

// export default connect(mapStateToProps, mapDispatchToProps)(AppRouter);

