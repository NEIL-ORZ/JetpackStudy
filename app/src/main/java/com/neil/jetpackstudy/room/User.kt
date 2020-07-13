package com.neil.jetpackstudy.room

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * @USER NEIL.Z
 * @TIME 2020/7/13 0013 11:20
 * @DESC 用户表
 */
@Entity(tableName = "user")
data class User(
    @ColumnInfo(name = "user_account") val account: String // 账号
    , @ColumnInfo(name = "user_pwd") val pwd: String // 密码
) {

}