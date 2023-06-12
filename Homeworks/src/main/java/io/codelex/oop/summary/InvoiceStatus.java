package io.codelex.oop.summary;

public enum InvoiceStatus {
    APPROVED("APPROVED"),
    SENT("SENT");

    private final String status;

    InvoiceStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return status;
    }
}



