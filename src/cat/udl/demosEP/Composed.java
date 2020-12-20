package cat.udl.demosEP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Composed implements Task {
    List<Task> schedTasks;
    BigDecimal cost;
    int duration;

    public Composed() {
        schedTasks = new ArrayList<>();
        cost = new BigDecimal("0.0");
        duration = 0;
    }

    public void addSubtask(Task subtask) {
        schedTasks.add(subtask);
        cost = cost.add(subtask.costInEuros());
    }

    @Override
    public BigDecimal costInEuros() {
        BigDecimal days = new BigDecimal("0.0");
        /*
        for (int i=0; i<schedTasks.size(); i++)
            days = days.add(schedTasks.get(i).costInEuros());
        return days;
         */
        return cost;  // Us de l'atribut cos; evita haver de recòrrer el bucle per calcular el cost cada cop
    }





    //@Override
    //public abstract int durationInDays();
}




