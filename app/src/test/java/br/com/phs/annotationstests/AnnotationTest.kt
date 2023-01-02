package br.com.phs.annotationstests

import org.junit.Assert
import org.junit.Test

class AnnotationTest {

    @Test
    fun childrenTest() {

        val childrenClass = ChildrenClass()

        Assert.assertEquals(2, childrenClass.sources.size)

    }

}