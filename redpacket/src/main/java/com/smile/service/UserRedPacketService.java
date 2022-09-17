package com.smile.service;

/**
 * @author 12780
 */
public interface UserRedPacketService {
    /**
     * 保存抢红包的信息
     *
     * @param redPacketId
     * @param userId
     * @return
     */
    int grabRedPacket(Long redPacketId, Long userId);
}
