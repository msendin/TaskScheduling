package cat.udl.demosEP;

import java.math.BigDecimal;

public class Simple implements Task {
    BigDecimal cost;
    int duration;

    public Simple(BigDecimal euros, int days) {
        this.cost = euros;
        this.duration = days;
    }

    @Override
    public BigDecimal costInEuros() {
        return cost;
    }

    @Override
    public int durationInDays() {
        return duration;
    }

}
