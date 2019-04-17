(function() {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('UserinfoCtrl', ['$scope', '$log', 'MyDataService', '$location', 'DialogService', 'MyUtilService', 'ToolService', UserinfoCtrl]);

  function UserinfoCtrl($scope, $log, MyDataService, $location, DialogService, MyUtilService, ToolService) {
    $log.debug('UserinfoCtrl init...');

    // 处理scope销毁
    $scope.$on('$destroy', function() {
      $log.debug('UserinfoCtrl destroy...');
    });

    $scope.page = {};
    //查询
    $scope.query = function() {
      MyDataService.send('/TbAdmin/getUserInfo', {}, function(data) {
        $scope.tbAdmin = data.datas.user;
      });
    };

    
  }
})();
