package demo

import grails.validation.Validateable

@Validateable
class SomeValidateable {
    String name

    static constraints = {
        name matches: /[A-Z].*/
    }
}
