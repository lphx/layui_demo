package layui.demo.service.impl;

import layui.demo.dao.NavigationMapper;
import layui.demo.pojo.Navigation;
import layui.demo.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Autowired
    NavigationMapper navigationMapper;

    public Map<String,Object> findMenu(){
        Map<String,Object> data = new HashMap<>();
        //按照pid获取到根目录进行存储对应的子目录
        List<Navigation> navId = navigationMapper.getNavigationByPid();
        for(Navigation nav : navId){
            List<Navigation> navigationListByPId = navigationMapper.getnavigationListByPId(nav.getId());
            nav.setChildrens(navigationListByPId);
        }
        data.put("menu",navId);
        return data;

    }

}
