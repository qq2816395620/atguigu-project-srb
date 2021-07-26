package com.soraka.srb.core.service.impl;

import com.soraka.srb.core.pojo.entity.UserAccount;
import com.soraka.srb.core.mapper.UserAccountMapper;
import com.soraka.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-07-26
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
