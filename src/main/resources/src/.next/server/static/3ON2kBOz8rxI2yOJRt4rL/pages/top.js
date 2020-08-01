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

/***/ 1:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("woae");


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
    }), __jsx("title", null, this.props.title), __jsx("meta", {
      name: "viewport",
      content: "width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"
    }), __jsx("link", {
      rel: "shortcut icon",
      href: "/img/logo.png"
    }), __jsx("link", {
      rel: "stylesheet",
      href: "https://cdnjs.cloudflare.com/ajax/libs/uikit/3.3.1/css/uikit.min.css",
      integrity: "sha256-FIboc2EoNdI/QieXBLURbYkUxPX/3bTuWY+47MvExa0=",
      crossOrigin: "anonymous"
    }), __jsx("link", {
      rel: "stylesheet",
      type: "text/css",
      href: "/css/base.css"
    }), __jsx("link", {
      href: "https://fonts.googleapis.com/css?family=Poiret+One&display=swap",
      rel: "stylesheet"
    }), __jsx("script", {
      src: "https://cdnjs.cloudflare.com/ajax/libs/uikit/3.3.1/js/uikit.min.js",
      integrity: "sha256-BFNbmKG9T7WEBxVHWyG/qzPPzZf8autYd2b0Eytgv7A=",
      crossOrigin: "anonymous"
    }), __jsx("script", {
      src: "https://cdnjs.cloudflare.com/ajax/libs/uikit/3.3.1/js/uikit-icons.min.js",
      integrity: "sha256-pXt2XY/xp6QmXUIQYxlCfOTWCV8UBJmpJtHn1NheTHU=",
      crossOrigin: "anonymous"
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
      "uk-margin": "",
      className: "uk-subnav tm-subnav uk-flex-inline uk-flex-center uk-margin-remove-bottom"
    }, common_footer_jsx("li", {
      className: "uk-first-column"
    }, common_footer_jsx("span", null, "Version", common_footer_jsx("span", {
      "uikit-version": ""
    }, "0.1.1"))), common_footer_jsx("li", null, common_footer_jsx("a", {
      href: "https://github.com/uikit/uikit/stargazers"
    }, common_footer_jsx("span", {
      "uk-icon": "icon: users",
      className: "uk-margin-small-right uk-icon"
    }), common_footer_jsx("span", {
      "uikit-stargazers": ""
    }, "15385"), " Users")), common_footer_jsx("li", null, common_footer_jsx("a", {
      href: "https://github.com/MewW6m/MinesO",
      className: "uk-text-lowercase"
    }, common_footer_jsx("span", {
      "uk-icon": "icon: github",
      className: "uk-margin-small-right uk-icon"
    }), "@MewW6m")))));
  }

}

/* harmony default export */ var common_footer = (common_footer_CommonFooter);
// CONCATENATED MODULE: ./pages/top.tsx
var top_jsx = external_react_default.a.createElement;





 // MinesO - 利用サービス一覧管理

class top_TopPage extends external_react_default.a.Component {
  render() {
    return top_jsx("div", null, top_jsx(common_head, null), top_jsx(head_default.a, null, top_jsx("title", null, "MinesO - \u5229\u7528\u30B5\u30FC\u30D3\u30B9\u4E00\u89A7\u7BA1\u7406"), top_jsx("link", {
      rel: "stylesheet",
      type: "text/css",
      href: "/css/top_polygon.css"
    }), top_jsx("script", {
      src: "https://kit.fontawesome.com/1d615c07d9.js",
      crossOrigin: "anonymous"
    })), top_jsx(common_header, null), top_jsx(common_footer, null), top_jsx(common_nav, null));
  }

}

/* harmony default export */ var pages_top = __webpack_exports__["default"] = (top_TopPage);

/***/ }),

/***/ "xnum":
/***/ (function(module, exports) {

module.exports = require("next/head");

/***/ })

/******/ });