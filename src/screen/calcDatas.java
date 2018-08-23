package screen;

import java.text.SimpleDateFormat;
import java.util.Date;


public class calcDatas {
    private Date dataInicio;
    private Date dataFim;

    public calcDatas(){}
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        
         
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        String formato = "dd/MM/yyyy";
         SimpleDateFormat formatter = new SimpleDateFormat(formato);
         formatter.format(dataFim);
        this.dataFim = dataFim;
        
    }

    String getDataFim(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
