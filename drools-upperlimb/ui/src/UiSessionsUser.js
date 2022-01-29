import React, { Component } from 'react';
import { withRouter, Link } from 'react-router-dom';
import Form from 'react-bootstrap/Form'
import { Button } from 'react-bootstrap';
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import history from './history';
import "./UiSessions.css";

class UiSessionsUser extends Component {
    constructor(props) {
            super(props);
            this.userId = {value: ''};
            this.sessId = {value: ''};
            this.ar = {value: ''};
            this.diag = {value: ''};
            this.elastics = {value: ''};
            this.handleChange = this.handleChange.bind(this);
            this.handleSubmit = this.handleSubmit.bind(this);
          }
        handleSubmit(event) {
            let userId = event.target.userID.value;
            let sessId = event.target.sessID.value;
            let elastics = event.target.elastics.value;
            let diag = event.target.diag.value;
            let ar = event.target.ar.value;
            window.open(`http:/\/localhost:8080/sess/${userId}/${sessId}/${elastics}/${diag}/${ar}`);
            }
        handleChange(event) {
            this.setState({value: event.target.value});
              }
    render() {
        return (
           <div className="Sessions mt-0" style={{ justifyContent: 'center'}}>

               <h1 justifyContent="center">Session Information and Prediction</h1>
                   <p>Please introduce the Session information to visualise it.</p>
                   <p>The additional information will be used to predict future therapy routes.</p>
                    <Form onSubmit={this.handleSubmit}>
                      <Row className="mb-3">
                        <Form.Group as={Col} controlId="formGridUserId">
                          <Form.Label align="left">User ID</Form.Label>
                          <Form.Control name="userID" placeholder="Enter user ID" />
                        </Form.Group>

                        <Form.Group as={Col} controlId="formGridSessionID">
                          <Form.Label>Session ID</Form.Label>
                          <Form.Control name="sessID" placeholder="Enter Session ID" />
                        </Form.Group>
                      </Row>
                       <Row className="mb-3">
                          <Form.Group as={Col} controlId="formGridDiag">
                            <Form.Label>Diagnosis</Form.Label>
                            <Form.Control as="select" name="diag" defaultValue="Choose diagnosis">
                                <option value="TA">Triceps Atrophy</option>
                                <option value="BA">Biceps Atrophy</option>
                            </Form.Control>
                          </Form.Group>
                          <Form.Group as={Col} controlId="formGridElastics">
                            <Form.Label>Number of elastics</Form.Label>
                            <Form.Control as = "select" name="elastics" defaultValue="Choose number of elastics">
                              <option value="0">0</option>
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                              <option value="5">5</option>
                              <option value="6">6</option>
                              <option value="7">7</option>
                              <option value="8">8</option>
                              <option value="9">9</option>
                              <option value="10">10</option>
                            </Form.Control>
                          </Form.Group>

                          <Form.Group as={Col} controlId="formGridAssist">
                             <Form.Label>Assist or Resist</Form.Label>
                             <Form.Control as="select" name="ar" defaultValue="Choose...">
                                 <option value="true">Assisting biceps flexion</option>
                                 <option value="false">Resisting biceps flexion</option>
                             </Form.Control>
                           </Form.Group>
                        </Row>
                       <Button variant="primary" type="submit">Submit</Button>
                    </Form>
             </div>
        );
    }
}

export default UiSessionsUser;