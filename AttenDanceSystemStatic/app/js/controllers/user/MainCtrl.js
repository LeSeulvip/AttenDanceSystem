(function() {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('MainCtrl', ['$scope', '$log', '$timeout', 'MyDataService', '$location', 'DialogService', 'MyUtilService', 'ToolService', MainCtrl]);

  function MainCtrl($scope, $log, $timeout, MyDataService, $location, DialogService, MyUtilService, ToolService) {
    $log.debug('MainCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function() {
      $log.debug('MainCtrl destroy...');
    });

    // 页签切换
    $scope.menus = [{ text: '个人信息', page: 'userinfo' }, { text: '考勤信息', page: 'userclock' }];

    var basePath = 'templates/user/';
    $scope.changeMenu = function(m) {
      $scope.selectMenu = m;
      $scope.inc = basePath + $scope.selectMenu.page + '.html';
    };

    $scope.changeMenu($scope.menus[0]);

    $scope.queryUser = function() {
      MyDataService.send('/TbAdmin/getUserInfo', {}, function(data) {
        $scope.tbAdmin = data.datas.user;
      });
    };

    $scope.queryUser();

    $scope.logout = function() {
      DialogService.showWait('安全退出中，请稍后...');
      MyDataService.send('/TbAdmin/logout', {}, function(data) {
        DialogService.hideWait();
        DialogService.showAlert(data.message, function() {
          if (data.success) {
            location = '#!/route/page/index';
          }
        });
      });
    };
  }
})();
