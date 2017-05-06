package hello.model;

/**
 * Created by Ekaterina on 03.05.2017.
 */
import javax.persistence.*;

/**
 * Created by jskonst on 19.04.17.
 */
@Entity
@Table(name="HumanAll")
public class Human {
    @Id
    @GeneratedValue(strategy= GenerationHuman.AUTO)
    private Integer id;

    @Column(name="human")
    private String name;
    private String surname;
    private String otchestvo;
    private String address;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String Human() {
        return name;
    }

    public void setHuman(String typename) {
        this.surname = typename;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}