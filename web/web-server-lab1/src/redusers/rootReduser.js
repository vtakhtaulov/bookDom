import { combineReducers } from 'redux';
import bookReduser from './bookReduser/bookReduser.js';

const rootReduser = combineReducers({
    bookReduser: bookReduser
});
export default rootReduser