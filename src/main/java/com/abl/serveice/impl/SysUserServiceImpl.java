package com.abl.serveice.impl;

import com.abl.mapper.SysUserMapper;
import com.abl.model.po.SysUser;
import com.abl.serveice.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


}
