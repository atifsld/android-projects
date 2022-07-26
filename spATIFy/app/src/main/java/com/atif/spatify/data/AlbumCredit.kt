package com.atif.spatify.data

data class AlbumCredit (
    val creditName: String,
    val creditContribution: String){

    override fun toString(): String {
        return "Credit name: $creditName" + "\n" +
                "Credit contribution: $creditContribution"
    }

}
