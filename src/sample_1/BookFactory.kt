package sample_1

class BookFactory {

    companion object {


        fun createBook(genre: Genre): Book =

            when (genre) {

                Genre.SCIENCE -> object : Book {

                    private val title = "Theory of relativity"

                    override fun getInfo() = println("$title ... info")

                    override fun order() = println("$title ... order")

                    override fun rate() = println("$title ... rage")
                }

                Genre.LITERATURE -> object : Book {

                    private val title = "Theory of relativity"

                    override fun getInfo() = println("$title ... info")

                    override fun order() = println("$title ... order")

                    override fun rate() = println("$title ... rage")
                }


            }


    }

}