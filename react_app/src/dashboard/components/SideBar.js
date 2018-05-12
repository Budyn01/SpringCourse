import React, {Component} from "react";
import FeatherIcon from 'feather-icons-react';
import DashboardRouter from "../DashboardRouter";
import {NavLink} from "react-router-dom";

class SideBar extends Component {

    render() {
        return (
            <div className="container-fluid">
                <div className="row">
                    <nav className="col-md-2 d-md-block bg-light sidebar navbar-collapse" id="navbarCollapse">
                        <div className="sidebar-sticky">
                            <ul className="nav flex-column">
                                <li className="nav-item">
                                    <NavLink exact to="/dashboard" activeClassName="active" className="nav-link">
                                        <FeatherIcon icon="home"/>
                                        Podsumowanie
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink to="/dashboard/info" activeClassName="active" className="nav-link" >
                                        <FeatherIcon icon="file"/>
                                        Dane o firmie
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink to="/dashboard/help" activeClassName="active" className="nav-link" >
                                        <FeatherIcon icon="file"/>
                                        Help
                                    </NavLink>
                                </li>
                            </ul>

                        </div>
                    </nav>

                    <DashboardRouter/>

                </div>
            </div>
        )
    }
};

export default SideBar;

