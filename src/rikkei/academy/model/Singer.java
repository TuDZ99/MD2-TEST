package rikkei.academy.model;

public class Singer implements Comparable<Singer> {
    private int id ;
    private int age;
    private String name;

    public Singer(int id , int age , String name){
        this.id = id;
        this.age = age;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Singer o) {
        int temp = this.getName().compareTo(o.getName());
        if(temp != 0){
            return temp;
        }
        temp = this.getAge() - o.getAge();
        return temp;
    }
}