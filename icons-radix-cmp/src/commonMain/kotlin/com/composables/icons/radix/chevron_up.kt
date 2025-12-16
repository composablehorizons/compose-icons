package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) return _ChevronUp!!
        
        _ChevronUp = ImageVector.Builder(
            name = "chevron-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.1581f, 8.86501f)
                curveTo(11.3595f, 9.05356f, 11.6763f, 9.04292f, 11.8651f, 8.84157f)
                curveTo(12.0536f, 8.6401f, 12.043f, 8.32331f, 11.8416f, 8.13454f)
                lineTo(7.84165f, 4.38454f)
                curveTo(7.64941f, 4.20464f, 7.35029f, 4.20464f, 7.15805f, 4.38454f)
                lineTo(3.15805f, 8.13454f)
                lineTo(3.09165f, 8.21169f)
                curveTo(2.95746f, 8.40141f, 2.96967f, 8.66532f, 3.13461f, 8.84157f)
                curveTo(3.29985f, 9.01783f, 3.56347f, 9.04831f, 3.76157f, 8.92653f)
                lineTo(3.84165f, 8.86501f)
                lineTo(7.49985f, 5.4363f)
                lineTo(11.1581f, 8.86501f)
                close()
            }
        }.build()
        
        return _ChevronUp!!
    }

private var _ChevronUp: ImageVector? = null

