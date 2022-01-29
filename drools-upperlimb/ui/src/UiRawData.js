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

class UiRawData extends Component {

    constructor(props) {
        super(props);
        this.state = {value: ''};
        this.handleChange = this.handleChange.bind(this);
        this.handleCreateSubmit = this.handleAllSubmit.bind(this);
        this.handleListSubmit = this.handleSessSubmit.bind(this);
      }
    handleAllSubmit(event) {
        window.open("http://localhost:9000/data");
        }
    handleSessSubmit(event) {
        window.open("http://localhost:9000/data/search");
        }
      handleChange(event) {
        this.setState({value: event.target.value});
          }
    render() {
        return (
            <div style={{ display: 'flex', justifyContent: 'center', padding: 30 }}>
                <div className="lander mt-0" style={{ display: 'flex', justifyContent: 'center'}} >



                   <Container>
                   <h1>Raw Data Access</h1>
                       <Row>
                         <Form onSubmit={this.handleAllSubmit}>
                           <Card style={{ width: '25rem' }}>
                             <Card.Img variant="top" src={require ("./AllData.png")} />
                             <Card.Body>
                               <Card.Title><h2>List All Raw Data in Database</h2></Card.Title>
                               <Card.Text>
                                 List all the raw data that is stored in the database.
                               </Card.Text>
                               <Button variant="primary" type="submit">Go</Button>
                             </Card.Body>
                           </Card>
                           </Form>
                           <Form onSubmit={this.handleSessSubmit}>
                           <Card style={{ width: '25rem' }}>
                             <Card.Img variant="top" src={require ("./IdData.png")} />
                             <Card.Body>
                               <Card.Title><h2>List Specific Session Raw Data</h2></Card.Title>
                               <Card.Text>
                                 List all the raw data from a session given its ID.
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

export default UiRawData;