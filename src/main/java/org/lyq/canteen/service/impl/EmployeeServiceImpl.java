package org.lyq.canteen.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lyq.canteen.entity.Employee;
import org.lyq.canteen.mapper.EmployeeMapper;
import org.lyq.canteen.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
