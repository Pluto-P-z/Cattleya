<template>
    <el-card style="width: 500px;">
        <el-form label-width="120px" size="small" :model="form" :rules="rules" ref="pass">
            <el-form-item label="电影id" prop="mid">
                <el-input type="number"  placeholder="请输入电影id" v-model="form.mid" autocomplete="off" ></el-input>
            </el-form-item>
            <el-form-item label="电影评分" prop="score">
                <el-input type="number" placeholder="请输入电影评分(0-5,保留一位小数)" v-model="form.score" autocomplete="off"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="save">确 定</el-button>
            </el-form-item>
        </el-form>
    </el-card>
</template>

<script>
    export default {
        name: "Password",
        data() {
            return {
                rules:{},
                form: {},
                user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
            }
        },
        created() {
            this.form.uid = this.user.id
        },
        methods: {
            save() {
                        // if (this.form.newPassword !== this.form.confirmPassword) {
                        //     this.$message.error("2次输入的新密码不相同")
                        //     return false
                        // }

                // alert(this.form.mid!=null && this.form.score!=null)
                    if (this.form.mid!=null && this.form.score!=null && this.form.score<=5 && this.form.score>=0) {
                        this.request.post("/score", this.form).then(res => {
                            if (res.code === '200') {
                                this.$message.success("提交评分成功")

                                // this.$store.commit("logout")
                                // this.$router.push("/front/home")
                            } else {
                                this.$message.error(res.msg)
                            }
                        })
                    }else{
                        this.$message.error("提交评分失败，请检查输入是否合法")
                    }
            },
        }
    }
</script>

<style>
    .avatar-uploader {
        text-align: center;
        padding-bottom: 10px;
    }
    .avatar-uploader .el-upload {
        border: 1px dashed #d9d9d9;
        border-radius: 6px;
        cursor: pointer;
        position: relative;
        overflow: hidden;
    }
    .avatar-uploader .el-upload:hover {
        border-color: #409EFF;
    }
    .avatar-uploader-icon {
        font-size: 28px;
        color: #8c939d;
        width: 138px;
        height: 138px;
        line-height: 138px;
        text-align: center;
    }
    .avatar {
        width: 138px;
        height: 138px;
        display: block;
    }
</style>
