package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) return _ChevronDown!!
        
        _ChevronDown = ImageVector.Builder(
            name = "chevron-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.1581f, 6.13499f)
                curveTo(11.3595f, 5.94644f, 11.6763f, 5.95708f, 11.8651f, 6.15843f)
                curveTo(12.0536f, 6.3599f, 12.043f, 6.67669f, 11.8416f, 6.86546f)
                lineTo(7.84165f, 10.6155f)
                curveTo(7.64941f, 10.7954f, 7.35029f, 10.7954f, 7.15805f, 10.6155f)
                lineTo(3.15805f, 6.86546f)
                lineTo(3.09165f, 6.78831f)
                curveTo(2.95746f, 6.59859f, 2.96967f, 6.33468f, 3.13461f, 6.15843f)
                curveTo(3.29985f, 5.98217f, 3.56347f, 5.95169f, 3.76157f, 6.07347f)
                lineTo(3.84165f, 6.13499f)
                lineTo(7.49985f, 9.5637f)
                lineTo(11.1581f, 6.13499f)
                close()
            }
        }.build()
        
        return _ChevronDown!!
    }

private var _ChevronDown: ImageVector? = null

