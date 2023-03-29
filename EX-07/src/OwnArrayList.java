public class OwnArrayList {
private int capacity = 10; // Startgr¨osse
private int size; // Anzahl tats¨achlich gespeicherter Elemente
private Object[] listElements; // Elemente werden in Array verwaltet
/**
* Konstruiert eine leere Liste mit einer Anfangskapazit¨at von zehn.
*/
public OwnArrayList() {
this.size = 0;
this.listElements = new Object[capacity];
}


public boolean set(int index, Object object){
    if(index >= size) return false;

    listElements[index] = object;
    return true;
}


/**
* F¨ugt das ¨ubergebene Element an das Ende dieser Liste an.
*/

public boolean add(Object object) {
if (this.size == this.capacity)
this.increaseSize();
this.listElements[this.size] = object;
this.size++;
return true;
}
/**
* Verdoppelt die Gr¨osse des zu Grunde liegenden Arrays.
*/
private void increaseSize() {
this.capacity *= 2;
Object[] temp = new Object[this.capacity];
for (int i = 0; i < this.listElements.length; i++)
temp[i] = this.listElements[i];
this.listElements = temp;
}

/**
* Liefert eine Zeichenkettenrepr¨asentation dieser Liste.
*/
public String toString() {
String result = "";
for (int i = 0; i < this.size; i++)
result += this.listElements[i] + "\t";
return result;
}


}
