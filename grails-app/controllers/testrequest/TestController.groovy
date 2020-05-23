package testrequest

import grails.converters.JSON

class TestController {

    def index() {
	    println "INSIDE CONTROLLER"
	    println request.JSON
	    request.JSON.incontroller = true
	    render request.JSON as JSON
    }
}
