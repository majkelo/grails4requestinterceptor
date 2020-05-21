package testrequest

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class RequestModificatorInterceptorSpec extends Specification implements InterceptorUnitTest<RequestModificatorInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test requestModificator interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"requestModificator")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
