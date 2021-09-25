public class Employee {  
private int id;  
private String name;  
private Address address; 
private Department dpt;
  
//public Employee() {System.out.println("def cons");}  
  
public Employee(int id, String name, Address address, Department dpt) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address = address; 
    this.dpt = dpt;
    System.out.println("Employee(int id, String name, Address address)");
}  
  
void show(){  
    System.out.println("Employee Details: "+id+" "+name);  
    System.out.println("Employee Address Details:"+address.toString()); 
    System.out.println("Employee Dept Details:"+dpt.showd()); 
}  
  
}
