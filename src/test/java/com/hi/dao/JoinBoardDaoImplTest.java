package com.hi.dao;

import com.hi.domain.JoinBoardDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JoinBoardDaoImplTest {
    @Autowired
    JoinBoardDaoImpl joinBoardDao;

    @Test
    public void insertTestData() throws Exception{
        for(int i=1;i<=200;i++){
            String gender = (i%2==0?"남":"여");
            String nickname = (i%2==0?"sujin":"chan");
            JoinBoardDto boardDto = new JoinBoardDto("title"+i,"content"+(i+100),nickname+i,gender,2);
            joinBoardDao.insert(boardDto);
        }
    }

    @Test
    void select() {
        JoinBoardDto joinBoardDto = joinBoardDao.select(20);
        assertTrue(joinBoardDao.select(20).equals(joinBoardDto));
        System.out.println(joinBoardDto);
    }

    @Test
    void selectAll() {

    }

    @Test
    void insert() {
        JoinBoardDto joinBoardDto = new JoinBoardDto("title","치맥 동행자","chan","남",3);
        assertTrue(joinBoardDao.insert(joinBoardDto)==1);
    }

    @Test
    void update() {
        JoinBoardDto joinBoardDto = new JoinBoardDto("title222","치맥 동행자","chan","남",4);
        joinBoardDto.setBoard_id(1);
        assertTrue(joinBoardDao.update(joinBoardDto)==1);
    }

    @Test
    void delete() {
        assertTrue(joinBoardDao.delete(2)==1);
    }

    @Test
    void count() {
        assertTrue(joinBoardDao.count()==0);
    }

    @Test
    void increaseViewCnt() {

    }
}