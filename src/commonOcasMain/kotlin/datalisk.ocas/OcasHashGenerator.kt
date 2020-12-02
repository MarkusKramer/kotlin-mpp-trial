package datalisk.ocas

interface OcasHashGenerator {

    fun computeHash(input: String): String = computeHash(input.encodeToByteArray())

    fun computeHash(input: ByteArray): String

}

expect val ocasHashGenerator: OcasHashGenerator
