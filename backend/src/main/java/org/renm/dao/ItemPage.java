package org.renm.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.renm.dao.entity.Item;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemPage {
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
    @Singular
    List<Item> items = new ArrayList<Item>();
}
