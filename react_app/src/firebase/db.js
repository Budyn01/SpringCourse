import {db} from './firebase';

export const doCreateUser = (id, user = {}) => {
    console.log(...user);
    return db.ref(`users/${id}`).set({
        ...user
    });
};
