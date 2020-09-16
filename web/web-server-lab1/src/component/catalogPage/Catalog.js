
import React, {Component} from 'react';
import {getAllBooks} from '../../action_creator/bookCreator';
import {connect} from "react-redux";

class Catalog extends Component{

    componentDidMount(){
        this.props.getBook("http://localhost:8080/book/all");
       // console.log(this.props.books.getBook.idBook);
    }

    render(){
    return this.props.books.getBook.map((item, key) =>{
    return <div><img src = "D:\Project\Lab1Architecture\imageBook\esenin.jpg"></img></div>
    });
    }
}
const  mapStateToProps  = state => {
    return {
        books: state.bookReduser
        };
};
const  mapDispatchToProps = dispatch =>{
    return {
        getBook: url => dispatch(getAllBooks(url))
    };
};

export default connect(mapStateToProps,mapDispatchToProps)(Catalog)
