package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowUturnLeft: ImageVector
    get() {
        if (_ArrowUturnLeft != null) return _ArrowUturnLeft!!
        
        _ArrowUturnLeft = ImageVector.Builder(
            name = "arrow-uturn-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(4.81f, 8.25f)
                horizontalLineTo(15f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, 0f, 13.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(5.25f, 5.25f, 0f, true, false, 0f, -10.5f)
                horizontalLineTo(4.81f)
                lineToRelative(4.72f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _ArrowUturnLeft!!
    }

private var _ArrowUturnLeft: ImageVector? = null

