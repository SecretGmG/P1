public class Language {
private String name;
private double version;
public Language(String name) {
this.name = name;
this.version = 1.0;
}
public String toString() {
return this.name + " " + this.version;
}
public void increaseVersion() {
this.version += 0.1;
}
}