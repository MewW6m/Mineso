import React from "react";
import { defaultCipherList } from "constants";

class CommonFooter extends React.Component {
    render(){
        return (
            <div className="uk-section-small uk-background-secondary uk-padding-remove-vertical">
                <div className="uk-container uk-container-xsmall uk-text-center uk-position-relative">
                    <ul data-uk-margin="" className="uk-subnav tm-subnav uk-flex-inline uk-flex-center uk-margin-remove-bottom">
                        <li className="uk-first-column"><span>Version
                            <span data-uikit-version="">0.1.1</span></span></li>
                        <li>
                            <a href="https://github.com/uikit/uikit/stargazers">
                                <span data-uk-icon="icon: users;" className="uk-margin-small-right uk-icon"></span>
                                <span data-uikit-stargazers="">15385</span> Users
                            </a>
                        </li>
                        <li>
                            <a href="https://github.com/MewW6m/MinesO" className="uk-text-lowercase">
                                <span data-uk-icon="icon: github;" className="uk-margin-small-right uk-icon"></span>@MewW6m
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        );
    }
}

export default CommonFooter;