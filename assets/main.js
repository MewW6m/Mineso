// copy from https://github.com/ideamean/gitbook-plugin-auto-scroll-table/blob/master/book/plugin.js
require(["gitbook", "jQuery"], function(gitbook, $) {
  gitbook.events.bind("page.change", function() {
    [].slice.call(document.querySelectorAll('table')).forEach(function(el){
        var wrapper = document.createElement('div');
        wrapper.className = 'table-area';
        el.parentNode.insertBefore(wrapper, el);
        el.parentNode.removeChild(el);
        wrapper.appendChild(el);
    });
  });
});