package br.com.phs.annotationstests

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
annotation class OneClass(val executeSomething: Boolean = true)
