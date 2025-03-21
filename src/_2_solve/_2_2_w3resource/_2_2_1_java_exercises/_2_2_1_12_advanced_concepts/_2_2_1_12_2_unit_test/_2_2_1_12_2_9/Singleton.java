package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_12_advanced_concepts._2_2_1_12_2_unit_test._2_2_1_12_2_9;

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    protected static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        return instance;
    }
}