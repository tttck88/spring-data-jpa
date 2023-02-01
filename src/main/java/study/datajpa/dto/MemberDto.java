package study.datajpa.dto;

import lombok.Data;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String temName;

    public MemberDto(Long id, String username, String temName) {
        this.id = id;
        this.username = username;
        this.temName = temName;
    }
}
