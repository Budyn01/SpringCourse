import React from "react";
import PropTypes from "prop-types";


const Header = (props) => {
    return (
        <div className="text-center mb-4">
            <img className="mb-4"
                 src={props.image}
                 width="72" height="72"/>
            <h1 className="h3 mb-3 font-weight-normal">{props.title}</h1>
            <p>{props.subtitle}</p>
        </div>
    )
};

Header.propTypes = {
    title: PropTypes.string,
    subtitle: PropTypes.oneOfType([PropTypes.string, PropTypes.object]),
    image: PropTypes.string,
};

Header.defaultProps = {
    title: "Elektroniczny System Rejestracji",
    subtitle: <span>Witamy w systemie rejestracji firm na <a href="https://caniuse.com/#feat=css-placeholder-shown\">Link do strony</a></span>,
    image: "http://via.placeholder.com/100x100",
};

export default Header;