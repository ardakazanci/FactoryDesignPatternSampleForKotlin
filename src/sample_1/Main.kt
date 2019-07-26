package sample_1

fun main() {


    val genre = "SCIENCE"

    val book = BookFactory.createBook(
        when (genre) {

            "SCIENCE" -> Genre.SCIENCE
            "LITERATURE" -> Genre.LITERATURE
            else -> throw IllegalArgumentException("There is no such genre")


        }
    )

    println("Getting Book Info")
    book.getInfo()
    println("Getting Book Order")
    book.order()
    println("Getting Book Rate")
    book.rate()


}

