import React from 'react';
import HelloWorld from './HelloWorld';
import './App.css';
import { Button } from 'react-bootstrap';
import Routes from './Routes';
import history from './history';
import Navigation from './Navbar';

function App() {
  return (
    <div className="App">
      <Navigation />
      <Routes />
    </div>
  );
}

export default App;