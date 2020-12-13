import Head from "next/head";
import React from "react";
import CommonHead from "./commons/head";
import CommonHeader from "./commons/header";
import CommonNav from "./commons/nav";
import CommonFooter from "./commons/footer";
import UIkit from 'uikit';
import Icons from 'uikit/dist/js/uikit-icons';
import { IconContext } from "react-icons";
import { FaUserShield, FaGlobe, FaUsers } from 'react-icons/fa';

UIkit.use(Icons);


// MinesO - 利用サービス一覧管理

class TopPage extends React.Component {

    validate(e) {
        // e.preventDefault(); 
        // if ($this.input.length) { 
        //     var type = $this.input.attr('type'); 
        //     $this.input.attr('type', type == 'text' ? 'password' : 'text'); 
        //     $this.element.html($this.options[type == 'text' ? 'lblShow' : 'lblHide']); 
        // }
    }

    render() {
        return (
            <IconContext.Provider value={{ style: { fontSize: '5em' } }}>
            <div>
                <CommonHead />
                <Head>
                    <title>MinesO - 利用サービス一覧管理</title>
                    <link rel="stylesheet" type="text/css" href="/css/top_polygon.css" />
                    
                    {/* <script src="https://kit.fontawesome.com/847439d77f.js" crossOrigin="anonymous"></script> */}
                </Head>
                <CommonHeader />
                <section id="polygonsection" className="uk-section">
                    <div className="uk-position-center">
                        <h1 className="uk-heading-xlarge poiretone">MinesO</h1>
                        <span className="uk-h5 uk-display-block uk-text-center uk-margin-remove-vertical">利用サービス一覧管理</span>
                    </div>
                    <a className="uk-button uk-button-primary uk-position-center" href="#modal-sections" data-uk-toggle>サインイン</a>
                    <div id="polygonback" className="uk-position-center">
                        <div className='wrap'><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div><div className='c'></div></div>
                    </div>
                </section>
                <section className="uk-section uk-section-muted uk-position-relative">
                    <div className="uk-container uk-container-xsmall uk-text-center">
                        <h2>ひとこと</h2>
                        <p>あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもらりるれろやゆよわをん一にさん金欲しいわーーーん</p>
                        <p>あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもらりるれろやゆよわをん一にさん金欲しいわーーーん</p>
                        <p>あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもらりるれろやゆよわをん一にさん金欲しいわーーーん</p>
                        <p>あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもらりるれろやゆよわをん一にさん金欲しいわーーーん</p>
                        <p>あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもらりるれろやゆよわをん一にさん金欲しいわーーーん</p>
                    </div>
                </section>
                <section className="uk-section uk-section-small uk-section-primary">
                    <div className="uk-container uk-container-small uk-position-relative">
                        <h2 className="uk-text-center">機能</h2>
                        <div uk-slideshow="animation: scroll">
                            <div className="uk-position-relative uk-visible-toggle uk-light">
                                <ul className="uk-slideshow-items" uk-height-viewport="min-height: 500">
                                    <li>
                                        <div className="uk-position-center">
                                            <h3>test1</h3>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <button className="uk-button uk-button-primary">Button</button>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="uk-position-center">
                                            <h3>test2</h3>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <button className="uk-button uk-button-primary">Button</button>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="uk-position-center">
                                            <h3>test3</h3>
                                            <p>Lorem <a href="#">ipsum dolor</a> sit amet, consetetur sadipscing elitr,<br />sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.</p>
                                            <button className="uk-button uk-button-primary">Button</button>
                                        </div>
                                    </li>
                                </ul>
                                <a className="uk-position-center-left uk-position-small uk-hidden-hover" href="#" data-uk-slidenav-previous data-uk-slideshow-item="previous"></a>
                                <a className="uk-position-center-right uk-position-small uk-hidden-hover" href="#" data-uk-slidenav-next data-uk-slideshow-item="next"></a>
                            </div>
                            <ul className="uk-slideshow-nav uk-dotnav uk-flex-center uk-margin"></ul>
                        </div>
                    </div>
                </section>
                <section className="uk-section uk-section-small uk-section-default">
                    <div className="uk-container uk-container-small">
                        <h2 className="uk-text-center">特徴</h2>
                        <div className="uk-grid-column-small uk-grid-row-large uk-text-center" data-uk-grid>
                            <div className="uk-padding uk-width-1-3@m">
                                {/* <i className="fas fa-user-shield fa-5x"></i> */}
                                <FaUserShield />  
                                <h2>大切なユーザー情報をお守りします</h2>
                                <p>このアプリは重要な情報は保存しません。例えハッキングをされたとしても被害は最小限に抑えられます。もちろん製作者に情報収集の意図はございません。</p>
                            </div>
                            <div className="uk-padding uk-width-1-3@m">
                                {/* <i className="fas fa-globe fa-5x"></i> */}
                                <FaGlobe />
                                <h2>国際化対応</h2>
                                <p>このアプリは国際化に対応しています。様々な国のユーザーが使用しています。そのため様々な国のユーザーが使用しているサービスを知ることができます</p>
                            </div>
                            <div className="uk-padding uk-width-1-3@m">
                                <i className="fas fa-users fa-5x"></i>
                                <FaUsers />
                                <h2>コミュニティ</h2>
                                <p>このアプリはユーザー同士でつながりを作ることができます。フォロー、タグ、snsで共通の仲間を見つけることができます</p>
                            </div>
                        </div>
                    </div>
                </section>
                <a className="uk-position-bottom-right uk-position-fixed uk-padding-small" onClick={() => scrollTo(0, 0)} data-uk-scroll><i className="uk-text-muted fas fa-chevron-circle-up fa-3x"></i></a>
                <CommonNav />
                <CommonFooter />


                <div id="modal-sections" data-uk-modal>
                    <div className="uk-modal-dialog" data-uk-overflow-auto>
                        <button className="uk-modal-close-default" type="button" data-uk-close></button>
                        <div className="uk-modal-body">
                            <ul className="uk-child-width-expand" data-uk-tab>
                                <li className="uk-active"><a href="">サインイン</a></li>
                                <li><a href="">サインアップ</a></li>
                            </ul>
                            <ul className="uk-switcher">
                                <li>
                                    <div className="uk-margin">
                                        <form className="uk-form">
                                            <label className="uk-form-label" htmlFor="form-stacked-text">メールアドレス</label>
                                            <div className="uk-form-controls">
                                                <div className="uk-inline">
                                                    <span className="uk-form-icon" data-uk-icon="icon: user"></span>
                                                    <input className="uk-input" type="text" placeholder="user.example@test.com" />
                                                </div>
                                            </div>
                                            <label className="uk-form-label" htmlFor="form-stacked-text">パスワード</label>
                                            <div className="uk-form-controls">
                                                <div className="uk-inline">
                                                    <span className="uk-form-icon" data-uk-icon="icon: lock"></span>
                                                    <div className="uk-form-password">
                                                        <input className="uk-input" type="password" placeholder="********" />
                                                        <i className="fas fa-eye"></i>
                                                        <i className="fas fa-eye-slash"></i>
                                                        <a href="#" className="uk-form-password-toggle" onClick={(e)=>this.validate(e)} data-uk-form-password>...</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                    <button className="uk-button uk-button-default uk-modal-close" type="button">Cancel</button>
                                    <button className="uk-button uk-button-primary" type="button">Save</button>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            </IconContext.Provider>
        );
    }
}


export default TopPage;