import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person
{
    public Person(Integer id, String fname, String lname) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
 
    private Integer id;
    private String fname;
    private String lname;
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
    }
    public static void main(String[] args) {
        Person lokeshOne = new Person(1, "Lokesh", "Gupta");
        Person lokeshTwo = new Person(1, "Lokesh", "Gupta");
        Person lokeshThree = new Person(1, "Lokesh", "Gupta");
        Person brianOne = new Person(2, "Brian", "Clooney");
        Person brianTwo = new Person(2, "Brian", "Clooney");
        Person alex = new Person(3, "Alex", "Kolen");
        
        //Add some random persons
        Collection<Person> list = Arrays.asList(alex, 
                                                brianOne, 
                                                brianTwo, 
                                                lokeshOne, 
                                                lokeshTwo, 
                                                lokeshThree);

        // Get distinct people by id
        List<Person> distinctElements = list.stream()
                    .distinct()
                    .collect(Collectors.toList());
                    

        // Let's verify distinct people
        System.out.println("Distinct entries are the followings");
        System.out.println(distinctElements);
    }
}