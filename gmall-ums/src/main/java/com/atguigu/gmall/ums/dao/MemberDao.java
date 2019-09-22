package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yancxiaofei
 * @email yxfstart@126.com
 * @date 2019-09-22 20:30:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
