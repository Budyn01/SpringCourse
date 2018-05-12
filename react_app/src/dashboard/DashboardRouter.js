import React, {Component} from "react";
import {Switch, Route} from "react-router-dom";
import CompanyInfoPage from "./components/CompanyInfoPage";

class DashboardRouter extends Component {
    render() {
        return (
            <main role="main" className="col-md-9 ml-sm-auto col-lg-10 px-4">
                <Switch>
                    <Route exact path="/dashboard" component={SummaryPage}/>
                    <Route path="/dashboard/info" component={CompanyInfoPage}/>
                    <Route path="/dashboard/help" component={HelpPage}/>
                </Switch>
            </main>
        )
    }
}

export default DashboardRouter;

const SummaryPage = (props) => {
    return <p>SummaryPage</p>;
};

const HelpPage = (props) => {
    return <p>Help</p>;
};