package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnLeftUp: ImageVector
    get() {
        if (_ArrowTurnLeftUp != null) return _ArrowTurnLeftUp!!
        
        _ArrowTurnLeftUp = ImageVector.Builder(
            name = "arrow-turn-left-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                verticalLineTo(4.56f)
                lineToRelative(1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(7.53f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineTo(3.22f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.97f, -1.97f)
                verticalLineToRelative(11.69f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnLeftUp!!
    }

private var _ArrowTurnLeftUp: ImageVector? = null

