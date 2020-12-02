package datalisk.ocas

import kotlin.test.Test
import kotlin.test.assertEquals

class OcasHashGeneratorTest {

    @Test
    fun text() {
        assertEquals("840006653e9ac9e95117a15c915caab8", ocasHashGenerator.computeHash("hello world"))
    }
}
