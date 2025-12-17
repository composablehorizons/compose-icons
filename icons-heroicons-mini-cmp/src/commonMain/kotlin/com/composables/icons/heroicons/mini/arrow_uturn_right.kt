package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUturnRight: ImageVector
    get() {
        if (_ArrowUturnRight != null) return _ArrowUturnRight!!
        
        _ArrowUturnRight = ImageVector.Builder(
            name = "arrow-uturn-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.207f, 2.232f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.025f, 1.06f)
                lineToRelative(4.146f, 3.958f)
                horizontalLineTo(6.375f)
                arcToRelative(5.375f, 5.375f, 0f, false, false, 0f, 10.75f)
                horizontalLineTo(9.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(6.375f)
                arcToRelative(3.875f, 3.875f, 0f, false, true, 0f, -7.75f)
                horizontalLineToRelative(10.003f)
                lineToRelative(-4.146f, 3.957f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.036f, 1.085f)
                lineToRelative(5.5f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.085f)
                lineToRelative(-5.5f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0.025f)
                close()
            }
        }.build()
        
        return _ArrowUturnRight!!
    }

private var _ArrowUturnRight: ImageVector? = null

