/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf3jeremy;

/**
 *
 * @author jepa2698
 */
public class Contacts {
     private String DNI;
    private String name;
    private int age;
    

    public Contacts(String id, String name, int age) {
        this.DNI = id;
        this.name = name;
        this.age = age;

    }

    public Contacts(String id) {
        this.DNI = id;
    }
    
    public Contacts(Contacts other) {
        this.DNI = other.DNI;
        this.name = other.name;
        this.age = other.age;

    }   

    public String getId() {
        return DNI;
    }

    public void setId(String id) {
        this.DNI = id;
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




    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Contacts)) {
            return false;
        }
        final Contacts other = (Contacts) obj;
        return this.DNI == other.DNI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact=> ");
        sb.append("id=").append(DNI);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
    
    
}
