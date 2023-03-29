public class Parameter {
public static void main(String[] args) {
Language s1 = new Language("Java");
Language s2 = new Language("Python");
int i = 12345;
pass(s1, s2, i);
System.out.println(s1);
System.out.println(s2);
System.out.println(i);
}
private static void pass(Language s1, Language s2, int i) {
s1 = new Language("Ruby");
s1.increaseVersion();
s2.increaseVersion();
i = 54321;
}
}