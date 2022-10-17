package ru.mail.polis.homework.oop.vet;

public class Cat extends Animal implements Pet {
    private static final int NUMBER_OF_LEGS = 4;
    private static final String VOICE = "Mow-Mow";
    private static final MoveType MOVE_TYPE = MoveType.RUN;

    @Override
    public String say() {
        return VOICE;
    }

    @Override
    public MoveType moveType() {
        return MOVE_TYPE;
    }

    @Override
    public int getLegs() {
        return NUMBER_OF_LEGS;
    }
}
