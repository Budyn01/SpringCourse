import React from "react";

const ErrorInfo = (props) => {
    return (
        <div hidden={!props.error} className="alert alert-danger" role="alert" style={{marginBottom: 26}}>
            <strong>Oh snap!</strong> {props.error}
        </div>
    )
};

export default ErrorInfo;