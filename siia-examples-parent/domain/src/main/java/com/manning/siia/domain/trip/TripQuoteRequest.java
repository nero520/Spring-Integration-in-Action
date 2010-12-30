package com.manning.siia.domain.trip;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


/**
 * @author Jonas Partner
 */

public class TripQuoteRequest {

    private List<LegQuoteCommand> legQuoteCommands;

    private TripQuoteRequest() {
    }

    public TripQuoteRequest(List<LegQuoteCommand> legQuoteCommands){
        this.legQuoteCommands = legQuoteCommands;
    }

    public List<LegQuoteCommand> getLegQuoteRequests() {
        return legQuoteCommands;
    }

    public void setLegQuoteRequests(List<LegQuoteCommand> legQuoteCommands) {
        this.legQuoteCommands = legQuoteCommands;
    }
    
}
