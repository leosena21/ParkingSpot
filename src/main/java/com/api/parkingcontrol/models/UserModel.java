package com.api.parkingcontrol.models;

import com.api.parkingcontrol.enums.ProfileEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Table(name = "TB_USUARIO")
@Data
@AllArgsConstructor
@Builder
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="PROFILE")
    private Set<Integer> profile = new HashSet<>();

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    public UserModel() {
        addPerfil(ProfileEnum.ADMIN);
    }

    public UserModel(UUID id, String name, String email, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        addPerfil(ProfileEnum.ADMIN);
    }

    public void addPerfil(ProfileEnum profileEnum) {
        profile.add(profileEnum.getCod());
    }

    public Set<ProfileEnum> getProfile(){
        return profile.stream().map(x-> ProfileEnum.toEnum(x)).collect(Collectors.toSet());
    }
}
