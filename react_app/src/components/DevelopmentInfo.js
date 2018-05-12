import React, {Component} from "react";
import {connect} from "react-redux";

import "../styles/DevelopmentInfo.css";

class DevelopmentInfo extends Component {
    render() {
        const {authUser} = this.props;
        return (
            <div className="developmentInfo">
                <p><b>Development Info</b></p>
                <p>Logged as: {authUser ? authUser.email : "Not Logged"}</p>
                <p>App is loaded: {this.props.isAppLoaded ? "true" : "false"}</p>
            </div>
        )
    }
}

const mapStateToProps = (state) => ({
    authUser: state.sessionState.authUser
});

export default connect(mapStateToProps)(DevelopmentInfo);