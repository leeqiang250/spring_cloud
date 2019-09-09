package cn.user.entity;

import io.swagger.annotations.Api;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "test")
@Api("Test")
public class Test extends cn.common.util.Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long createtime = 0L;

    private long updatetime = 0L;

    private String test;

}