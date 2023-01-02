package br.com.phs.annotationstests

class ChildrenClass : FatherClass(ChildrenClass::class.java) {

    @OneClass
    override fun executeSomething(source: String) {
        super.executeSomething(source)
        sources.add(source)
    }
}