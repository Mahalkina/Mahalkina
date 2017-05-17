package hello.model;

import javax.persistence.*;

@Entity
@Table(name = "HumanAll")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer n_human;

    @Column(name = "human")
    private String name;
    private String surname;
    private String otchestvo;
    private String address;


    public Integer getN_human() {
        return n_human;
    }

    public void setId(Integer n_human) {
        this.n_human = n_human;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}