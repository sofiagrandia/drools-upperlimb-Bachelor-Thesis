import React, { Component } from "react";
import { Button } from 'react-bootstrap';
import Carousel from 'react-bootstrap/Carousel';
import Container from 'react-bootstrap/Container';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
import history from './history';
import "./HomePage.css";

export default class HomePage extends Component {
  render() {
    return (
      <div className="HomePage mt-0">
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
                    <h1>Welcome!</h1>
                    <p>Welcome to the Upper-Limb Exoskeleton Rehabilitation App.</p>
                    <p>You can use the tabs above to browse the different functionalities.</p>
                    <p>Click on the About tab to discover how the app works</p>
                </Col>

              </Row>
            </Container>
          <Carousel variant="dark">
            <Carousel.Item>
              <img
                className="d-block w-100"
                height={400}
                width={1200}
                src={require ("./stock4.jpg")}
                alt="First slide"
              />
              <Carousel.Caption>
                <h5>Cerebral Palsy</h5>
                <p>Group of disorders that affect a person’s ability to move and maintain balance and posture..</p>
              </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item>
              <img
                className="d-block w-100"
                height={400}
                width={1200}
                src={require ("./stock7.png")}
                alt="Second slide"
              />
              <Carousel.Caption>
                <h5>Childhood</h5>
                <p>About 1 in 345 children has been identified to suffer from CP, making it the most common motor disability of childhood.</p>
              </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item>
              <img
                className="d-block w-100"
                height={400}
                width={1200}
                src={require ("./exo.png")}
                alt="Third slide"
              />
              <Carousel.Caption>
                <h5>Therapy and Rehabilitation</h5>
                <p>Through intensive therapy, individuals with cerebral palsy can promote neuroplasticity and improve their motor functions..</p>
              </Carousel.Caption>
            </Carousel.Item>
          </Carousel>
        </div>
      </div>
    );
  }
}