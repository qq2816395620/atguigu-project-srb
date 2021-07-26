package com.soraka.srb.core.service.impl;

import com.soraka.srb.core.pojo.entity.UserInfo;
import com.soraka.srb.core.mapper.UserInfoMapper;
import com.soraka.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-07-26
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
