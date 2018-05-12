import React, {Component} from "react";
import {Link} from "react-router-dom";

const INITIAL_STATE = {
    companyName: "",
    nip: "",
    city: "",
    postCode: "",
    street: "",
    companyRepresentative: "",
    phone: "",
};

class CompanyInfoPage extends Component {

    state = {...INITIAL_STATE};

    handleCompanyNameChange = (event) => {
    };

    handleNIPChange = (event) => {
    };

    handleCityChange = (event) => {
    };

    handlePostCodeChange = (event) => {
    };

    handleStreetChange = (event) => {
    };

    handleCompanyRepresentativeChange = (event) => {
    };

    handlePhoneChange = (event) => {
    };


    render() {
        return (
            <div>
                <form className="">

                    <div className="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 className="h2">Dane o firmie</h1>
                    </div>

                    {/*Company Name*/}
                    <div className="form-label-group">
                        <input type="text" className="form-control" id="companyName" placeholder="Nazwa firmy"
                               value={this.state.companyName} onChange={this.handleCompanyNameChange} autoFocus/>
                        <label htmlFor="companyName">Nazwa firmy</label>
                    </div>
                    {/*NIP*/}
                    <div className="form-label-group">
                        <input type="text" className="form-control" id="nip" placeholder="NIP"
                               value={this.state.nip}
                               onChange={this.handleNIPChange}/>
                        <label htmlFor="nip">NIP</label>
                    </div>
                    {/*City*/}
                    <div className="form-label-group row">
                        <div className="col" style={{paddingRight: 8}}>
                            <input type="text" className="form-control" id="city" placeholder="Miasto"
                                   value={this.state.city} onChange={this.handleCityChange}/>
                            <label htmlFor="city" style={{marginLeft: 14}}>Miasto</label>
                        </div>
                        <div className="col" style={{paddingLeft: 0}}>
                            <input type="text" className="form-control" id="postcode" placeholder="Kod Pocztowy"
                                   value={this.state.postCode} onChange={this.handlePostCodeChange}/>
                            <label htmlFor="postcode">Kod pocztowy</label>
                        </div>
                    </div>
                    {/*Street*/}
                    <div className="form-label-group">
                        <input type="text" className="form-control" id="street" placeholder="Ulica"
                               value={this.state.street} onChange={this.handleStreetChange}/>
                        <label htmlFor="street">Ulica</label>
                    </div>
                    {/*Company Representive*/}
                    <div className="form-label-group">
                        <input type="text" className="form-control" id="companyRepresentative"
                               placeholder="Imię i nazwisko reprezentanta" value={this.state.companyRepresentative}
                               onChange={this.handleCompanyRepresentativeChange}/>
                        <label htmlFor="companyRepresentative">Imię i nazwisko reprezentanta</label>
                    </div>
                    {/*Phone*/}
                    <div className="form-label-group">
                        <input type="phone" className="form-control" id="phone" placeholder="Numer telefonu"
                               value={this.state.phone} onChange={this.handlePhoneChange}/>
                        <label htmlFor="phone">Numer telefonu</label>
                    </div>

                    <button className="btn btn-primary">Zapisz</button>
                    <button className="btn btn-danger">Przywróć</button>

                </form>
            </div>
        )
    }
}

export default CompanyInfoPage;
