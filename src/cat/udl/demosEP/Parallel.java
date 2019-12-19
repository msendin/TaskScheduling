package cat.udl.demosEP;

public class Parallel extends Composed implements Task  {

    public Parallel() {
        super();
    }

    @Override
    public int durationInDays() {
        int days = 0;

        for (int i=0; i<schedTasks.size(); i++)
            if (schedTasks.get(i).durationInDays() > days)
                days = schedTasks.get(i).durationInDays();

        //tDuration = days;
        //return tDuration;
        return days;
    }
}

