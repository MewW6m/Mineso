import React from "react";

class CommonHeader extends React.Component {
    render(){
        return (
            <div>
                <div uk-sticky="media: 0" className="uk-navbar-container tm-navbar-container uk-sticky uk-sticky-fixed">
                    <div className="uk-container uk-container-expand">
                        <nav className="uk-navbar">
                            <div className="uk-navbar-left">
                                <a href="../" className="uk-navbar-item uk-logo uk-grid-column-small">
                                    <img src="/img/logo.png" style={{height:"30px"}} />
                                    <span className="poiretone">MinesO </span>
                                    <span className="uk-text-small">~ SNS共有・管理サービス ~</span>
                                </a>
                            </div>
                            <div className="uk-navbar-right">
                                <a href="" uk-icon="icon: menu" uk-toggle="target: #offcanvas-push"></a>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        );
    }
}


export default CommonHeader;