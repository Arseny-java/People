public class PersonBuilder implements IPersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String adress;

    public PersonBuilder setName(String name) {
        if (this.name == null) {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (this.surname == null) {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Любое осмысленное сообщение)");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Заполните имя");
        }
        if (surname == null) {
            throw new IllegalStateException("Заполните фамилию");
        }
        return new Person(name, surname, age, adress);
    }
}
