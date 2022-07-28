package dio.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    
    private LocalDate data;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 10d;
    }

    
    

}
