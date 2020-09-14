import getBook from '../../action_creator/bookCreator.js';
import {combineReducers} from "redux";

const bookReduser = combineReducers({
  getBook: getBook
});

export default bookReduser;