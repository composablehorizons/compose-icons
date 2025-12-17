package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnRightUp: ImageVector
    get() {
        if (_ArrowTurnRightUp != null) return _ArrowTurnRightUp!!
        
        _ArrowTurnRightUp = ImageVector.Builder(
            name = "arrow-turn-right-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                verticalLineTo(4.56f)
                lineTo(9.28f, 6.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-1.97f, -1.97f)
                verticalLineToRelative(11.69f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 17f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnRightUp!!
    }

private var _ArrowTurnRightUp: ImageVector? = null

