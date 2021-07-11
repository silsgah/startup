import React from 'react'
import {Col, Jumbotron} from "react-bootstrap";

class Welcome extends React.Component{
    render() {
        return (
            <Jumbotron className="bg-dark text-white">
                <h1>Welcome to the book shop</h1>
                <p>
                    This is a simple hero unit, a simple jumbotron-style component for calling
                    extra attention to featured content or information.
                </p>
            </Jumbotron>
        )
    }
}

export default Welcome;