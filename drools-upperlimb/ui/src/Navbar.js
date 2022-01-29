import React from 'react';
import './Navbar.css';
import { Navbar, Nav, Form, Button } from 'react-bootstrap';
import { withRouter } from 'react-router-dom';

const Navigation = (props) => {
    const { location } = props;
    return (
        <Navbar className="mb-0" bg="light" variant="light">
            <Navbar.Brand href="#home" >
                <img
                  alt=""
                  src={require ("./exoLogo.png")}
                  width="50"
                  height="auto"
                  className="d-inline-block align-top"
                />{' '}
            </Navbar.Brand>
            <Nav activeKey={location.pathname} variant = "pills" bg="light" text="dark" className="ml-3">
                <Nav.Link href="/">Home</Nav.Link>
                <Nav.Link href="/about">About</Nav.Link>
                <Nav.Link href="/patientsUi">Patients</Nav.Link>
                <Nav.Link href="/sessionsUi">Sessions</Nav.Link>
                <Nav.Link href="/rawDataUi">Raw Data</Nav.Link>
            </Nav>
        </Navbar>
    )
}

export default withRouter(Navigation);

