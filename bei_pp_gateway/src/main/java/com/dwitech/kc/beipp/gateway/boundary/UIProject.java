package com.dwitech.kc.beipp.gateway.boundary;

import java.sql.Timestamp;

import static javax.json.bind.JsonbBuilder.create;

public class UIProject {
    public String code;
    public String title;
    public String statusUpdate;
    public String observation;
    public Timestamp dateCreated;
    public Timestamp lastUpdated;

    @Override public String toString() { return create().toJson(this); }
}