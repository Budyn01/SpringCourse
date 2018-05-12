import React, {Component} from "react"
import {Link} from "react-router-dom"
import {connect} from "react-redux";
import {auth} from "../../firebase/index";
import Header from "./Header";
import {AUTH_SIGN_IN_ERRORS} from "../constants/errors";
import ErrorInfo from "./ErrorInfo";

const INITIAL_STATE = {
    email: "",
    password: "",
    error: null
};

class LoginForm extends Component {

    state = {...INITIAL_STATE};

    handleSubmit = (event) => {
        const email = this.state.email;
        const password = this.state.password;
        auth.doSignInWithEmailAndPassword(email, password)
            .then(() => {
                this.props.history.push("/dashboard");
            })
            .catch((error) => {
                switch (error.code) {
                    case "auth/user-disabled":
                        this.setState({error: AUTH_SIGN_IN_ERRORS.USER_DISABLED});
                        break;
                    case "auth/user-not-found":
                        this.setState({error: AUTH_SIGN_IN_ERRORS.USER_NOT_FOUND});
                        break;
                    case "auth/wrong-password":
                        this.setState({error: AUTH_SIGN_IN_ERRORS.WRONG_PASSWORD});
                        break;
                    default:
                        this.setState({error: "Unknown"});
                }
                console.log("Code: " + error.code + "Message: " + error.message);
            });
        this.setState({password: ""});
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

    render() {
        return (
            <form className="form-signin" onSubmit={this.handleSubmit}>
                <Header/>

                <ErrorInfo error={this.state.error}/>

                {/*Email*/}
                <div className="form-label-group">
                    <input type="email" id="loginEmail" className="form-control" placeholder="Adres email" required
                           autoFocus value={this.state.email} onChange={this.handleEmailChange}/>
                    <label htmlFor="loginEmail">Email address</label>
                </div>

                {/*Password*/}
                <div className="form-label-group">
                    <input type="password" id="loginPassword" className="form-control" placeholder="Hasło"
                           required value={this.state.password} onChange={this.handlePasswordChange} minLength="6"/>
                    <label htmlFor="loginPassword">Hasło</label>
                </div>

                <div className="checkbox mb-3">
                    <label> <input type="checkbox" value="remember-me"/> Zapamiętaj mnie</label>
                </div>
                <button className="btn btn-lg btn-primary btn-block" type="submit">ZALOGUJ SIĘ</button>
                <Link className="float-right" to="/pw-forget">Nie pamiętasz hasła?</Link>
                <h6 className="text-center mt-5 mb-3">
                    <Link to="/register">ZAREJESTRUJ SIĘ</Link>
                </h6>
                <p className="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>

            </form>
        )
    }
}

const mapStateToProps = (state) => ({
    authUser: state.sessionState.authUser
});

export default connect(mapStateToProps)(LoginForm);

