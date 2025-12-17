package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTurnDownLeft: ImageVector
    get() {
        if (_ArrowTurnDownLeft != null) return _ArrowTurnDownLeft!!
        
        _ArrowTurnDownLeft = ImageVector.Builder(
            name = "arrow-turn-down-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.239f, 3.749f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(15f)
                horizontalLineTo(5.549f)
                lineToRelative(2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(5.55f, 16.5f)
                horizontalLineToRelative(14.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.751f)
                close()
            }
        }.build()
        
        return _ArrowTurnDownLeft!!
    }

private var _ArrowTurnDownLeft: ImageVector? = null

