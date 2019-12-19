package cat.udl.demosEP;

public class Sequential extends Composed implements Task {

    public Sequential() {
        super();
    }

    @Override
    public int durationInDays() {
        int days = 0;

        for (int i=0; i<schedTasks.size(); i++)
            days += schedTasks.get(i).durationInDays();

        //tDuration = days;
        //return tDuration;
        return days;
    }
}
