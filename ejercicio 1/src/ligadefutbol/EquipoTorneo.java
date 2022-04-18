/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefutbol;



import java.util.Objects;

/**
 *
 * @author Maty
 */
public class EquipoTorneo implements Comparable<EquipoTorneo> {
    
    private Equipo Equipo ;
    private Torneo Torneo ;
    private int PartidosJugados ;
    private int PartidosGanados ;
    private int PartidosEmpatados ;
    private int PartidosPerdidos ;
    private int GolesaFavor ;
    private int GolesEnContra ;

    EquipoTorneo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public Torneo getTorneo() {
        return Torneo;
    }

    public void setTorneo(Torneo Torneo) {
        this.Torneo = Torneo;
    }

    public int getPartidosGanados() {
        return PartidosGanados;
    }

    public void setPartidosGanados(int PartidosGanados) {
        this.PartidosGanados = PartidosGanados;
    }

    public int getPartidosEmpatados() {
        return PartidosEmpatados;
    }

    public void setPartidosEmpatados(int PartidosEmpatados) {
        this.PartidosEmpatados = PartidosEmpatados;
    }

    public int getGolesaFavor() {
        return GolesaFavor;
    }

    public void setGolesaFavor(int GolesaFavor) {
        this.GolesaFavor = GolesaFavor;
    }

    public int getGolesEnContra() {
        return GolesEnContra;
    }

    public void setGolesEnContra(int GolesEnContra) {
        this.GolesEnContra = GolesEnContra;
    }

   

    @Override
    public String toString() {
        return "EquipoTorneo{" + "Equipo=" + Equipo + ", Torneo=" + Torneo + ", PartidosJugados=" + PartidosJugados + ", PartidosGanados=" + PartidosGanados + ", PartidosEmpatados=" + PartidosEmpatados + ", PartidosPerdidos=" + PartidosPerdidos + ", GolesaFavor=" + GolesaFavor + ", GolesEnContra=" + GolesEnContra + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.Equipo);
        hash = 47 * hash + Objects.hashCode(this.Torneo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EquipoTorneo other = (EquipoTorneo) obj;
        if (!Objects.equals(this.Equipo, other.Equipo)) {
            return false;
        }
        return Objects.equals(this.Torneo, other.Torneo);
    }


    public EquipoTorneo(Equipo Equipo, Torneo Torneo, int PartidosJugados, int PartidosGanados, int PartidosEmpatados, int PartidosPerdidos, int GolesaFavor, int GolesEnContra) {
        this.Equipo = Equipo;
        this.Torneo = Torneo;
        this.PartidosJugados = PartidosJugados;
        this.PartidosGanados = PartidosGanados;
        this.PartidosEmpatados = PartidosEmpatados;
        this.PartidosPerdidos = PartidosPerdidos;
        this.GolesaFavor = GolesaFavor;
        this.GolesEnContra = GolesEnContra;
    }
    
    public int getPuntos(int PartidosGanados , int PartidosEmpatados){
    int puntos = 0;
    puntos=puntos+(PartidosGanados*3);
    puntos=puntos+(PartidosEmpatados*1);
    return puntos;
}
     
    public int getDiferenciaGol(int GolesaFavor , int GolesEnContra ){
        int DiferenciaGol;
        DiferenciaGol=(GolesaFavor-GolesEnContra);
        return DiferenciaGol;
    }

    @Override
    public int compareTo(EquipoTorneo o) {
        if(this.Equipo.getNombre().equalsIgnoreCase(o.Equipo.getNombre())){
            return this.Torneo.compareTo(o.getTorneo());
        }else{
            return(this.Equipo.getNombre().compareTo(o.Equipo.getNombre()));
        }
    }
}


    

    
               
    


    



    

