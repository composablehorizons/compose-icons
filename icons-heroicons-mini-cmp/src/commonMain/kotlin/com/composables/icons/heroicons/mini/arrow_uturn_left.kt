package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUturnLeft: ImageVector
    get() {
        if (_ArrowUturnLeft != null) return _ArrowUturnLeft!!
        
        _ArrowUturnLeft = ImageVector.Builder(
            name = "arrow-uturn-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.793f, 2.232f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.025f, 1.06f)
                lineTo(3.622f, 7.25f)
                horizontalLineToRelative(10.003f)
                arcToRelative(5.375f, 5.375f, 0f, false, true, 0f, 10.75f)
                horizontalLineTo(10.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(2.875f)
                arcToRelative(3.875f, 3.875f, 0f, false, false, 0f, -7.75f)
                horizontalLineTo(3.622f)
                lineToRelative(4.146f, 3.957f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.036f, 1.085f)
                lineToRelative(-5.5f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.085f)
                lineToRelative(5.5f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0.025f)
                close()
            }
        }.build()
        
        return _ArrowUturnLeft!!
    }

private var _ArrowUturnLeft: ImageVector? = null

