package com.goit.gojavaonline1;

import java.util.List;

public class RoseBush extends Flower {
     List<Rose> rose;


    public void setRose(List<Rose> rose) {
        this.rose = rose;
    }

    @SuppressWarnings("unchecked")
    public com.goit.gojavaonline1.List<Rose> getRose() {
        return (com.goit.gojavaonline1.List<Rose>) rose;
    }
}
