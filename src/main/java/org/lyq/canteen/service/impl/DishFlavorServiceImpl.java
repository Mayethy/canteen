package org.lyq.canteen.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lyq.canteen.entity.DishFlavor;
import org.lyq.canteen.mapper.DishFlavorMapper;
import org.lyq.canteen.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
