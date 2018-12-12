package grails.quotes.app

class QuoteController {

    static defaultAction = "home"

    def home() {
        render "<h1>Real programmers do not eat quiche</h1>"
    }

    def random() {
        def staticAuthor = "Anonymous"
        def staticContent = "Real Programmers don't eat much quiche"
        [ author: staticAuthor, content: staticContent]
    }

}
