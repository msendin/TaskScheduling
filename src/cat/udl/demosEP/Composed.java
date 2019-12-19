package cat.udl.demosEP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Composed implements Task {
    List<Task> schedTasks;
    BigDecimal tCost;   // L'ús d'aquest atribut evita haver de fer sempre el bucle al mètode costInEuros()
    //int tDuration;

    public Composed() {
        schedTasks = new ArrayList<>();
        tCost = new BigDecimal(0.0);
        //tDuration = 0;
    }

    public void addSubtask(Task subtask) {
        schedTasks.add(subtask);
        tCost = tCost.add(subtask.costInEuros());  // Sobra si es fa el bucle a costInEuros()
    }

    @Override
    public BigDecimal costInEuros() {
        BigDecimal days = new BigDecimal("0.0");

        for (int i=0; i<schedTasks.size(); i++)
            days = days.add(schedTasks.get(i).costInEuros());
        return days;
        //return tCost;  // Evita haver de fer el bucle x calcular el cost cada cop
    }

    //@Override
    //public abstract int durationInDays();
}




