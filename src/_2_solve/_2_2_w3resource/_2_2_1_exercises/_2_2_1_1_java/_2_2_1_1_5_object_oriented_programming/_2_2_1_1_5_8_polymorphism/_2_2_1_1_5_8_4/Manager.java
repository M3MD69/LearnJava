package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_8_polymorphism._2_2_1_1_5_8_4;

class Manager extends Employee {
    private float baseSalary;
    private final float BONUS;

    Manager(final String NAME, final float BASE_SALARY, final float BONUS) {
        super(NAME, "Manager");
        this.baseSalary = BASE_SALARY;
        this.BONUS = BONUS;
    }

    @Override
    float calculateSalary() {
        return baseSalary += BONUS;
    }
}