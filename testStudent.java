public class testStudent {
    public static void main(String[] args) {
	Student s1 = new Student(1,"Bob");
	Student s2 = new Student(2,"Jack");
	Student s = new Student(1,"Bob");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s.equals(s1));
	System.out.println(s1.equals(s2));
    }
}
class Student {
    int id;
    String name;
    Student(int id,String name){
	this.id = id;
	this.name = name;
    }
    boolean equals(Student s) {
	return (this.id==s.id)&&(this.name.equals(s.name));
    }
    public String toString() {
	return ("id:"+this.id+","+"name:"+this.name);
    }
}
