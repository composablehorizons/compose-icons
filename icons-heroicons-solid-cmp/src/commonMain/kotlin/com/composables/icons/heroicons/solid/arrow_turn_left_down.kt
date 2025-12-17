package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTurnLeftDown: ImageVector
    get() {
        if (_ArrowTurnLeftDown != null) return _ArrowTurnLeftDown!!
        
        _ArrowTurnLeftDown = ImageVector.Builder(
            name = "arrow-turn-left-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.24f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(8.989f)
                verticalLineToRelative(13.939f)
                lineToRelative(2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.061f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3.751f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.47f, 2.469f)
                verticalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(19.49f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnLeftDown!!
    }

private var _ArrowTurnLeftDown: ImageVector? = null

