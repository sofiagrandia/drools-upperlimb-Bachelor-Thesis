import React, { Component } from 'react';
import { withRouter } from 'react-router-dom';

class Redir extends Component {
    render() {
        return (
            <div style={{ display: 'flex', justifyContent: 'center', padding: 30 }}>
                <div><h2>Redirect Page</h2></div>
            </div>
        );
    }
}

export default Redir;