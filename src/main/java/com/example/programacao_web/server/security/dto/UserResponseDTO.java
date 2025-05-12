package com.example.programacao_web.server.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private String displayName;
    private String username;
    private Set<AuthorityResponseDTO> authorities;

    public UserResponseDTO(com.example.programacao_web.server.models.User user) {
        this.username = user.getUsername();
        this.authorities = new HashSet<>();
        for (GrantedAuthority authority: user.getAuthorities()) {
            authorities.add( new AuthorityResponseDTO(authority.getAuthority()));
        }
    }

}