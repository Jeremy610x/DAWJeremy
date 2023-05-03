package cat.proven.pokedex.model;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Pokemon {

    private long id;
    private String name;
    private double height;
    private double weight;
    private Genre genre;
    private PokemonType tipo;
    /* faltaria si lo implementais atributo para la evolution;*/

    public Pokemon(long id, String name, double height, double weight, Genre genre, PokemonType type) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.genre = genre;
        this.tipo = type;
    }

  
    
    
    /*pokemon es igual a otro por su nombre*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public PokemonType getTipo() {
        return tipo;
    }

    public void setTipo(PokemonType tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + ", genre=" + genre + ", tipo=" + tipo + '}';
    }

  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pokemon)) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return Objects.equals(this.name, other.name);
    }
    
    
    
    
    
    
}
