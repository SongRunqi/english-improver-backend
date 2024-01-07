package com.ei.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * @author 86157
 * @date 2023/12/17
 */

public class JwtUtil {
    private static final String secret = "english-improver"; // 使用随机秘钥

    /**
     * 生成jwt token
     * @param
     * @return token
     */
    public static String generateToken() {
        long nowMills = System.currentTimeMillis();
        Date now = new Date(nowMills);
        // 过期时间
        long expire = 3600L;
        Date expireDate = new Date(nowMills + expire * 1000);
        return JWT.create()
                .withClaim("username", "user.getUsername()")
                .withClaim("id", "user.getId()")
                .withIssuedAt(now)
                .withExpiresAt(expireDate)
                .sign(com.auth0.jwt.algorithms.Algorithm.HMAC256(secret));
    }

    /**
     * 从token中获取用户id
     * @param token token
     * @return 用户id
     */
    public static String getUserIdFromToken(String token) {
        return JWT.decode(token).getClaim("id").asString();
    }
    /**
     * 判断token是否已经失效
     * @param jwt jwt
     * @return 是否已经失效
     */
    private static boolean isTokenExpired(DecodedJWT jwt) {
        return jwt.getExpiresAt().before(new Date());
    }
    /**
     * 校验token是否正确
     * @param token token
     * @return 是否正确
     */
    public static boolean validateToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(secret); // 使用相同的密钥
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("auth0")
                .build(); // 创建验证器
        DecodedJWT jwt = verifier.verify(token); // 验证令牌
        return !isTokenExpired(jwt); // 判断是否已经失效
    }

}
