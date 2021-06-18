package tricks.java.good.practices.one.immutable.objects;

import java.util.Objects;

public final class Employee {

    private final int id;
    private final String name;
    private final Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = new Address(address.getStreet(), address.getNumber(), address.getCity());
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Address getAddress(){
        return new Address(address.getStreet(), address.getNumber(), address.getCity());
    }

    public Employee rename(String newName){
        return new Employee(id, newName, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
