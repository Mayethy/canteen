package org.lyq.canteen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lyq.canteen.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
