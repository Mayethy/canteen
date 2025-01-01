package org.lyq.canteen.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.lyq.canteen.entity.SetmealDish;
import org.lyq.canteen.mapper.SetmealDishMapper;
import org.lyq.canteen.service.SetmealDishService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
