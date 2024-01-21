package com.example.myapplication.data.models

import androidx.compose.ui.graphics.Color
import com.example.myapplication.ui.theme.HighPriorityColor
import com.example.myapplication.ui.theme.LowPriorityColor
import com.example.myapplication.ui.theme.MediumPriorityColor
import com.example.myapplication.ui.theme.NonePriorityColor

/**
 * Created by Jessica Setyani on 16-01-2024.
 */
enum class Priority(color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}