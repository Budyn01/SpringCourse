import React, {Component} from "react";
import {Link, Redirect} from "react-router-dom";
import {auth, db} from '../../firebase'
import Header from "./Header";

const defaultUser = {
    companyName: "",
    nip: "",
    city: "",
    postCode: "",
    street: "",
    companyRepresentative: "",
    email: "",
    phone: "",
    password: "",
    repeatedPassword: ""
};

export default class RegisterForm extends Component {

    state = {user: defaultUser};

    isInvalid = (user) => (
        user.password !== user.repeatedPassword ||
        user.password === '' ||
        user.password.length < 3 ||
        user.email === ''
    );

    handleSubmit = (event) => {
        const user = this.state.user;
        if (this.isInvalid(user)) {
            console.log("User is invalid :" + user);
        } else {
            auth.doCreateUserWithEmailAndPassword(user.email, user.password)
                .then((authUser) => {
                    db.doCreateUser(authUser.user.uid, user)
                        .then(() => {
                            this.props.history.push('/');
                        })
                        .catch(error => {
                            console.log(error);
                        })
                })
                .catch(error => {
                    console.log(error);
                })
        }
        event.preventDefault();
    };

    handleCompanyNameChange = (event) => {
        const user = this.state.user;
        user.companyName = event.target.value;
        this.setState({user});
    };

    handleNIPChange = (event) => {
        const user = this.state.user;
        user.nip = event.target.value;
        this.setState({user});
    };

    handleCityChange = (event) => {
        const user = this.state.user;
        user.city = event.target.value;
        this.setState({user});
    };

    handlePostCodeChange = (event) => {
        const user = this.state.user;
        user.postCode = event.target.value;
        this.setState({user});
    };

    handleStreetChange = (event) => {
        const user = this.state.user;
        user.street = event.target.value;
        this.setState({user});
    };

    handleCompanyRepresentativeChange = (event) => {
        const user = this.state.user;
        user.companyRepresentative = event.target.value;
        this.setState({user});
    };

    handleEmailChange = (event) => {
        const user = this.state.user;
        user.email = event.target.value;
        this.setState({user});
    };

    handlePhoneChange = (event) => {
        const user = this.state.user;
        user.phone = event.target.value;
        this.setState({user});
    };

    handlePasswordChange = (event) => {
        const user = this.state.user;
        user.password = event.target.value;
        this.setState({user});
    };

    handleRepeatedPasswordChange = (event) => {
        const user = this.state.user;
        user.repeatedPassword = event.target.value;
        this.setState({user});
    };

    render() {
        return (
            <form className="form-signin" onSubmit={this.handleSubmit}>

                <Header subtitle=""/>

                <h4 className="mb-3">Dane firmy</h4>
                {/*Company Name*/}
                <div className="form-label-group">
                    <input type="text" className="form-control" id="companyName" placeholder="Nazwa firmy"
                           value={this.state.user.companyName} onChange={this.handleCompanyNameChange} autoFocus/>
                    <label htmlFor="companyName">Nazwa firmy</label>
                </div>
                {/*NIP*/}
                <div className="form-label-group">
                    <input type="text" className="form-control" id="nip" placeholder="NIP" value={this.state.user.nip}
                           onChange={this.handleNIPChange}/>
                    <label htmlFor="nip">NIP</label>
                </div>
                {/*City*/}
                <div className="form-label-group row">
                    <div className="col" style={{paddingRight: 8}}>
                        <input type="text" className="form-control" id="city" placeholder="Miasto"
                               value={this.state.user.city} onChange={this.handleCityChange}/>
                        <label htmlFor="city" style={{marginLeft: 14}}>Miasto</label>
                    </div>
                    <div className="col" style={{paddingLeft: 0}}>
                        <input type="text" className="form-control" id="postcode" placeholder="Kod Pocztowy"
                               value={this.state.user.postCode} onChange={this.handlePostCodeChange}/>
                        <label htmlFor="postcode">Kod pocztowy</label>
                    </div>
                </div>
                {/*Street*/}
                <div className="form-label-group">
                    <input type="text" className="form-control" id="street" placeholder="Ulica"
                           value={this.state.user.street} onChange={this.handleStreetChange}/>
                    <label htmlFor="street">Ulica</label>
                </div>
                {/*Company Representive*/}
                <div className="form-label-group">
                    <input type="text" className="form-control" id="companyRepresentative"
                           placeholder="Imię i nazwisko reprezentanta" value={this.state.user.companyRepresentative}
                           onChange={this.handleCompanyRepresentativeChange}/>
                    <label htmlFor="companyRepresentative">Imię i nazwisko reprezentanta</label>
                </div>
                {/*Phone*/}
                <div className="form-label-group">
                    <input type="phone" className="form-control" id="phone" placeholder="Numer telefonu"
                           value={this.state.user.phone} onChange={this.handlePhoneChange}/>
                    <label htmlFor="phone">Numer telefonu</label>
                </div>
                <h4 className="mb-3">Dane logowania</h4>
                {/*Email*/}
                <div className="form-label-group">
                    <input type="email" className="form-control" id="email" placeholder="E-mail"
                           value={this.state.user.email} onChange={this.handleEmailChange}/>
                    <label htmlFor="email">E-mail</label>
                </div>
                {/*Password*/}
                <div className="form-label-group">
                    <input type="password" className="form-control" id="password" placeholder="Hasło"
                           value={this.state.user.password} onChange={this.handlePasswordChange} minLength="6"/>
                    <label htmlFor="password">Hasło</label>
                </div>
                {/*Repeated Password*/}
                <div className="form-label-group">
                    <input type="password" className="form-control" id="repeatPassword" placeholder="Powtórz Hasło"
                           value={this.state.user.repeatedPassword} onChange={this.handleRepeatedPasswordChange}
                           minLength="6"/>
                    <label htmlFor="repeatPassword">Powtórz Hasło</label>
                </div>

                <button className="btn btn-lg btn-primary btn-block" type="submit">ZAREJESTRUJ SIĘ</button>

                <h6 className="text-center mt-4 mb-3">
                    <Link to="/">ZALOGUJ SIĘ</Link>
                </h6>

            </form>
        )
    }
}