package yan.spring5recipeapp.domain;

import javax.persistence.*;

@Entity
public class UoMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUom() {
        return description;
    }

    public void setUom(String uom) {
        this.description = description;
    }
}
