
import React, {Component} from 'react';
import getAllBooks from '../../action_creator/bookCreator.js';
import {connect} from "react-redux";

class Catalog extends Component{

    constructor(props){
        super(props);
        this.state = {};
    }

    componentDidMount(){
        this.props.getAllBook("http://localhost:8080/all");
        console.log(this.props.books);
    }

    render(){
        return (<div>Каталог с книгами</div>);
    }
}
const  mapStateToProps  = state => {
    return {
        books: state.rootReduser.bookReduser
    };
};
const  mapDispatchToProps = dispatch =>{
    return {
        getAllBook: url => dispatch(getAllBooks(url))
    };
};

export default connect(mapStateToProps,mapDispatchToProps)(Catalog)
