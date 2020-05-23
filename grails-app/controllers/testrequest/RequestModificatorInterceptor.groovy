package testrequest


class RequestModificatorInterceptor {

	RequestModificatorInterceptor() {
		match(controller: "*", action: "*")
	}

	boolean before() {
		println "INSIDE INTERCEPTOR; BEFORE"
		println request.JSON
		request.JSON.before = "added"
		true
	}

    boolean after() {
	    true
    }

    void afterView() {
        // no-op
    }
}
