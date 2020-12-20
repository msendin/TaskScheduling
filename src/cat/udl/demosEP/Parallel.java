package cat.udl.demosEP;

public class Parallel extends Composed implements Task  {

    public Parallel() {
        super();
    }

    @Override
    public int durationInDays() {
        int days = 0;

        for (Task schedTask : schedTasks)
            if (schedTask.durationInDays() > days)
                days = schedTask.durationInDays();
        duration = days;
        return duration;
    }
}

