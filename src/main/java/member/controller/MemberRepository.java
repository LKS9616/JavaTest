package member.controller;



import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private List<Member> list = new ArrayList<>(10);

    public void MemberRepository() {

    }

    public void insertMember(Member m) {
        if (list.size() < 10) {
            list.add(m);
        } else{
            throw new OverMemberException("Member list is full");
        }
    }

    public void printData () {
        System.out.println(+ "등급 회원 홍길동의 포인트는 1000이고, 이자 포인트는 20.0입니다.");

    }

    public void printBuyInfo(){

    }


}
