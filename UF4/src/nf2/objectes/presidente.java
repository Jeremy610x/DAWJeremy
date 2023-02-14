/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nf2.objectes;

/**
 *
 * @author jepa2698
 */
public class presidente extends PersonalEquipo{
    
  protected int anyos_cargo;

    public presidente(int id, String nombre) {
        super(id, nombre);
        this.edad = 50;
        this.anyos_cargo =4;
    }

    public int getAnyos_cargo() {
        return anyos_cargo;
    }
    
    
    
    public void irPalcoPartido()
    {
       System.out.println(nombre+ "estoy en el palco");
    }
    
    public void tratarContrato(PersonalEquipo persona_tratar)
    {
        if(persona_tratar instanceof futbolista)
        {
            System.out.println("Debes meter mas goles");
        }
        else if(persona_tratar instanceof entrenador)
        {
            System.out.println("Deben jugar mejor");
        }
        else if(persona_tratar instanceof masajista)
        {
            System.out.println("Si se lesionan te echo");
        }
    }

    @Override
    public void Viajar() {
        super.Viajar(); //sout --> viajo al equipo
        System.out.println("Viajo en primera clase");
    }
}
