import React, {Component} from "react";
import {auth} from "../../firebase/index"
import {connect} from "react-redux"
import Header from "../../authentication/components/Header";
import NavigationBar from "./NavigationBar";

import "../styles/DashboardPage.css";
import SideBar from "./SideBar";

class DashboardPage extends Component {

    handleSignOut = (event) => {
        auth.doSignOut();
        this.props.history.push("/");
        event.preventDefault();
    };

    render() {
        const {authUser} = this.props;
        return (
            <div className="dashboard-container">
                <NavigationBar handleSignOut={this.handleSignOut}/>
                <SideBar/>

                <script src="https://unpkg.com/feather-icons/dist/feather.min.js"/>
                <script>
                    feather.replace()
                </script>
            </div>
        );
    }
}

const mapStateToProps = (state) => ({
    authUser: state.sessionState.authUser
});

export default connect(mapStateToProps)(DashboardPage);
