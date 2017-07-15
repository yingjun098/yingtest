package org.ying.model;

public class Airline {
    private Long ariid;

    private Integer originid;

    private Integer destinationid;

    public Long getAriid() {
        return ariid;
    }

    public void setAriid(Long ariid) {
        this.ariid = ariid;
    }

    public Integer getOriginid() {
        return originid;
    }

    public void setOriginid(Integer originid) {
        this.originid = originid;
    }

    public Integer getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(Integer destinationid) {
        this.destinationid = destinationid;
    }
}