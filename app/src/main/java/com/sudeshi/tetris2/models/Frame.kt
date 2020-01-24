package com.sudeshi.tetris2.models

import com.sudeshi.tetris2.helpers.array2dOfByte

class Frame (private val width: Int){
    val data: ArrayList<ByteArray> = ArrayList()
    fun addRow(byteStr: String): Frame {
        val row = ByteArray(byteStr.length)
        for (index in byteStr.indices) {
            row[index] = "${byteStr[index]}".toByte()
        }
        data.add(row)
        return this
    }
    fun as2dByteArray(): Array<ByteArray> {
        val bytes = array2dOfByte(data.size, width)
        return data.toArray(bytes)
    }
}