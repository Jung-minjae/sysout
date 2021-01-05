package Java12_18;

public class Benzthis {
 String brand = "BENZ";
 String color = "";
 int cc = 0;
 int door = 0;
 

public Benzthis(String color,int cc,int door) {
	 this.color=color;
	 this.cc = cc;
	 this.door = door;
 }
public Benzthis(String color) {
	 this(color,4000,4);
}
public Benzthis(String color,int cc) {
	 this(color,cc,2);
}
public Benzthis() {
	 this("흰색",2000,4);
}
}
