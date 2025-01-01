package org.lyq.canteen.dto;

import lombok.Data;
import org.lyq.canteen.entity.Dish;
import org.lyq.canteen.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
