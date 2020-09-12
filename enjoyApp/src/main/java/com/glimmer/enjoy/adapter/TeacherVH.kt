package com.glimmer.enjoy.adapter

import android.view.ViewGroup
import com.glimmer.dsl.adapter.vh.BaseVH
import com.glimmer.dsl.adapter.vh.vhBinding
import com.glimmer.enjoy.R
import com.glimmer.enjoy.bean.Teacher
import com.glimmer.enjoy.databinding.ItemTeacherBinding

class TeacherVH(viewGroup: ViewGroup) : BaseVH<Teacher, ItemTeacherBinding>(vhBinding(viewGroup, R.layout.item_teacher)) {
    override fun bindData(bean: Teacher, position: Int) {

    }
}