import datalisk.ocas.ocasHashGenerator

data class DirEntity constructor(
    val name: String
) {

    fun hash(): String {
        return ocasHashGenerator.computeHash(name)
    }

}
