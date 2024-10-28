import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yiqingzixun from '@/views/modules/yiqingzixun/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import jiaoshijujiaxinxi from '@/views/modules/jiaoshijujiaxinxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import xueshengjujiaxinxi from '@/views/modules/xueshengjujiaxinxi/list'
    import users from '@/views/modules/users/list'
    import jiaoshijiankangdaka from '@/views/modules/jiaoshijiankangdaka/list'
    import jiaoshifanxiaoshenqing from '@/views/modules/jiaoshifanxiaoshenqing/list'
    import xueshengqingjia from '@/views/modules/xueshengqingjia/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import xueshengfanxiaoshenqing from '@/views/modules/xueshengfanxiaoshenqing/list'
    import xueshengjiankangdaka from '@/views/modules/xueshengjiankangdaka/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yiqingzixun',
        name: '疫情资讯',
        component: yiqingzixun
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/jiaoshijujiaxinxi',
        name: '教师居家信息',
        component: jiaoshijujiaxinxi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/xueshengjujiaxinxi',
        name: '学生居家信息',
        component: xueshengjujiaxinxi
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/jiaoshijiankangdaka',
        name: '教师健康打卡',
        component: jiaoshijiankangdaka
      }
      ,{
	path: '/jiaoshifanxiaoshenqing',
        name: '教师返校申请',
        component: jiaoshifanxiaoshenqing
      }
      ,{
	path: '/xueshengqingjia',
        name: '学生请假',
        component: xueshengqingjia
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/xueshengfanxiaoshenqing',
        name: '学生返校申请',
        component: xueshengfanxiaoshenqing
      }
      ,{
	path: '/xueshengjiankangdaka',
        name: '学生健康打卡',
        component: xueshengjiankangdaka
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
