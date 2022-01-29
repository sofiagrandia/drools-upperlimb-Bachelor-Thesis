import React, { Component } from 'react';
import { withRouter } from 'react-router-dom';
import Card from 'react-bootstrap/Card'
import { Button } from 'react-bootstrap';
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import "./UiPatients.css";
import "./UiRawData.css";
import Form from 'react-bootstrap/Form'

class UiSessions extends Component {

    constructor(props) {
        super(props);
        this.state = {value: ''};
        this.handleChange = this.handleChange.bind(this);
        this.handleCreateSubmit = this.handleAllSubmit.bind(this);
        this.handleListSubmit = this.handleSessSubmit.bind(this);
      }
    handleSessSubmit(event) {
        window.open("/sessionsUiUser");
        }
    handleAllSubmit(event) {
        window.open("http://localhost:9000/patients/sessions/search");
    }
     handleSessCreate(event) {
            window.open("http://localhost:9000/patients/sessions/data");
            }
      handleChange(event) {
        this.setState({value: event.target.value});
          }
    render() {
        return (
            <div style={{ display: 'flex', justifyContent: 'center', padding: 30 }}>
                <div className="lander mt-0" style={{ display: 'flex', justifyContent: 'center'}} >



                   <Container>
                   <h1>Sessions Access</h1>
                       <Row>
                       <Form onSubmit={this.handleSessCreate}>
                         <Card style={{ width: '22rem' }}>
                           <Card.Img variant="top" src={require ("./newSess.png")} />
                           <Card.Body>
                             <Card.Title><h2>Create a Session from Raw Data</h2></Card.Title>
                             <Card.Text>
                              Create a Session based on a csv document containing Raw data, and providing the User ID it will related to.
                             </Card.Text>
                             <Button variant="primary" type="submit">Go</Button>
                           </Card.Body>
                         </Card>
                         </Form>
                         <Form onSubmit={this.handleAllSubmit}>
                           <Card style={{ width: '22rem' }}>
                             <Card.Img variant="top" src={require ("./listAllSess.png")} />
                             <Card.Body>
                               <Card.Title><h2>List all the Sessions of a single User</h2></Card.Title>
                               <Card.Text>
                                 List all the sessions and their basic information of a single User providing their ID.
                               </Card.Text>
                               <Button variant="primary" type="submit">Go</Button>
                             </Card.Body>
                           </Card>
                           </Form>
                           <Form onSubmit={this.handleSessSubmit}>
                           <Card style={{ width: '22rem' }}>
                             <Card.Img variant="top" src={require ("./sessId.png")} />
                             <Card.Body>
                               <Card.Title><h2>Show data and predictions of a Session</h2></Card.Title>
                               <Card.Text>
                                 Show all the session data and the recommended course of treatment given certain parameters.
                               </Card.Text>
                               <Button variant="primary" type="submit">Go</Button>
                             </Card.Body>
                           </Card>
                           </Form>

                          </Row>
                         </Container>
                </div>
            </div>
        );
    }
}

export default UiSessions;