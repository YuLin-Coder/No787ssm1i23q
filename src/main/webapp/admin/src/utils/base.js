const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1i23q/",
            name: "ssm1i23q",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1i23q/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校疫情管理系统"
        } 
    }
}
export default base
