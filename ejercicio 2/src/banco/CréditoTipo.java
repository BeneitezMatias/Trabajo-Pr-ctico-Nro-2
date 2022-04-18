/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Objects;

/**
 *
 * @author Maty
 */
public class CréditoTipo {
private String Descripción; 
private Double MontoMínimo; 
private Double MontoMáximo; 
private int AñosMínimo; 
private int AñosMáximo; 
private ClienteTipoEnum ClienteTipo;
private Double TasadeInterés;

    


public CréditoTipo(String Descripción, Double MontoMínimo, Double MontoMáximo, int AñosMínimo, int AñosMáximo, ClienteTipoEnum ClienteTipo, Double TasadeInterés) {
        this.Descripción = Descripción;
        this.MontoMínimo = MontoMínimo;
        this.MontoMáximo = MontoMáximo;
        this.AñosMínimo = AñosMínimo;
        this.AñosMáximo = AñosMáximo;
        this.ClienteTipo = ClienteTipo;
        this.TasadeInterés = TasadeInterés;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public Double getMontoMínimo() {
        return MontoMínimo;
    }

    public void setMontoMínimo(Double MontoMínimo) {
        this.MontoMínimo = MontoMínimo;
    }

    public Double getMontoMáximo() {
        return MontoMáximo;
    }

    public void setMontoMáximo(Double MontoMáximo) {
        this.MontoMáximo = MontoMáximo;
    }

    public int getAñosMínimo() {
        return AñosMínimo;
    }

    public void setAñosMínimo(int AñosMínimo) {
        this.AñosMínimo = AñosMínimo;
    }

    public int getAñosMáximo() {
        return AñosMáximo;
    }

    public void setAñosMáximo(int AñosMáximo) {
        this.AñosMáximo = AñosMáximo;
    }

    public ClienteTipoEnum getClienteTipo() {
        return ClienteTipo;
    }

    public void setClienteTipo(ClienteTipoEnum ClienteTipo) {
        this.ClienteTipo = ClienteTipo;
    }

    public Double getTasadeInterés() {
        return TasadeInterés;
    }

    public void setTasadeInterés(Double TasadeInterés) {
        this.TasadeInterés = TasadeInterés;
    }



    @Override
    public String toString() {
        return "CréditoTipo{" + "Descripción=" + Descripción + ", MontoMínimo=" + MontoMínimo + ", MontoMáximo=" + MontoMáximo + ", AñosMínimo=" + AñosMínimo + ", AñosMáximo=" + AñosMáximo + ", ClienteTipo=" + ClienteTipo + ", TasadeInterés=" + TasadeInterés + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Descripción);
        hash = 97 * hash + Objects.hashCode(this.TasadeInterés);
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
        final CréditoTipo other = (CréditoTipo) obj;
        if (!Objects.equals(this.Descripción, other.Descripción)) {
            return false;
        }
        return Objects.equals(this.TasadeInterés, other.TasadeInterés);
    }


}
