package test;

import com.zhennan.entity.Account;
import com.zhennan.entity.Classes;
import com.zhennan.entity.Customer;
import com.zhennan.entity.Student;
import com.zhennan.repository.AccountRepository;
import com.zhennan.repository.ClassesRepository;
import com.zhennan.repository.CustomerRepository;
import com.zhennan.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //加载mybatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接⼝的代理对象
        StudentRepository studentRepository =
                sqlSession.getMapper(StudentRepository.class);

        //查询全部对象
        Student student = studentRepository.findByIdLazy(2L);
        System.out.println(student);
        sqlSession.close();


    }
}
