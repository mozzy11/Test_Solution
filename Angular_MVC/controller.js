 
 
      var App = angular.module("App", []);
      App.controller('patientController', function($scope) {
          //model 
         $scope.patient = {
            firstName: "Moses",
            lastName: "Mutesa",
            
            fullName: function() {
               var patientObject;
               patientObj = $scope.patient;
               return patientObj.firstName + " " + patientObj.lastName;
            }
         };
      });