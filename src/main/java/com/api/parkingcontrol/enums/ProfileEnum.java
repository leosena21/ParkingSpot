package com.api.parkingcontrol.enums;

import lombok.Getter;

@Getter
public enum ProfileEnum {

    ADMIN(1, "ROLE_ADMIN");

    private int cod;
    private String descricao;

    private ProfileEnum(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public static ProfileEnum toEnum(Integer cod) {

        if(cod==null) {
            return null;
        }

        for(ProfileEnum x : ProfileEnum.values()) {
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id Inválido: " + cod);
    }
}
