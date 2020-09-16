import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App.js';
import * as serviceWorker from './serviceWorker';

const AppPage = document.getElementById('root');
const app =(<App/>);

ReactDOM.render(app, AppPage);
serviceWorker.unregister();
