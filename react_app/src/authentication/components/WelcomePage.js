import React, {Component} from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import LoginForm from "./LoginForm";
import RegisterForm from "./RegisterForm";

import "../styles/WelcomePage.css"
import PasswordForgetForm from "./PasswordForgetForm";
import {PW_FORGET_PATH, REGISTER_PATH} from "../../constants/Routes";

export default class WelcomePage extends Component {
    render() {
        return (
            <div className="formContainer">
                <Switch>
                    <Route exact path="/" component={LoginForm}/>
                    <Route path={REGISTER_PATH} component={RegisterForm}/>
                    <Route path={PW_FORGET_PATH} component={PasswordForgetForm}/>
                </Switch>
            </div>
        )
    }
}



