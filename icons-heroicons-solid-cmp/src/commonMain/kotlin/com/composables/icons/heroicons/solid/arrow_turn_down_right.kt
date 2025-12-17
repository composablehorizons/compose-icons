package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTurnDownRight: ImageVector
    get() {
        if (_ArrowTurnDownRight != null) return _ArrowTurnDownRight!!
        
        _ArrowTurnDownRight = ImageVector.Builder(
            name = "arrow-turn-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.74f, 3.749f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(15f)
                horizontalLineToRelative(13.938f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, -1.06f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(2.47f, -2.47f)
                horizontalLineTo(3.738f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.751f)
                close()
            }
        }.build()
        
        return _ArrowTurnDownRight!!
    }

private var _ArrowTurnDownRight: ImageVector? = null

