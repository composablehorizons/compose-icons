package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnDownLeft: ImageVector
    get() {
        if (_ArrowTurnDownLeft != null) return _ArrowTurnDownLeft!!
        
        _ArrowTurnDownLeft = ImageVector.Builder(
            name = "arrow-turn-down-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                horizontalLineTo(4.56f)
                lineToRelative(1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.97f, -1.97f)
                horizontalLineToRelative(11.69f)
                arcTo(0.75f, 0.75f, 0f, false, false, 17f, 12f)
                verticalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnDownLeft!!
    }

private var _ArrowTurnDownLeft: ImageVector? = null

