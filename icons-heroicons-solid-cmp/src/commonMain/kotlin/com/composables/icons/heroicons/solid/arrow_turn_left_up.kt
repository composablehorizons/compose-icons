package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTurnLeftUp: ImageVector
    get() {
        if (_ArrowTurnLeftUp != null) return _ArrowTurnLeftUp!!
        
        _ArrowTurnLeftUp = ImageVector.Builder(
            name = "arrow-turn-left-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.24f, 20.249f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(8.989f)
                verticalLineTo(5.56f)
                lineToRelative(2.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.061f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.47f, -2.469f)
                verticalLineTo(20.25f)
                curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(11.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnLeftUp!!
    }

private var _ArrowTurnLeftUp: ImageVector? = null

