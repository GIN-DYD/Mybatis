import com.dyd.dao.StudentMapper;
import com.dyd.dao.TeacherMapper;
import com.dyd.pojo.Student;
import com.dyd.pojo.Teacher;
import com.dyd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
