import React from "react";

class CommonNav extends React.Component {
    render(){
        return (
            <div id="offcanvas-push" uk-offcanvas="mode: push; overlay: true; flip: true">
                <div className="uk-offcanvas-bar">
                    <button className="uk-offcanvas-close" type="button" uk-close></button>
                    <h3>Title</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                </div>
            </div>
        );
    }
}

export default CommonNav;