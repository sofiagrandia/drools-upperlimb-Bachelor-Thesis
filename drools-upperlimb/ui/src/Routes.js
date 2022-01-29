import React, { Component } from "react";
import { Router, Switch, Route } from "react-router-dom";

import history from './history';
import UiSessions from "./UiSessions";
import UiSessionsUser from "./UiSessionsUser";
import UiPatients from "./UiPatients";
import UiRawData from "./UiRawData";
import HomePage from "./HomePage";
import About from "./About";

export default class Routes extends Component {
    render() {
        return (
            <Router history={history}>
                <Switch>
                    <Route exact path="/" component={HomePage} />
                    <Route exact path="/sessionsUi" component={UiSessions} />
                    <Route exact path="/sessionsUiUser" component={UiSessionsUser} />
                    <Route exact path="/patientsUi" component={UiPatients} />
                    <Route exact path="/rawDataUi" component={UiRawData} />
                    <Route exact path="/about" component={About} />
                </Switch>
            </Router>
        )
    }
}