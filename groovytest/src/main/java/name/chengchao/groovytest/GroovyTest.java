package name.chengchao.groovytest;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class GroovyTest {

    public static void main(String[] args) {
        Binding binding = new Binding();
        binding.setVariable("x", 10);
        binding.setVariable("language", "Groovy");
        GroovyShell shell = new GroovyShell(binding);

        Object value = shell.evaluate("println \"Welcome to $language\" ; println 1;y = x * 2; z = x * 3; return z");
        Object value1 = shell.evaluate("language.contains('vy')");

        System.out.println("value:" + value);
        System.out.println("value1:" + value1);
        // System.out.println(value.getClass());

    }

}
