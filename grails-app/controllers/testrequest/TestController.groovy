package testrequest

import grails.converters.JSON

class TestController {

    def index() {
	    println "INSIDE CONTROLLER"
	    println params
	    params.asd = 4
	    render params as JSON
    }
}
