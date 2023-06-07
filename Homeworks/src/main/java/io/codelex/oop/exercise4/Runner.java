package io.codelex.oop.exercise4;

public enum Runner {
    BEGINNER(350.0, 450.0),
    INTERMEDIATE(250.0, 300.0),
    ADVANCED(100.0, 150.0);

    double minRunTime;
    double maxRunTime;

    Runner(double minRunTime, double maxRunTime) {
        this.minRunTime = minRunTime;
        this.maxRunTime = maxRunTime;
    }

    public double getMinRunTime() {
        return minRunTime;
    }

    public double getMaxRunTime() {
        return maxRunTime;
    }
    public static Runner getFitnessLevel(int marathonTime){
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.getMinRunTime() && marathonTime <= runner.getMaxRunTime()) {
                return runner;
            }
        }
        return null;
    }
}
