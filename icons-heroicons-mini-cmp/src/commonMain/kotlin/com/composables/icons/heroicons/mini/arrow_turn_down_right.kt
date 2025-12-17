package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnDownRight: ImageVector
    get() {
        if (_ArrowTurnDownRight != null) return _ArrowTurnDownRight!!
        
        _ArrowTurnDownRight = ImageVector.Builder(
            name = "arrow-turn-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(10.94f)
                lineToRelative(-1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.97f, -1.97f)
                horizontalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 12f)
                verticalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3.75f, 3f)
                close()
            }
        }.build()
        
        return _ArrowTurnDownRight!!
    }

private var _ArrowTurnDownRight: ImageVector? = null

