package com.jackie.library;

import com.jackie.library.domain.dto.AuthorDto;
import com.jackie.library.domain.dto.BookDto;
import com.jackie.library.domain.entities.AuthorEntity;
import com.jackie.library.domain.entities.BookEntity;

public final class TestDataUtil {
//    private TestDataUtil() {
//
//    }

    public static AuthorEntity createTestAuthorEntityA() {
        return AuthorEntity.builder()
                .id(1L)
                .name("Jackie Nguyen")
                .age(80)
                .build();
    }

    public static AuthorDto createTestAuthorDtoA() {
        return AuthorDto.builder()
                .id(1L)
                .name("Jackie Nguyen")
                .age(80)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .id(2L)
                .name("Viet An")
                .age(21)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .id(3L)
                .name("An Nguyen")
                .age(20)
                .build();
    }

    public static BookEntity createTestBookEntityA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Jackie")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookDto createTestBookDtoA(final AuthorDto authorDto) {
        return BookDto.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Jackie")
                .author(authorDto)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity author) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-1")
                .title("Beyond the Jackie")
                .authorEntity(author)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity author) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-2")
                .title("The last Jackie")
                .authorEntity(author)
                .build();
    }
}
