package ru.andremoniy.objctojavacnv.builder;

/**
 * User: Andremoniy
 * Date: 07.02.13
 * Time: 20:12
 */
public class ClassBuilder {

    private StringBuilder sb = new StringBuilder();
    private static final String END = ";\n";
    private static final String R = "\n";

    public void setPackage(String packageName) {
        sb.append("package ").append(packageName).append(END).append(R);
    }

    public void addImport(String importName) {
        sb.append("import ").append(importName).append(END);
    }

    public void addImportStatic(String importName) {
        addImport("static " + importName);
    }

    public void a(StringBuilder sb2) {
        sb.append(sb2);
    }

    public void a(ClassBuilder cb) {
        sb.append(cb.sb());
    }

    public StringBuilder sb() {
        return sb;
    }

    public void abstractClass(boolean isInner, boolean isInterface, String interfaceName, String superclassName) {
        sb.append("public abstract ").append(isInner ? "static " : "").append("class ").append(isInterface ? "I" : "").append(interfaceName).append(superclassName.length() > 0 ? (" extends " + superclassName) : "").append(" {").append(R);
    }

    public void abstractInnerInterface(String interfaceName, String superclassName) {
        abstractClass(true, true, interfaceName, superclassName);
    }

    public void abstractClass(String interfaceName, String superclassName) {
        abstractClass(false, false, interfaceName, superclassName);
    }

    public ClassBuilder a(String s) {
        sb.append(s);
        return this;
    }
}
