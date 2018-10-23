package com.alevel;

import java.util.Scanner;

public class ArithmeticProgression {
    private static final int DEFAULT_STEP = 1;
    private final int initial;
    private final int step;

    public ArithmeticProgression(int initial, int step) throws ProgressionConfigurationException {
        if (step == 0) {
            throw new ProgressionConfigurationException("Step cannot be 0");
        }
        this.initial = initial;
        this.step = step;
    }

    public ArithmeticProgression(int initial) {
        this.initial = initial;
        this.step = DEFAULT_STEP;

    }

    public int calculate(int n) throws ProgressionConfigurationException {
        if (n <= 0) {
            throw new ProgressionConfigurationException("N should be positive");
        }
        int result = initial;
        for (int i = 0; i < n; i++) {
            result += step;
        }
        return result;
    }

    public static void main(String[] args) {
        ArithmeticProgression progression;
        ProgressionConfig progressionConfig = new ProgressionConfig().getConfig();

        int initial = progressionConfig.getInitial();
        int step = progressionConfig.getStep();
        int n = progressionConfig.getN();



        try {
            progression = new ArithmeticProgression(initial, step);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
            progression = new ArithmeticProgression(initial);
        }

        try {
            System.out.println(progression.calculate(n));
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
        }
    }

    private static class ProgressionConfig {
        private Scanner scanner;
        private int initial;
        private int step;
        private int n;

        public int getInitial() {
            return initial;
        }

        public int getStep() {
            return step;
        }

        public int getN() {
            return n;
        }

        public ProgressionConfig getConfig() {
            scanner = new Scanner(System.in);
            initial = scanner.nextInt();
            step = scanner.nextInt();
            n = scanner.nextInt();
            scanner.close();
            return this;

        }
    }
}
