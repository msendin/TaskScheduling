package cat.udl.demosEP;

import java.math.BigDecimal;

public interface Task {
    //BigDecimal cost = new BigDecimal("0,0");
    //int duration = 0;
    // ********   NO: pq només poden ser final, i no es poden modificat si definides a la interface

    public BigDecimal costInEuros();
    public int durationInDays();
}
