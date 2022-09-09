<template>
  <div>
<!--    头部-->

    <div style="display: flex; height: 60px; line-height: 60px; border-bottom: 1px">
<!--        <ul style="ba">-->
      <div style="width: 300px; display: flex; padding-left: 30px;background-color:#9999FF ">
        <div style="width: 60px">
          <img src="https://gimg0.baidu.com/gimg/src=https%3A%2F%2Fappdown.baidu.com%2Fimg%2F0%2F512_512%2F244d263299e954004a6475b171586157.png&app=2000&size=b189,257&n=0&g=4n&q=90&fmt=jpeg?sec=0&t=9f4f26a591eddc775acdaf04f8e7a02e" alt="" style="width: 50px; position: relative; top: 5px; right: 0">
        </div>
        <div style="flex: 1">欢迎来到枝江推荐系统</div>
      </div>
<!--      </ul>-->
      <div style="flex: 1; border-bottom: 1px">

        <ul style="list-style: none ;background-color: #9999FF">
            <li class="item"><a href="/front/home">电影首页</a></li>
<!--            <li class="item"><a href="/front/video">电影首页</a></li>-->
            <li class="item"><a href="/front/recommend">为你推荐</a></li>
            <li class="item"><a href="/front/score">电影打分</a></li>
        </ul>
      </div>
      <div style="width: 200px ; background-color:#9999FF">
        <div v-if="!user.username" style="text-align: right; padding-right: 30px ">
          <el-button @click="$router.push('/login')">登录</el-button>
          <el-button @click="$router.push('/register')">注册</el-button>
        </div>
        <div v-else>
            <el-dropdown style="width: 150px; cursor: pointer; text-align: right">
                <div style="display: inline-block">
                    <img :src="user.avatarUrl" alt=""
                         style="width: 30px; border-radius: 50%; position: relative; top: 10px; right: 5px">
                    <span>{{ user.nickname }}</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
                </div>
                <el-dropdown-menu slot="dropdown" style="width: 100px; text-align: center">
                    <el-dropdown-item style="font-size: 14px; padding: 5px 0">
                        <router-link to="/password">修改密码</router-link>
                    </el-dropdown-item>
                    <el-dropdown-item style="font-size: 14px; padding: 5px 0">
                        <router-link to="/person">个人信息</router-link>
                    </el-dropdown-item>
                    <el-dropdown-item style="font-size: 14px; padding: 5px 0">
                        <div style="text-decoration: none"  @click="logout">退出</div>
                    </el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </div>
      </div>
    </div>

    <div style="width: 1000px; margin: 0 auto">
      <router-view />
    </div>
  </div>
</template>

<script>
export default {
  name: "Front",
  data() {
    return {
      user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {}
    }
  },
  created() {

  },
  methods: {
    logout() {
      this.$store.commit("logout")
      this.$message.success("退出成功")
    }
  }
}
</script>

<style>


.item{
  display: inline-block;
  width: 100px;

  text-align: center;
  cursor: pointer
}
.item a {
  color: 	#FFFF00;
}
.item:hover{
  background-color: 	#66CCFF;
}
</style>
