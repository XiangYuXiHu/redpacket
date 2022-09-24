package com.smile.redpacket.mapper;

import com.smile.redpacket.domain.UserRedPacket;

import java.util.List;

/**
 * @author 12780
 */
public interface UserRedPacketMapper {
    /**
     * 记录抢红包信息
     *
     * @param redPackets
     * @return
     */
    int batchInsert(List<UserRedPacket> redPackets);
}
