package com.example.todoapplication.data.models

import androidx.compose.ui.graphics.Color
import com.example.todoapplication.ui.theme.HighPriorityColor
import com.example.todoapplication.ui.theme.LowPriorityColor
import com.example.todoapplication.ui.theme.MediumPriorityColor
import com.example.todoapplication.ui.theme.NonePriorityColor

/**
 * Created by Jessica Setyani on 16-01-2024.
 */
enum class Priority(color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}