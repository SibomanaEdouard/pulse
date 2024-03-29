package com.bant.pulse.model.likes;

import com.bant.pulse.model.user.User;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Data
@Entity
@Table(name = "posts_likes")
public class Like {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "liker_id",
            nullable = false
    )
    private User liker;

}
