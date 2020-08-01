module.exports =
/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = require('../../../ssr-module-cache.js');
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		var threw = true;
/******/ 		try {
/******/ 			modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/ 			threw = false;
/******/ 		} finally {
/******/ 			if(threw) delete installedModules[moduleId];
/******/ 		}
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 1);
/******/ })
/************************************************************************/
/******/ ({

/***/ "0tsZ":
/***/ (function(module, exports) {

module.exports = require("uikit/dist/js/uikit-icons");

/***/ }),

/***/ 1:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("woae");


/***/ }),

/***/ "MhC/":
/***/ (function(module, exports) {

module.exports = require("uikit");

/***/ }),

/***/ "cDcd":
/***/ (function(module, exports) {

module.exports = require("react");

/***/ }),

/***/ "woae":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
// ESM COMPAT FLAG
__webpack_require__.r(__webpack_exports__);

// EXTERNAL MODULE: external "next/head"
var head_ = __webpack_require__("xnum");
var head_default = /*#__PURE__*/__webpack_require__.n(head_);

// EXTERNAL MODULE: external "react"
var external_react_ = __webpack_require__("cDcd");
var external_react_default = /*#__PURE__*/__webpack_require__.n(external_react_);

// CONCATENATED MODULE: ./components/common_head.tsx
var __jsx = external_react_default.a.createElement;



class common_head_CommonHead extends external_react_default.a.Component {
  render() {
    return __jsx("div", null, __jsx(head_default.a, null, __jsx("meta", {
      charSet: "UTF-8"
    }), __jsx("meta", {
      name: "viewport",
      content: "width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"
    }), __jsx("link", {
      rel: "shortcut icon",
      href: "/img/logo.png"
    }), __jsx("link", {
      rel: "stylesheet",
      type: "text/css",
      href: "/css/base.css"
    }), __jsx("link", {
      href: "https://fonts.googleapis.com/css?family=Poiret+One&display=swap",
      rel: "stylesheet"
    })));
  }

}

/* harmony default export */ var common_head = (common_head_CommonHead);
// CONCATENATED MODULE: ./components/common_header.tsx
var common_header_jsx = external_react_default.a.createElement;


class common_header_CommonHeader extends external_react_default.a.Component {
  render() {
    return common_header_jsx("div", null, common_header_jsx("div", {
      "uk-sticky": "media: 0",
      className: "uk-navbar-container tm-navbar-container uk-sticky uk-sticky-fixed"
    }, common_header_jsx("div", {
      className: "uk-container uk-container-expand"
    }, common_header_jsx("nav", {
      className: "uk-navbar"
    }, common_header_jsx("div", {
      className: "uk-navbar-left"
    }, common_header_jsx("a", {
      href: "../",
      className: "uk-navbar-item uk-logo uk-grid-column-small"
    }, common_header_jsx("img", {
      src: "/img/logo.png",
      style: {
        height: "30px"
      }
    }), common_header_jsx("span", {
      className: "poiretone"
    }, "MinesO "), common_header_jsx("span", {
      className: "uk-text-small"
    }, "~ SNS\u5171\u6709\u30FB\u7BA1\u7406\u30B5\u30FC\u30D3\u30B9 ~"))), common_header_jsx("div", {
      className: "uk-navbar-right"
    }, common_header_jsx("a", {
      href: "",
      "uk-icon": "icon: menu",
      "uk-toggle": "target: #offcanvas-push"
    }))))));
  }

}

/* harmony default export */ var common_header = (common_header_CommonHeader);
// CONCATENATED MODULE: ./components/common_nav.tsx
var common_nav_jsx = external_react_default.a.createElement;


class common_nav_CommonNav extends external_react_default.a.Component {
  render() {
    return common_nav_jsx("div", {
      id: "offcanvas-push",
      "uk-offcanvas": "mode: push; overlay: true; flip: true"
    }, common_nav_jsx("div", {
      className: "uk-offcanvas-bar"
    }, common_nav_jsx("button", {
      className: "uk-offcanvas-close",
      type: "button",
      "uk-close": true
    }), common_nav_jsx("h3", null, "Title"), common_nav_jsx("p", null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")));
  }

}

/* harmony default export */ var common_nav = (common_nav_CommonNav);
// CONCATENATED MODULE: ./components/common_footer.tsx
var common_footer_jsx = external_react_default.a.createElement;


class common_footer_CommonFooter extends external_react_default.a.Component {
  render() {
    return common_footer_jsx("div", {
      className: "uk-section-small uk-background-secondary uk-padding-remove-vertical"
    }, common_footer_jsx("div", {
      className: "uk-container uk-container-xsmall uk-text-center uk-position-relative"
    }, common_footer_jsx("ul", {
      "data-uk-margin": "",
      className: "uk-subnav tm-subnav uk-flex-inline uk-flex-center uk-margin-remove-bottom"
    }, common_footer_jsx("li", {
      className: "uk-first-column"
    }, common_footer_jsx("span", null, "Version", common_footer_jsx("span", {
      "data-uikit-version": ""
    }, "0.1.1"))), common_footer_jsx("li", null, common_footer_jsx("a", {
      href: "https://github.com/uikit/uikit/stargazers"
    }, common_footer_jsx("span", {
      "data-uk-icon": "icon: users;",
      className: "uk-margin-small-right uk-icon"
    }), common_footer_jsx("span", {
      "data-uikit-stargazers": ""
    }, "15385"), " Users")), common_footer_jsx("li", null, common_footer_jsx("a", {
      href: "https://github.com/MewW6m/MinesO",
      className: "uk-text-lowercase"
    }, common_footer_jsx("span", {
      "data-uk-icon": "icon: github;",
      className: "uk-margin-small-right uk-icon"
    }), "@MewW6m")))));
  }

}

/* harmony default export */ var common_footer = (common_footer_CommonFooter);
// EXTERNAL MODULE: external "uikit"
var external_uikit_ = __webpack_require__("MhC/");
var external_uikit_default = /*#__PURE__*/__webpack_require__.n(external_uikit_);

// EXTERNAL MODULE: external "uikit/dist/js/uikit-icons"
var uikit_icons_ = __webpack_require__("0tsZ");
var uikit_icons_default = /*#__PURE__*/__webpack_require__.n(uikit_icons_);

// CONCATENATED MODULE: ./pages/top.tsx
var top_jsx = external_react_default.a.createElement;







 // MinesO - 利用サービス一覧管理

class top_TopPage extends external_react_default.a.Component {
  validate(e) {// e.preventDefault(); 
    // if ($this.input.length) { 
    //     var type = $this.input.attr('type'); 
    //     $this.input.attr('type', type == 'text' ? 'password' : 'text'); 
    //     $this.element.html($this.options[type == 'text' ? 'lblShow' : 'lblHide']); 
    // }
  }

  render() {
    // loads the Icon plugin
    external_uikit_default.a.use(uikit_icons_default.a);
    external_uikit_default.a.notification('Hello world.');
    return top_jsx("div", null, top_jsx(common_head, null), top_jsx(head_default.a, null, top_jsx("title", null, "MinesO - \u5229\u7528\u30B5\u30FC\u30D3\u30B9\u4E00\u89A7\u7BA1\u7406"), top_jsx("link", {
      rel: "stylesheet",
      type: "text/css",
      href: "/css/top_polygon.css"
    })), top_jsx(common_header, null), top_jsx("section", {
      id: "polygonsection",
      className: "uk-section"
    }, top_jsx("div", {
      className: "uk-position-center"
    }, top_jsx("h1", {
      className: "uk-heading-xlarge poiretone"
    }, "MinesO"), top_jsx("span", {
      className: "uk-h5 uk-display-block uk-text-center uk-margin-remove-vertical"
    }, "\u5229\u7528\u30B5\u30FC\u30D3\u30B9\u4E00\u89A7\u7BA1\u7406")), top_jsx("a", {
      className: "uk-button uk-button-primary uk-position-center",
      href: "#modal-sections",
      "data-uk-toggle": true
    }, "\u30B5\u30A4\u30F3\u30A4\u30F3"), top_jsx("div", {
      id: "polygonback",
      className: "uk-position-center"
    }, top_jsx("div", {
      className: "wrap"
    }, top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    }), top_jsx("div", {
      className: "c"
    })))), top_jsx("section", {
      className: "uk-section uk-section-muted uk-position-relative"
    }, top_jsx("div", {
      className: "uk-container uk-container-xsmall uk-text-center"
    }, top_jsx("h2", null, "\u3072\u3068\u3053\u3068"), top_jsx("p", null, "\u3042\u3044\u3046\u3048\u304A\u304B\u304D\u304F\u3051\u3053\u3055\u3057\u3059\u305B\u305D\u305F\u3061\u3064\u3066\u3068\u306A\u306B\u306C\u306D\u306E\u306F\u3072\u3075\u3078\u307B\u307E\u307F\u3080\u3081\u3082\u3089\u308A\u308B\u308C\u308D\u3084\u3086\u3088\u308F\u3092\u3093\u4E00\u306B\u3055\u3093\u91D1\u6B32\u3057\u3044\u308F\u30FC\u30FC\u30FC\u3093"), top_jsx("p", null, "\u3042\u3044\u3046\u3048\u304A\u304B\u304D\u304F\u3051\u3053\u3055\u3057\u3059\u305B\u305D\u305F\u3061\u3064\u3066\u3068\u306A\u306B\u306C\u306D\u306E\u306F\u3072\u3075\u3078\u307B\u307E\u307F\u3080\u3081\u3082\u3089\u308A\u308B\u308C\u308D\u3084\u3086\u3088\u308F\u3092\u3093\u4E00\u306B\u3055\u3093\u91D1\u6B32\u3057\u3044\u308F\u30FC\u30FC\u30FC\u3093"), top_jsx("p", null, "\u3042\u3044\u3046\u3048\u304A\u304B\u304D\u304F\u3051\u3053\u3055\u3057\u3059\u305B\u305D\u305F\u3061\u3064\u3066\u3068\u306A\u306B\u306C\u306D\u306E\u306F\u3072\u3075\u3078\u307B\u307E\u307F\u3080\u3081\u3082\u3089\u308A\u308B\u308C\u308D\u3084\u3086\u3088\u308F\u3092\u3093\u4E00\u306B\u3055\u3093\u91D1\u6B32\u3057\u3044\u308F\u30FC\u30FC\u30FC\u3093"), top_jsx("p", null, "\u3042\u3044\u3046\u3048\u304A\u304B\u304D\u304F\u3051\u3053\u3055\u3057\u3059\u305B\u305D\u305F\u3061\u3064\u3066\u3068\u306A\u306B\u306C\u306D\u306E\u306F\u3072\u3075\u3078\u307B\u307E\u307F\u3080\u3081\u3082\u3089\u308A\u308B\u308C\u308D\u3084\u3086\u3088\u308F\u3092\u3093\u4E00\u306B\u3055\u3093\u91D1\u6B32\u3057\u3044\u308F\u30FC\u30FC\u30FC\u3093"), top_jsx("p", null, "\u3042\u3044\u3046\u3048\u304A\u304B\u304D\u304F\u3051\u3053\u3055\u3057\u3059\u305B\u305D\u305F\u3061\u3064\u3066\u3068\u306A\u306B\u306C\u306D\u306E\u306F\u3072\u3075\u3078\u307B\u307E\u307F\u3080\u3081\u3082\u3089\u308A\u308B\u308C\u308D\u3084\u3086\u3088\u308F\u3092\u3093\u4E00\u306B\u3055\u3093\u91D1\u6B32\u3057\u3044\u308F\u30FC\u30FC\u30FC\u3093"))), top_jsx("section", {
      className: "uk-section uk-section-small uk-section-primary"
    }, top_jsx("div", {
      className: "uk-container uk-container-small uk-position-relative"
    }, top_jsx("h2", {
      className: "uk-text-center"
    }, "\u6A5F\u80FD"), top_jsx("div", {
      "uk-slideshow": "animation: scroll"
    }, top_jsx("div", {
      className: "uk-position-relative uk-visible-toggle uk-light"
    }, top_jsx("ul", {
      className: "uk-slideshow-items",
      "uk-height-viewport": "min-height: 500"
    }, top_jsx("li", null, top_jsx("div", {
      className: "uk-position-center"
    }, top_jsx("h3", null, "test1"), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("button", {
      className: "uk-button uk-button-primary"
    }, "Button"))), top_jsx("li", null, top_jsx("div", {
      className: "uk-position-center"
    }, top_jsx("h3", null, "test2"), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("button", {
      className: "uk-button uk-button-primary"
    }, "Button"))), top_jsx("li", null, top_jsx("div", {
      className: "uk-position-center"
    }, top_jsx("h3", null, "test3"), top_jsx("p", null, "Lorem ", top_jsx("a", {
      href: "#"
    }, "ipsum dolor"), " sit amet, consetetur sadipscing elitr,", top_jsx("br", null), "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam."), top_jsx("button", {
      className: "uk-button uk-button-primary"
    }, "Button")))), top_jsx("a", {
      className: "uk-position-center-left uk-position-small uk-hidden-hover",
      href: "#",
      "data-uk-slidenav-previous": true,
      "data-uk-slideshow-item": "previous"
    }), top_jsx("a", {
      className: "uk-position-center-right uk-position-small uk-hidden-hover",
      href: "#",
      "data-uk-slidenav-next": true,
      "data-uk-slideshow-item": "next"
    })), top_jsx("ul", {
      className: "uk-slideshow-nav uk-dotnav uk-flex-center uk-margin"
    })))), top_jsx("section", {
      className: "uk-section uk-section-small uk-section-default"
    }, top_jsx("div", {
      className: "uk-container uk-container-small"
    }, top_jsx("h2", {
      className: "uk-text-center"
    }, "\u7279\u5FB4"), top_jsx("div", {
      className: "uk-grid-column-small uk-grid-row-large uk-text-center",
      "data-uk-grid": true
    }, top_jsx("div", {
      className: "uk-padding uk-width-1-3@m"
    }, top_jsx("i", {
      className: "fas fa-user-shield fa-5x"
    }), top_jsx("h2", null, "\u5927\u5207\u306A\u30E6\u30FC\u30B6\u30FC\u60C5\u5831\u3092\u304A\u5B88\u308A\u3057\u307E\u3059"), top_jsx("p", null, "\u3053\u306E\u30A2\u30D7\u30EA\u306F\u91CD\u8981\u306A\u60C5\u5831\u306F\u4FDD\u5B58\u3057\u307E\u305B\u3093\u3002\u4F8B\u3048\u30CF\u30C3\u30AD\u30F3\u30B0\u3092\u3055\u308C\u305F\u3068\u3057\u3066\u3082\u88AB\u5BB3\u306F\u6700\u5C0F\u9650\u306B\u6291\u3048\u3089\u308C\u307E\u3059\u3002\u3082\u3061\u308D\u3093\u88FD\u4F5C\u8005\u306B\u60C5\u5831\u53CE\u96C6\u306E\u610F\u56F3\u306F\u3054\u3056\u3044\u307E\u305B\u3093\u3002")), top_jsx("div", {
      className: "uk-padding uk-width-1-3@m"
    }, top_jsx("i", {
      className: "fas fa-globe fa-5x"
    }), top_jsx("h2", null, "\u56FD\u969B\u5316\u5BFE\u5FDC"), top_jsx("p", null, "\u3053\u306E\u30A2\u30D7\u30EA\u306F\u56FD\u969B\u5316\u306B\u5BFE\u5FDC\u3057\u3066\u3044\u307E\u3059\u3002\u69D8\u3005\u306A\u56FD\u306E\u30E6\u30FC\u30B6\u30FC\u304C\u4F7F\u7528\u3057\u3066\u3044\u307E\u3059\u3002\u305D\u306E\u305F\u3081\u69D8\u3005\u306A\u56FD\u306E\u30E6\u30FC\u30B6\u30FC\u304C\u4F7F\u7528\u3057\u3066\u3044\u308B\u30B5\u30FC\u30D3\u30B9\u3092\u77E5\u308B\u3053\u3068\u304C\u3067\u304D\u307E\u3059")), top_jsx("div", {
      className: "uk-padding uk-width-1-3@m"
    }, top_jsx("i", {
      className: "fas fa-users fa-5x"
    }), top_jsx("h2", null, "\u30B3\u30DF\u30E5\u30CB\u30C6\u30A3"), top_jsx("p", null, "\u3053\u306E\u30A2\u30D7\u30EA\u306F\u30E6\u30FC\u30B6\u30FC\u540C\u58EB\u3067\u3064\u306A\u304C\u308A\u3092\u4F5C\u308B\u3053\u3068\u304C\u3067\u304D\u307E\u3059\u3002\u30D5\u30A9\u30ED\u30FC\u3001\u30BF\u30B0\u3001sns\u3067\u5171\u901A\u306E\u4EF2\u9593\u3092\u898B\u3064\u3051\u308B\u3053\u3068\u304C\u3067\u304D\u307E\u3059"))))), top_jsx("a", {
      className: "uk-position-bottom-right uk-position-fixed uk-padding-small",
      onClick: () => scrollTo(0, 0),
      "data-uk-scroll": true
    }, top_jsx("i", {
      className: "uk-text-muted fas fa-chevron-circle-up fa-3x"
    })), top_jsx(common_nav, null), top_jsx(common_footer, null), top_jsx("div", {
      id: "modal-sections",
      "data-uk-modal": true
    }, top_jsx("div", {
      className: "uk-modal-dialog",
      "data-uk-overflow-auto": true
    }, top_jsx("button", {
      className: "uk-modal-close-default",
      type: "button",
      "data-uk-close": true
    }), top_jsx("div", {
      className: "uk-modal-body"
    }, top_jsx("ul", {
      className: "uk-child-width-expand",
      "data-uk-tab": true
    }, top_jsx("li", {
      className: "uk-active"
    }, top_jsx("a", {
      href: ""
    }, "\u30B5\u30A4\u30F3\u30A4\u30F3")), top_jsx("li", null, top_jsx("a", {
      href: ""
    }, "\u30B5\u30A4\u30F3\u30A2\u30C3\u30D7"))), top_jsx("ul", {
      className: "uk-switcher"
    }, top_jsx("li", null, top_jsx("div", {
      className: "uk-margin"
    }, top_jsx("form", {
      className: "uk-form"
    }, top_jsx("label", {
      className: "uk-form-label",
      htmlFor: "form-stacked-text"
    }, "\u30E1\u30FC\u30EB\u30A2\u30C9\u30EC\u30B9"), top_jsx("div", {
      className: "uk-form-controls"
    }, top_jsx("div", {
      className: "uk-inline"
    }, top_jsx("span", {
      className: "uk-form-icon",
      "data-uk-icon": "icon: user"
    }), top_jsx("input", {
      className: "uk-input",
      type: "text",
      placeholder: "user.example@test.com"
    }))), top_jsx("label", {
      className: "uk-form-label",
      htmlFor: "form-stacked-text"
    }, "\u30D1\u30B9\u30EF\u30FC\u30C9"), top_jsx("div", {
      className: "uk-form-controls"
    }, top_jsx("div", {
      className: "uk-inline"
    }, top_jsx("span", {
      className: "uk-form-icon",
      "data-uk-icon": "icon: lock"
    }), top_jsx("div", {
      className: "uk-form-password"
    }, top_jsx("input", {
      className: "uk-input",
      type: "password",
      placeholder: "********"
    }), top_jsx("i", {
      className: "fas fa-eye"
    }), top_jsx("i", {
      className: "fas fa-eye-slash"
    }), top_jsx("a", {
      href: "#",
      className: "uk-form-password-toggle",
      onClick: e => this.validate(e),
      "data-uk-form-password": true
    }, "...")))))), top_jsx("button", {
      className: "uk-button uk-button-default uk-modal-close",
      type: "button"
    }, "Cancel"), top_jsx("button", {
      className: "uk-button uk-button-primary",
      type: "button"
    }, "Save")))))));
  }

}

/* harmony default export */ var pages_top = __webpack_exports__["default"] = (top_TopPage);

/***/ }),

/***/ "xnum":
/***/ (function(module, exports) {

module.exports = require("next/head");

/***/ })

/******/ });