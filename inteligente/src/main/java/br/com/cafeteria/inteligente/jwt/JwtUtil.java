package br.com.cafeteria.inteligente.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Claims;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JwtUtil {

    private final String JwtSecret = "yR7w9ePqzTgIjLmN5yXa4lMZ3jC0oPq9eJdFgHkLmNzR6dPf2gQ8hZbT0xVrWvUxdhakdha93424672jasdajhsgd237agdjdhb1384763eiuqdbajsdg873t7319381937824783da";
    private  final int ExpirationTime = 46000;

    public String GenerateToken(String userName){
        Map<String, Objects>claims = new HashMap<>();
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + ExpirationTime))
                .signWith(SignatureAlgorithm.HS512, JwtSecret)
                .compact();
    }

    public  Boolean validateToken(String token){
        try {
            Jwts.parser().setSigningKey(JwtSecret).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(JwtSecret)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

}
