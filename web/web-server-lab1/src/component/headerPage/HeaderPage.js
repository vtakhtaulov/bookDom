import  React, {Component} from "react";
import {  Navbar, Nav } from 'react-bootstrap'

export default class HeaderPage extends Component{

    constructor(props){
        super(props);
        this.reference = this.reference.bind(this);
    }
    reference(){
        return(<Nav className="mr-auto">
                    <Nav.Link href="catalog">Каталог</Nav.Link>
                    <Nav.Link href="author">Авторы</Nav.Link>
                </Nav>);
    }
    
    render() {
        return (
            <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
                <Nav className="mr-auto">
                    {this.reference(this)}
                </Nav>
            </Navbar>
        );
    }
}