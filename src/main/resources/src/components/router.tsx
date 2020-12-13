import React from "react";
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Index from "./pages/index";

class Routers extends React.Component {   
    render() {
        return (
            <BrowserRouter>
                <Switch>
                    <Route path="/" exact children={<Index />} />
                    <Route path="/about" exact children={<Index />} />
                    <Route path="/app/" exact children={<Index />} />
                    <Route path="/@:userid" exact children={<Index />} />
                    <Route path="/@:userid/edit" exact children={<Index />} />
                    <Route path="/@:userid/:aname/edit" exact children={<Index />} />
                    <Route path="/@:userid/follow" exact children={<Index />} />
                    <Route path="/@:userid/follower" exact children={<Index />} />
                    <Route path="/app/:aname" exact children={<Index />} />
                    <Route path="/app/:aname/edit" exact children={<Index />} />
                    <Route path="/nortification/:nid" exact children={<Index />} />
                    <Route path="/settings/profile" exact children={<Index />} />
                    <Route path="/settings/account" exact children={<Index />} />
                    <Route path="/settings/nortification" exact children={<Index />} />
                    <Route path="/settings/customize" exact children={<Index />} />
                    <Route path="/help" exact children={<Index />} />
                    <Route path="/terms" exact children={<Index />} />
                    <Route path="/privacy" exact children={<Index />} />
                    <Route path="/opinion" exact children={<Index />} />
                    <Route path="*" children={<Index />} />
                </Switch>
            </BrowserRouter>
        )
    }
}