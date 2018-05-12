import React from 'react';
import ReactDOM from 'react-dom'

import {Provider} from 'react-redux';
import store from './store/Store'

import 'bootstrap/dist/css/bootstrap.min.css'
import AppRouter from "./AppRouter";
import {BrowserRouter as Router} from "react-router-dom";

const RouterWrapper = (props) => {
    return (
        <Router>
            <AppRouter/>
        </Router>
    )
};

const app = (
    <Provider store={store}>
        <RouterWrapper/>
    </Provider>
);



ReactDOM.render(app, document.getElementById("root"));