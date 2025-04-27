package org.example.gate;

public class ExitGate implements Gate {
    private final int gateId;

    public ExitGate(int id) {
        this.gateId = id;
    }

    @Override
    public int getGateId() {
        return gateId;
    }
}
