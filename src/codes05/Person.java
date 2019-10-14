package codes05;

public class Person {
    private String name;
    private int age;
    private int hight;
    public Person(String name,int age,int hight){
        this.name=name;
        this.age=age;
        this.hight=hight;
    }
    public int getHight() {
        return hight;
    }
    public void setHight(int hight) {
        this.hight = hight;
    }
    public void setName(String name){
        if(name.length()<2||name.length()>6){
            System.out.println("你设置的姓名不符合规范[2-6]");
            return;
        }
        else {
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 100 || age < 0) {
            System.out.println("你设置的年龄不合法[0-100]");
        } else {
            this.age = age;
        }
    }
}
