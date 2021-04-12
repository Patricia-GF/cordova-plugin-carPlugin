var exec = require('cordova/exec');

exports.showMessage = function (arg0, success, error) {
    exec(success, error, 'car-plugin', 'showMessage', [arg0]);
};
