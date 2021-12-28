-- id : mbti, password : 1234
drop table mbti cascade constraints;
create table mbti (
    mbti            VARCHAR2(10)        primary key,
    mbti_name       VARCHAR2(50)        not null,
    mbti_count      NUMBER              not null
);




drop table member cascade constraints;
create table member (
    id              VARCHAR2(20)            primary key,
    mbti            REFERENCES mbti(mbti),
    password        VARCHAR2(30)            not null,
    email           VARCHAR2(50)            not null,
    del             CHAR(1)                 default 'n'         check (del in ('y', 'n')),
    regdate         DATE                    default sysdate
);




drop table m_Board cascade constraints;
create table m_Board (
    mbo_no          NUMBER                  primary key,
    id              REFERENCES member(id),
    mbti            REFERENCES mbti(mbti),
    subject         VARCHAR2(30)            not null,
    content         VARCHAR2(3000)          not null,
    img             VARCHAR2(300),
    likes           NUMBER                  default 0,
    r_count         NUMBER                  default 0,
    report          NUMBER                  default 0,
    del             CHAR(1)                 default 'n'         check (del in ('y', 'n')),
    regdate         DATE                    default sysdate
);




drop table b_Likes cascade constraints;
create table b_Likes (
    mbo_no          REFERENCES m_Board(mbo_no)          primary key, 
    id              REFERENCES member(id)
);




drop table b_Report cascade constraints;
create table b_Report (
    bore_no         NUMBER                         primary key, 
    mbo_no          REFERENCES m_Board(mbo_no),
    id              REFERENCES member(id),
    content         VARCHAR2(50)                 not null,
    del             CHAR(1)                 default 'n'         check (del in ('y', 'n'))
);




drop table reply cascade constraints;
create table reply (
    re_no           NUMBER                        primary key,
    mbo_no          REFERENCES m_Board(mbo_no),
    id              REFERENCES member(id),
    mbti            REFERENCES mbti(mbti),
    content         VARCHAR2(300)          not null,
    likes           NUMBER                  default 0,
    report          NUMBER                  default 0,
    del             CHAR(1)                 default 'n'         check (del in ('y', 'n')),
    regdate         DATE                    default sysdate
);




drop table r_Likes cascade constraints;
create table r_Likes (
    re_no            REFERENCES reply(re_no)         primary key,
    id               REFERENCES member(id)
);




drop table r_Report cascade constraints;
create table r_Report (
    rere_no          NUMBER                         primary key, 
    re_no            REFERENCES reply(re_no),
    id               REFERENCES member(id),
    content          VARCHAR2(50)                   not null,
    del              CHAR(1)                        default 'n'         check (del in ('y', 'n'))
);




drop table q_Board cascade constraints;
create table q_Board(    
    qbo_no          NUMBER                          primary key,
    id              REFERENCES member(id),
    mbti            REFERENCES mbti(mbti),
    subject         VARCHAR2(30)                    not null,
    content         VARCHAR2(3000)                  not null,
    del             CHAR(1)                         default 'n'         check (del in ('y', 'n')),
    regdate         DATE                            default sysdate,
    ref             NUMBER                          not null,
    re_step         NUMBER                          not null,
    re_level        NUMBER                          not null
);