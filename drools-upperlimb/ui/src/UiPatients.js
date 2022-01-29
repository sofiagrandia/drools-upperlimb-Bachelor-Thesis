import React, { Component } from 'react';
import { withRouter } from 'react-router-dom';
import Card from 'react-bootstrap/Card'
import { Button } from 'react-bootstrap';
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import Form from 'react-bootstrap/Form'
import "./UiPatients.css";

class UiPatients extends Component {

    constructor(props) {
        super(props);
        this.state = {value: ''};
        this.handleChange = this.handleChange.bind(this);
        this.handleCreateSubmit = this.handleCreateSubmit.bind(this);
        this.handleListSubmit = this.handleListSubmit.bind(this);
        this.handleShowSubmit = this.handleShowSubmit.bind(this);
      }
    handleCreateSubmit(event) {
        window.open("http://localhost:9000/patients/template?type=new");
        }
    handleListSubmit(event) {
        window.open("http://localhost:9000/patients");
        }
    handleShowSubmit(event) {
        window.open("http://localhost:9000/patients/template?type=search");
        }

    handleChange(event) {
        this.setState({value: event.target.value});
          }
    render() {
        return (
            <div className="Patients mt-0" style={{ display: 'flex', justifyContent: 'center', padding: 30 }}>
                <div className="lander mt-0" style={{ display: 'flex', justifyContent: 'center'}} >
                    <Container>
                     <h1>Patient Information Access</h1>
                        <Row>
                        <Form onSubmit={this.handleCreateSubmit}>
                            <Card style={{ width: '18rem' , height: '33.16rem', justifyContent:'center' }}>
                              <Card.Img variant="top" src={require ("./create.png")} />
                              <Card.Body>
                                <Card.Title><h2>Insert a New Patient </h2></Card.Title>
                                <Card.Text>
                                  Create a new patient with their corresponding information.
                                </Card.Text>
                                <Button class="align-self-end" variant="primary" type = "submit">Go</Button>
                              </Card.Body>
                            </Card>
                        </Form>
                        <Form onSubmit={this.handleShowSubmit}>
                         <Card style={{ width: '18rem', height: '33.16rem',  justifyContent:'center' }}>
                          <Card.Img variant="top" src={require ("./showPatient.png")} />
                          <Card.Body>
                            <Card.Title><h2>Manage Patient Information</h2></Card.Title>
                            <Card.Text>
                              Show, edit or delete the information of a single patient corresponding to the given ID
                            </Card.Text>
                            <Button class="align-self-end" variant="primary" type = "submit">Go</Button>
                          </Card.Body>
                        </Card>
                        </Form>

                        <Form onSubmit={this.handleListSubmit}>
                         <Card style={{ width: '18rem', height: '33.16rem', justifyContent:'center' }}>
                          <Card.Img variant="top" src={require ("./listPatients.png")} />
                          <Card.Body>
                            <Card.Title><h2>List All Patients in Database</h2></Card.Title>
                            <Card.Text>
                              List all patients and their information stored in the database.
                            </Card.Text>
                            <Button class="align-self-end" variant="primary" type= "submit">Go</Button>
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

export default UiPatients;