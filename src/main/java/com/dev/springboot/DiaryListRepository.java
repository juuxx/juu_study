package com.dev.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryListRepository extends JpaRepository<Diary, Long> {

    List<Diary> findByUser(String user);
    //브런치 푸쉬용
}
