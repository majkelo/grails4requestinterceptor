package testrequest


class RequestModificatorInterceptor {

	RequestModificatorInterceptor() {
		match(controller: "*", action: "*")
	}

	boolean before() {
		println "INSIDE INTERCEPTOR; BEFORE"
		println  params
		println request.properties
		params.qwe = 3
		true
	}

    boolean after() {
	    true
    }

    void afterView() {
        // no-op
    }
}
