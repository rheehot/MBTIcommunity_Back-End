package KJW.MBTIcoummunity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "mbti_type")
    String mbtiType;

    public static User toEntity(signupRequest dto){
        return User.builder()
                .mbtiType(dto.mbtiType)
                .password(dto.password)
                .username(dto.username)
                .build();
    }
}
