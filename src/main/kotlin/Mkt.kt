class Mkt {
    private var name: String = ""

    companion object {

        private var sysMkt = Mkt()

        fun ready(name: String?) {
            val mkt = Mkt()
            sysMkt.name = name ?: ""
        }

        fun hello() {
            println("Hello, ${sysMkt.name}!")
        }
    }
}