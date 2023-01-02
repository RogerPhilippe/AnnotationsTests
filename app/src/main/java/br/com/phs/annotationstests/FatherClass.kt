package br.com.phs.annotationstests

open class FatherClass(private val klass: Class<*>? = null) {

    val sources: MutableList<String> = mutableListOf()

    init {
        this.executeJavaClass()
        this.executeKlass()
    }

    private fun executeJavaClass() {
        this.javaClass.methods.find { it.isAnnotationPresent(OneClass::class.java) }?.let {
            if (it.getAnnotation(OneClass::class.java)?.executeSomething == true) {
                this.executeSomething("JavaClass")
            }
        }
    }

    private fun executeKlass() {
        klass?.methods?.find { it.isAnnotationPresent(OneClass::class.java) }?.let {
            if (it.getAnnotation(OneClass::class.java)?.executeSomething == true) {
                this.executeSomething("Klass methods")
            }
        }
    }

    open fun executeSomething(source: String) {}

}