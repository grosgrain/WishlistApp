package com.ggy.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch", description = "An android Watch"),
        Wish(title = "Bean bag", description = "xxx"),
        Wish(title = "Socks", description = "zzz"),
        Wish(title = "Apple Iphone", description = "ddd"),
    )
}