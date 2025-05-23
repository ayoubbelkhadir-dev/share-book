package com.ab.share_book.entity.feedback;

import com.ab.share_book.entity.BaseEntity;
import com.ab.share_book.entity.book.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Feedback  extends BaseEntity {

    @Column
    private Double note;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}