import React, {Component} from 'react';
import HeaderPage from './component/headerPage/HeaderPage.js';
import Catalog from './component/catalogPage/Catalog.js';
import { BrowserRouter as Router, Route, Switch} from "react-router-dom";
import {Provider} from "react-redux";
import configStore from "./stores/configStore.js";

import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';

class App extends Component {
  render() {
    return( <div> <Provider store={configStore}>
             <HeaderPage/>
             <div>
              <Router>
                 <Switch>
                  <Route path = "/catalog" component = {Catalog} ></Route>
                </Switch>
              </Router>
              </div>
              </Provider>
          </div>
          );}
}

export default App

