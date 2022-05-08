
public class Person{


  

    private String name;
    private int age;
    private int weight;
    private int height;
    private String dateOfBirth;


    Person(){
        this.name = "";
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.dateOfBirth = "";

    }

    public Person(String name, int age, int weight, int height, String dateOfBirth){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;

    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String display() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                '}';
    }

}

    
