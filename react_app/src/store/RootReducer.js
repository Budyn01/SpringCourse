import { combineReducers } from 'redux';
import sessionReducer from './reducers/Session';

const rootReducer = combineReducers({
    sessionState: sessionReducer
});

export default rootReducer;