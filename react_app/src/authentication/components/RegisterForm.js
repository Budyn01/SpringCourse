import React, {Component} from "react";
import {Link} from "react-router-dom";
import {auth} from '../../firebase'
import Header from "./Header";
import {AUTH_SIGN_UP_ERRORS} from "../constants/errors";
import ErrorInfo from "./ErrorInfo";

const INITIAL_STATE = {
    email: "",
    password: "",
    repeatedPassword: "",
    error: null
};

export default class RegisterForm extends Component {

    state = {...INITIAL_STATE};

    passwordsNotMatch = () => (
        this.state.password !== this.state.repeatedPassword
    );

    handleSubmit = (event) => {
        const email = this.state.email;
        const password = this.state.password;
        if (this.passwordsNotMatch()) {
            this.setState({error: AUTH_SIGN_UP_ERRORS.PASSWORDS_NOT_MATCH});
        } else {
            auth.doCreateUserWithEmailAndPassword(email, password)
                .then((authUser) => {
                    console.log(authUser);
                })
                .catch(error => {
                    switch (error.code) {
                        case "auth/email-already-in-use":
                            this.setState({error: AUTH_SIGN_UP_ERRORS.EMAIL_ALREADY_IN_USE});
                            break;
                        case "auth/weak-password":
                            this.setState({error: AUTH_SIGN_UP_ERRORS.WEAK_PASSWORD});
                            break;
                        case "auth/invalid-email":
                            this.setState({error: AUTH_SIGN_UP_ERRORS.INVALID_EMAIL});
                            break;
                        default:
                            this.setState({error: "Unknown"});
                    }
                })
        }
        event.preventDefault();
    };

    handleEmailChange = (event) => {
        const email = event.target.value;
        this.setState({email});
    };

    handlePasswordChange = (event) => {
        const password = event.target.value;
        this.setState({password});
    };

    handleRepeatedPasswordChange = (event) => {
        const repeatedPassword = event.target.value;
        this.setState({repeatedPassword});
    };

    render() {
        return (
            <form className="form-signin" onSubmit={this.handleSubmit}>

                <Header/>

                <ErrorInfo error={this.state.error}/>

                {/*Email*/}
                <div className="form-label-group">
                    <input type="email" className="form-control" id="email" placeholder="E-mail"
                           value={this.state.email} onChange={this.handleEmailChange} required/>
                    <label htmlFor="email">E-mail</label>
                </div>
                {/*Password*/}
                <div className="form-label-group">
                    <input type="password" className="form-control" id="password" placeholder="Hasło"
                           value={this.state.password} onChange={this.handlePasswordChange} minLength="6" required/>
                    <label htmlFor="password">Hasło</label>
                </div>
                {/*Repeated Password*/}
                <div className="form-label-group">
                    <input type="password" className="form-control" id="repeatPassword" placeholder="Powtórz Hasło"
                           value={this.state.repeatedPassword} onChange={this.handleRepeatedPasswordChange}
                           minLength="6" required/>
                    <label htmlFor="repeatPassword">Powtórz Hasło</label>
                </div>

                <div className="checkbox mb-3">
                    <label> <input type="checkbox" value="remember-me"/> Akceptuje regulamin</label>
                </div>

                <button className="btn btn-lg btn-primary btn-block" type="submit">ZAREJESTRUJ SIĘ</button>

                <h6 className="text-center mt-4 mb-3">
                    <Link to="/">ZALOGUJ SIĘ</Link>
                </h6>

                <p className="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>

            </form>
        )
    }
}