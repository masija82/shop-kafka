package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class InventroryDecreased extends AbstractEvent {

    private Long id;

    public InventroryDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventroryDecreased() {
        super();
    }
}
