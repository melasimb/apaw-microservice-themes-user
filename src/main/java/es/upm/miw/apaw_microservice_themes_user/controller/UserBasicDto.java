package es.upm.miw.apaw_microservice_themes_user.controller;

import es.upm.miw.apaw_microservice_themes_user.exceptions.BadRequestException;

public class UserBasicDto {

    private String id;

    private String nick;

    public UserBasicDto() {
        // Empty for framework
    }

    public UserBasicDto(User user) {
        this.id = user.getId();
        this.nick = user.getNick();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void validateNick() {
        if (this.nick == null || this.nick.isEmpty()) {
            throw new BadRequestException("Incomplete, lost nick");
        }
    }

    @Override
    public String toString() {
        return "UserBasicDto{" +
                "id='" + id + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
