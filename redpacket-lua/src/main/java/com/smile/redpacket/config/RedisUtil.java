package com.smile.redpacket.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.scripting.support.ResourceScriptSource;

import java.io.Serializable;

/**
 * @Description
 * @ClassName RedisUtil
 * @Author smile
 * @date 2022.09.24 08:51
 */
@Configuration
public class RedisUtil {

    @Bean(name = "redisTemplate")
    public RedisTemplate initRedisTemplate(LettuceConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        // 设置string类型序列化规则
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new StringRedisSerializer());
        // 设置hash类型序列化规则
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new StringRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public DefaultRedisScript<String> defaultRedisScript() {
        DefaultRedisScript<String> defaultRedisScript = new DefaultRedisScript<>();
        defaultRedisScript.setResultType(String.class);
        defaultRedisScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("lua/demo.lua")));
        return defaultRedisScript;
    }
}
