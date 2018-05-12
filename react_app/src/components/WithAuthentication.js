import React, {Component} from 'react';
import {firebase} from '../firebase'
import {connect} from 'react-redux';

const withAuthentication = (Component) => {
    class WithAuthentication extends Component {

        componentDidMount() {
            const {onSetAuthUser} = this.props;

            firebase.auth.onAuthStateChanged(authUser => {
                authUser
                    ? onSetAuthUser(authUser)
                    : onSetAuthUser(null);
            });
        }

        render() {
            return (
                <Component/>
            )
        }
    }

    const mapDispatchToProps = (dispatch) => ({
        onSetAuthUser: (authUser) => dispatch({type: 'AUTH_USER_SET', authUser})
    });

    const mapStateToProps = (state) => ({
        authUser: state.sessionState.authUser
    });

    return connect(mapStateToProps, mapDispatchToProps)(WithAuthentication);
};


export default withAuthentication;

