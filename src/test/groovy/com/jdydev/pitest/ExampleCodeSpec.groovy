package com.jdydev.pitest

import spock.lang.Specification

class ExampleCodeSpec extends Specification {

    def "Testing table shouldDoFoo"() {
        expect:
        new ExampleCode().shouldDoFoo(stuff) == answer

        where:
        answer | stuff
        false  | null
        true   | 'foo'
        true   | 'bar'
    }
}
