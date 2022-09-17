package com.smile.mapper;

import com.smile.domain.RedPacket;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 12780
 */
@Mapper
public interface RedPacketMapper {

    /**
     * 获取红包信息
     *
     * @param id
     * @return
     */
    RedPacket getRedPacket(Long id);

    /**
     * 扣减红包
     *
     * @param id
     * @return
     */
    Integer decreaseRedPacket(Long id);
}
