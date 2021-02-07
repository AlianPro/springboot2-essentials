package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.domain.DevDojoUser;

public class DevDojoUserCreator {

    public static final DevDojoUser DEV_DOJO_USER(){
        return DevDojoUser.builder()
                .name("alian2")
                .password("academy")
                .username("alian2")
                .authorities("ROLE_USER")
                .build();
    }

    public static final DevDojoUser DEV_DOJO_ADMIN(){
        return DevDojoUser.builder()
                .name("alian")
                .password("academy")
                .username("alian")
                .authorities("ROLE_ADMIN,ROLE_USER")
                .build();
    }
}
