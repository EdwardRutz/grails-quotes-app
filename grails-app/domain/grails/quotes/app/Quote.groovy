package grails.quotes.app

class Quote {
    String content
    String author
    Date create = new Date()

    static constraints = {
    }
}
