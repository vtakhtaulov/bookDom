
import React, {Component} from 'react';
import {getAllBooks} from '../../action_creator/bookCreator';
import {connect} from "react-redux";
import  "./catalog.css";


class Catalog extends Component{

    componentDidMount(){
        this.props.getBook("http://localhost:8080/book/all");
    }

    render(){
    return this.props.books.getBook.map((item, key) =>{
        let NewImg = new Image ();
        NewImg.src = "./images/"+ item.image.toString();
        console.log("./images/"+ item.image.toString());
    return <div key={key}>
                <form className="form_css">
                    <img src={"./images/"+ item.image.toString()} alt = "" className="book_image" />
                    <br/>
                    <span>{item.nameBook}</span>
                </form>
            </div>
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
