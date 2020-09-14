import React, {Component} from 'react';
import HeaderPage from './component/headerPage/HeaderPage.js';
import Catalog from './component/catalogPage/Catalog.js';
import { BrowserRouter as Router, Route, Switch} from "react-router-dom";
import {connect} from "react-redux";

import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {};
}

  render() {
    return( <div>
             <HeaderPage/>
             <div>
              <Router>
                 <Switch>
                  <Route path = "/catalog" component = {Catalog} ></Route>
                </Switch>
              </Router>
              </div>
          </div>
          );}
}
const  mapStateToProps  = state => {
  return {
    user_inf: null
  };
};
const  mapDispatchToProps = dispatch =>{
    return {
        RefStatus: null
    };
};
export default connect(mapStateToProps,mapDispatchToProps)(App);

