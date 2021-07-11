import React from 'react';
import {Navbar, Nav} from "react-bootstrap";
import {Link} from "react-router-dom";

class NavigationBar extends React.Component{
    render() {
        return (
            <Navbar bg="dark" variant="dark">
                <Link to={""} className="navbar-brand">
                    Book Shop Here
                </Link>
                {/*<Navbar.Brand href="#home">Page Name here</Navbar.Brand>*/}
                {/*<Nav className="mr-auto">*/}
                {/*    <Nav.Link href="#">Add Book</Nav.Link>*/}
                {/*    <Nav.Link href="#">Book List</Nav.Link>*/}
                {/*</Nav>*/}
                <Nav className="mr-auto">
                    <Link to={"/add"} className="nav-link">Add Book</Link>
                    <Link to={"/list"} className="nav-link">Book List</Link>
                </Nav>
            </Navbar>
        );
    }
}

export default NavigationBar;