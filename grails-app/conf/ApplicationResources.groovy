modules = {
    application {
        resource url:'js/application.js'
    }
   bootstrap {
        resource url:'less/custom-bootstrap.less',attrs:[rel: "stylesheet/less", type:'css']
        dependsOn 'jquery'
        dependsOn 'bootstrapJs'
    }

    bootstrapJs {
        resource url:'js/bootstrap/bootstrap.min.js'
    }
}