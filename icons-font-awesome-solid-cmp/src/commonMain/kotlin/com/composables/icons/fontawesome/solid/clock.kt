package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Clock: ImageVector
    get() {
        if (_Clock != null) return _Clock!!
        
        _Clock = ImageVector.Builder(
            name = "clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveTo(119f, 504f, 256f, 504f)
                reflectiveCurveTo(504f, 393f, 504f, 256f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(92.49f, 313f)
                horizontalLineToRelative(0f)
                lineToRelative(-20f, 25f)
                arcToRelative(16f, 16f, 0f, false, true, -22.49f, 2.5f)
                horizontalLineToRelative(0f)
                lineToRelative(-67f, -49.72f)
                arcToRelative(40f, 40f, 0f, false, true, -15f, -31.23f)
                verticalLineTo(112f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineTo(256f)
                lineToRelative(58f, 42.5f)
                arcTo(16f, 16f, 0f, false, true, 348.49f, 321f)
                close()
            }
        }.build()
        
        return _Clock!!
    }

private var _Clock: ImageVector? = null

