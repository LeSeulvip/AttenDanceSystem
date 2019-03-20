(function() {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('AdminCtrl', ['$scope', '$log', '$location', 'MyDataService', 'DialogService', 'MyUtilService', 'ToolService', AdminCtrl]);

  function AdminCtrl($scope, $log, $location, MyDataService, DialogService, MyUtilService, ToolService) {
    $log.debug('AdminCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function() {
      $log.debug('AdminCtrl destroy...');
    });

    // DialogService.showWait('获取后台数据中...');
    // MyDataService.send('/', {}, function(data) {
    //   DialogService.hideWait();
    //   $log.debug(data);
    //   $scope.data = MyUtilService.trustAsHtml(MyUtilService.formatJson(data, true));
    //   $log.debug(ToolService.getServerToken());
    // });

    // 页签切换
    $scope.menus = [{ text: '考勤管理', page: 'attendance' }, { text: '部门管理', page: 'dept' }, { text: '打卡管理', page: 'clock' }, { text: '请假管理', page: 'leave' }];

    var basePath = 'templates/manage/';
    $scope.changeMenu = function(m) {
      $scope.selectMenu = m;
      $scope.inc = basePath + $scope.selectMenu.page + '.html';
    };

    $scope.changeMenu($scope.menus[0]);

    //登出
    $scope.logout = function() {
      DialogService.showAlert('退出成功', function() {
        location = '/#!/route/page/index';
      });
    };
  }
})();
