## 目录结构
```text
bee-cas-admin
├── bee-cas-biz            # 应用服务、领域服务处理层，接口层所声明接口的具体实现
├── bee-cas-domain         # 领域层
├── bee-cas-service        # 接口层, 通过 RPC 调用的方式对外提供二方服务。
├── bee-cas-web            # REST 接口
```

|  表头   | 表头  |
|  ----  | ----  |
| 单元格  | 单元格 |
| 单元格  | 单元格 |


<table>
    <tr bgcolor="CornflowerBlue">
        <th>层</th>
        <th>聚合</th>
        <th>领域对象名称</th>
        <th>领域类型</th>
        <th>依赖对象</th>
        <th>包名</th>
        <th>类名</th>
        <th>方法名</th>
    </tr>
    <tr>
        <td rowspan="3">应用层</td>
        <td>/</td>
        <td>应用服务</td>
        <td>应用服务</td>
        <td></td>
        <td>org.okboom.bee.cas.application.service</td>
        <td>AuthenticationApplicationService</td>
        <td>应用服务</td>
    </tr>
    <tr>
        <td>/</td>
        <td>
            应用服务:
            查询部门应用服务
        </td>
        <td>应用服务</td>
        <td></td>
        <td>org.okboom.bee.cas.application.service</td>
        <td>AuthenticationApplicationService</td>
        <td>应用服务</td>
    </tr>
    <tr>
        <td>/</td>
        <td>
            应用服务:
            查询部门应用服务
        </td>
        <td>应用服务</td>
        <td></td>
        <td>org.okboom.bee.cas.application.service</td>
        <td>AuthenticationApplicationService</td>
        <td>应用服务</td>
    </tr>
    <tr>
        <td rowspan="3">领域层</td>
        <td>用户</td>
        <td>用户</td>
        <td>聚合根</td>
        <td></td>
        <td>org.okboom.bee.cas.domain.user</td>
        <td>UserInfo</td>
        <td></td>
    </tr>
    <tr>
        <td rowspan="3">领域层</td>
        <td>系统功能</td>
        <td>系统功能</td>
        <td>聚合根</td>
        <td></td>
        <td>org.okboom.bee.cas.domain.user</td>
        <td>System</td>
        <td></td>
    </tr>
</table>

