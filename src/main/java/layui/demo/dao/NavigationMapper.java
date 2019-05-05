package layui.demo.dao;

import layui.demo.pojo.Navigation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NavigationMapper {
    List<Navigation> getnavigationListByPId(@Param("pid") Integer pid);
    List<Navigation> getNavigationByPid();
}
