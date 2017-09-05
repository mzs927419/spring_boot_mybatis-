/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Contact mengzs.java@qq.com
 */
package costom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mzs.costom.Application;
import com.mzs.costom.mapper.SysuserMapper;
import com.mzs.costom.model.Sysuser;

/**
 * @Author mengzs
 * @Email mengzs.java@qq.com
 * @Phone 13211786302
 * @Date 2017年9月5日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@WebAppConfiguration
public class CRUDMapper {

	@Autowired
	private SysuserMapper sysuserMapper;

	@Test
	public void test1() {
		try {
			Sysuser record = new Sysuser();
			record.setUsername("mzs");
			record.setPassword("123456");
			sysuserMapper.insert(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
