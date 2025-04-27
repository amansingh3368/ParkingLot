package org.example.gate;

public class EntryGate implements Gate {
    private final int gateId;

    public EntryGate(int id) {
        this.gateId = id;
    }

    @Override
    public int getGateId() {
        return gateId;
    }
}
