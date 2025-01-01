package org.lyq.canteen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.lyq.canteen.entity.Employee;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
