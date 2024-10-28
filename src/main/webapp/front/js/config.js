
var projectName = '高校疫情管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '疫情资讯',
	url: './pages/yiqingzixun/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm1i23q/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"疫情资讯","menuJump":"列表","tableName":"yiqingzixun"}],"menu":"疫情资讯管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生居家信息","menuJump":"列表","tableName":"xueshengjujiaxinxi"}],"menu":"学生居家信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"学生返校申请","menuJump":"列表","tableName":"xueshengfanxiaoshenqing"}],"menu":"学生返校申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教师居家信息","menuJump":"列表","tableName":"jiaoshijujiaxinxi"}],"menu":"教师居家信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"教师返校申请","menuJump":"列表","tableName":"jiaoshifanxiaoshenqing"}],"menu":"教师返校申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生健康打卡","menuJump":"列表","tableName":"xueshengjiankangdaka"}],"menu":"学生健康打卡管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教师健康打卡","menuJump":"列表","tableName":"jiaoshijiankangdaka"}],"menu":"教师健康打卡管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"学生请假","menuJump":"列表","tableName":"xueshengqingjia"}],"menu":"学生请假管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"疫情资讯列表","menuJump":"列表","tableName":"yiqingzixun"}],"menu":"疫情资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看"],"menu":"学生居家信息","menuJump":"列表","tableName":"xueshengjujiaxinxi"}],"menu":"学生居家信息管理"},{"child":[{"buttons":["新增","查看"],"menu":"学生返校申请","menuJump":"列表","tableName":"xueshengfanxiaoshenqing"}],"menu":"学生返校申请管理"},{"child":[{"buttons":["新增","查看"],"menu":"学生健康打卡","menuJump":"列表","tableName":"xueshengjiankangdaka"}],"menu":"学生健康打卡管理"},{"child":[{"buttons":["新增","查看"],"menu":"学生请假","menuJump":"列表","tableName":"xueshengqingjia"}],"menu":"学生请假管理"},{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"疫情资讯列表","menuJump":"列表","tableName":"yiqingzixun"}],"menu":"疫情资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看"],"menu":"教师居家信息","menuJump":"列表","tableName":"jiaoshijujiaxinxi"}],"menu":"教师居家信息管理"},{"child":[{"buttons":["新增","查看"],"menu":"教师返校申请","menuJump":"列表","tableName":"jiaoshifanxiaoshenqing"}],"menu":"教师返校申请管理"},{"child":[{"buttons":["新增","查看"],"menu":"教师健康打卡","menuJump":"列表","tableName":"jiaoshijiankangdaka"}],"menu":"教师健康打卡管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"疫情资讯列表","menuJump":"列表","tableName":"yiqingzixun"}],"menu":"疫情资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
