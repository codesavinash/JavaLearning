public class Person {
    private String name;
    private int age;

    public Person (String name, int age) { 
        this.name = name;
        this.age = age;
    } //constructor

    //getters
    public String getName() {
        return this.name;
    } //getname()

    public int getAge(){
        return this.age;
    } //getAge()

    //setters
    public void setName(String name) {
        this.name = name;
    } //setName()
    public void setAge(int age){
        this.age = age;
    } // setAge()
    



} // class