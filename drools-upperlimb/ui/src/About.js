import React, { Component } from "react";
import { Button } from 'react-bootstrap';
import Carousel from 'react-bootstrap/Carousel';
import Container from 'react-bootstrap/Container';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
import history from './history';
import "./About.css";

export default class About extends Component {
render() {
    return (
<div className="About mt-0">
        <div className="lander mt-0">
            <Container className="mt-0">
              <Row className="mt-0">
                <Col>
                    <img
                   alt=""
                   src={require ("./exoLogo.png")}
                   width="150"
                   height="auto"
                    />{' '}
                    <h1>About the app</h1>

                </Col>
              </Row>
              <Row>
              <h2>Patients tab</h2>
              </Row>
              <Row className="mb-2">
              <p>In this tab you will find functionalities such as inserting a new patient, and viewing a single or all patients.</p>
              <p>To edit, delete or look for a patient, you must click the "Manage Patient Information" card and provide their ID.</p>
              </Row>
               <Row>
               <h2>Sessions tab</h2>
                </Row>
                <Row className="mb-2">
                <p>This tab manages all actions that can be done with a the Session information.</p>
                <p>The first card, "Create a Session from Raw Data", will allow you to insert a User ID and a document path to a csv file containig Raw Data. </p>
                <p>Based on the two parameters, it will calculate the sessions values and insert them into the database.</p>
                <p>The second card, "List all the Sessions of a single User", will allow you to display the basic information of all the sessions related to a User. </p>
                <p>It will open up a search bar in which the User ID has to be input to display their sessions.</p>
                <p>The third card, "Show data and predictions of a Session", will allow you to calculate useful values such as muscular activity, recruitment of fibres and maximum reference contraction in biceps and triceps from the EMGs in the Raw Data</p>
                <p>Providing the diagnosis, the amount of elastics used during the session, and if the biceps was assisted, it will calculate the values the therapy session should have given those parameters.</p>
                <p>If the muscular activity is correct, it will recommend to continue the therapy as it was, otherwise it will suggest increasing or decreasing the number of elastics used.</p>
                <p>A graph will be displayed indicating the correct values the muscular activity should be found, along with a line displaying the muscular activity for that particular session given the number of elastics input.</p>

                </Row>
                <Row>
                <h2>Raw Data tab</h2>
                </Row>
                <Row className="mb-2">
                <p>This tab will allow for the visualisation of Raw Data, that is the EMG values stored during the rehabilitation session.</p>
                <p>There are two options, see all Raw Data available, or search the data for a particular session given its ID.</p>

                </Row>
            </Container>
        </div>
</div>);
}

}