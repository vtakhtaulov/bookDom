import {getBook} from '../../action/bookAction.js';
import {combineReducers} from "redux";

const bookReduser = combineReducers({
  getBook: getBook
});

export default bookReduser;