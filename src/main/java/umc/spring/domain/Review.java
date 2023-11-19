package umc.spring.domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.domain.common.BaseEntity;
import umc.spring.enums.Grade;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Grade grade;

    @Column(nullable = false, length = 40)
    private String title;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String content;

    @Column(columnDefinition = "VARCHAR(255)")
    private String reply;

    @Column(nullable = false)
    private LocalDate visitDate;

    @ManyToOne
    private Store store;

    @ManyToOne
    private User user;
}
