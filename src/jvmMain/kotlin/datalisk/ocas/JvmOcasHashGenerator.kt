package datalisk.ocas

import java.security.MessageDigest

class JvmOcasHashGenerator : OcasHashGenerator {

    private val algorithm = "SHA3-512"
    private val defaultHashLength = 32

    override fun computeHash(input: String) = computeHash(input.toByteArray())

    override fun computeHash(input: ByteArray): String {
        return sha().digest(input).toHexString(defaultHashLength)
    }

    private fun sha() = MessageDigest.getInstance(algorithm)

    private fun ByteArray.toHexString(length: Int): String {
        val hexString = StringBuffer()
        for (i in 0 until length) {
            val hex = Integer.toHexString(0xff and this[i].toInt())
            if (hex.length == 1) hexString.append('0')
            hexString.append(hex)
        }
        return hexString.toString()
    }

}

actual val ocasHashGenerator: OcasHashGenerator = JvmOcasHashGenerator()
