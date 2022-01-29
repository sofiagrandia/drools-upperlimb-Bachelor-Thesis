import React from 'react';
import { Button } from 'react-bootstrap';
import history from './history';

const HelloWorld = () => {

  function sayHello() {
    alert('Hello, World!');
  }

  return (
    <form>
        <Button variant="btn btn-success" onClick={() => history.push('/Redirect')}>Click button to redirect</Button>
    </form>
  );
};

export default HelloWorld;
