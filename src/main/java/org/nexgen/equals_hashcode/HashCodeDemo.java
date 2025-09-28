package org.nexgen.equals_hashcode;

class PersonWithHashCode {
    String name;
    int age;

    PersonWithHashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonWithHashCode person = (PersonWithHashCode) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class HashCodeDemo {
    public static void main(String[] args) {
        PersonWithHashCode p1 = new PersonWithHashCode("Alice", 25);
        PersonWithHashCode p2 = new PersonWithHashCode("Alice", 25);

        System.out.println(p1.equals(p2));       // true
        System.out.println(p1.hashCode());      // same as p2's hashCode
        System.out.println(p2.hashCode());
    }
}