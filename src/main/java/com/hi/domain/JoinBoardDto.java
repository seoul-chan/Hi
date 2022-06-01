package com.hi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor // 자동으로 모든 매개변수를 받는 생성자를 생성
public class JoinBoardDto {
    private Integer board_id;
    private String title;
    private LocalDateTime create_at;
    private LocalDateTime update_at;
    private String region;
    private LocalDate go_with_start;
    private LocalDate go_with_end;
    private String content;
    private String nickname;
    private String gender;
    private Integer together;

    public JoinBoardDto(String title, String content, String nickname, String gender, Integer together) {
        this.title = title;
        this.content = content;
        this.nickname = nickname;
        this.gender = gender;
        this.together = together;
    }

    @Override
    public String toString() {
        return "JoinBoardDto{" +
                "board_id=" + board_id +
                ", title='" + title + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", region='" + region + '\'' +
                ", go_with_start=" + go_with_start +
                ", go_with_end=" + go_with_end +
                ", content='" + content + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", together='" + together + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoinBoardDto that = (JoinBoardDto) o;
        return board_id.equals(that.board_id) && title.equals(that.title) && create_at.equals(that.create_at) && update_at.equals(that.update_at) && region.equals(that.region) && go_with_start.equals(that.go_with_start) && go_with_end.equals(that.go_with_end) && content.equals(that.content) && nickname.equals(that.nickname) && gender.equals(that.gender) && together.equals(that.together);
    }

    @Override
    public int hashCode() {
        return Objects.hash(board_id, title, create_at, update_at, region, go_with_start, go_with_end, content, nickname, gender, together);
    }
}
