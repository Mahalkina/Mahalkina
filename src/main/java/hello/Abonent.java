package hello;

import javax.persistence.*;

@Entity
@Table(name = "AbonentAll")
public class Abonent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer n_abonenta;

    @Column(name = "abonent")
    private Integer n_human;
    private long n_phone;
    private long god_ystanovki_phone;
    private float stoimost_abonentskoy_plati;
    private boolean tip_ystanovki_phone;
    private boolean privileges;

//    @ManyToOne
//    private Human human;

    protected Abonent() {}
    public Abonent(Integer n_human, long n_phone, long god_ystanovki_phone,float stoimost_abonentskoy_plati,boolean tip_ystanovki_phone, boolean privileges) {
        this.n_human = n_human;
        this.god_ystanovki_phone = god_ystanovki_phone;
        this.stoimost_abonentskoy_plati = stoimost_abonentskoy_plati;
        this.tip_ystanovki_phone = tip_ystanovki_phone;
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return String.format(
                "Abonent[n_abonenta=%d, n_human='%s', stoimost_abonentskoy_plati='%s', tip_ystanovki_phone='%s', privileges='%s']",
                n_abonenta, n_human, stoimost_abonentskoy_plati, tip_ystanovki_phone, privileges);
    }

    public Integer getN_abonenta() {
        return n_abonenta;
    }

    public void setN_abonenta(Integer n_abonenta) {
        this.n_abonenta = n_abonenta;
    }

    public Integer getN_human() {
        return n_human;
    }

    public void setN_human(Integer n_human) {
        this.n_human = n_human;
    }

    public long getN_phone() {
        return n_phone;
    }

    public void setN_phone(long n_phone) {
        this.n_phone = n_phone;
    }

    public long getGod_ystanovki_phone() {
        return god_ystanovki_phone;
    }

    public void setGod_ystanovki_phone(long god_ystanovki_phone) {
        this.god_ystanovki_phone = god_ystanovki_phone;
    }

    public float getStoimost_abonentskoy_plati() {
        return stoimost_abonentskoy_plati;
    }

    public void setStoimost_abonentskoy_plati(float stoimost_abonentskoy_plati) {
        this.stoimost_abonentskoy_plati = stoimost_abonentskoy_plati;
    }

    public boolean isTip_ystanovki_phone() {
        return tip_ystanovki_phone;
    }

    public void setTip_ystanovki_phone(boolean tip_ystanovki_phone) {
        this.tip_ystanovki_phone = tip_ystanovki_phone;
    }

    public boolean isPrivileges() {
        return privileges;
    }

    public void setPrivileges(boolean privileges) {
        this.privileges = privileges;
    }
//    public Human getHuman() {
//        return human;
//    }
//
//    public void setHuman(Human human) {
//        this.human = human;
//    }
}
