package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnLeftDown: ImageVector
    get() {
        if (_ArrowTurnLeftDown != null) return _ArrowTurnLeftDown!!
        
        _ArrowTurnLeftDown = ImageVector.Builder(
            name = "arrow-turn-left-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(10.94f)
                lineToRelative(1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(1.97f, 1.97f)
                verticalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7f, 3f)
                horizontalLineToRelative(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnLeftDown!!
    }

private var _ArrowTurnLeftDown: ImageVector? = null

