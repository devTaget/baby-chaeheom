package com.app.babybaby.entity.user;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString(exclude = {"following", "follower"})
@Table(name = "TBL_FOLLOW")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Follow {
    @Id @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOLLOWING_ID")
    private User following;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOLLOWER_ID")
    private User follower;
}