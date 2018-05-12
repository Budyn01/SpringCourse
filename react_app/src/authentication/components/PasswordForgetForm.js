import React, {Component} from "react";
import {Link} from "react-router-dom";
import Header from "./Header";

export default class PasswordForgetForm extends Component {
    render() {
        return (
            <form className="form-signin">
                <Header/>
                <div className="form-label-group">
                    <input type="text" className="form-control" id="email" placeholder="E-mail"/>
                    <label htmlFor="email">E-mail</label>
                </div>
                <button className="btn btn-lg btn-primary btn-block" type="submit">POTWIERDZ</button>

                <h6 className="text-center mt-4 mb-3">
                    <Link to="/">ZALOGUJ SIĘ</Link>
                </h6>

                <p className="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>

            </form>
        )
    }
}