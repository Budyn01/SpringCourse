import * as firebase from 'firebase';

const config = {
    apiKey: "AIzaSyDJdboGtvVgbnly-5GgxdwvM-fIRY_VSZc",
    authDomain: "itp-esr.firebaseapp.com",
    databaseURL: "https://itp-esr.firebaseio.com",
    projectId: "itp-esr",
    storageBucket: "itp-esr.appspot.com",
    messagingSenderId: "182010866537"
};

if(!firebase.apps.length) {
    firebase.initializeApp(config);
}

const auth = firebase.auth();
const db = firebase.database();

export {
    auth,
    db,
};