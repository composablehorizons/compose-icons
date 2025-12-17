package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTurnRightDown: ImageVector
    get() {
        if (_ArrowTurnRightDown != null) return _ArrowTurnRightDown!!
        
        _ArrowTurnRightDown = ImageVector.Builder(
            name = "arrow-turn-right-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.738f, 3.75f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(14.99f)
                verticalLineToRelative(13.939f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.061f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(3.751f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.47f, 2.469f)
                verticalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(4.487f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnRightDown!!
    }

private var _ArrowTurnRightDown: ImageVector? = null

