package datalisk.ocas


class JsOcasHashGenerator : OcasHashGenerator {

    private val algorithm = "SHA3-512"
    private val defaultHashLength = 32

    override fun computeHash(input: ByteArray): String {
        return "---"
    }

}

actual val ocasHashGenerator: OcasHashGenerator = JsOcasHashGenerator()
