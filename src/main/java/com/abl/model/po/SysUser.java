package com.abl.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Data
@EqualsAndHashCode(callSuper=true)
public class SysUser extends Model {

    /**
     * 主键
     */
    @TableId("id")
    private Integer id;
    /**
     * 用户名
     */
    @TableField("username")
    private String username;
    /**
     * 别名
     */
    @TableField("nickname")
    private String nickname;
    /**
     * 密码
     */
    @TableField("password")
    private String password;
    /**
     * 权限id
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * 权限名称
     */
    @TableField(exist = false)
    private String roleName;
    /**
     * 部门id
     */
    @TableField("dept_id")
    private Integer deptId;
}
