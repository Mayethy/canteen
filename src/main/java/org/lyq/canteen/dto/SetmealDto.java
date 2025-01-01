package org.lyq.canteen.dto;


import lombok.Data;
import org.lyq.canteen.entity.Setmeal;
import org.lyq.canteen.entity.SetmealDish;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
