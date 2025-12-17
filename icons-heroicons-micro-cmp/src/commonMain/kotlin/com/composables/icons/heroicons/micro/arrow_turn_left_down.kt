package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowTurnLeftDown: ImageVector
    get() {
        if (_ArrowTurnLeftDown != null) return _ArrowTurnLeftDown!!
        
        _ArrowTurnLeftDown = ImageVector.Builder(
            name = "arrow-turn-left-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.47f, 2.22f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 2f)
                horizontalLineToRelative(7.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(7.94f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.97f, 0.97f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.22f, -0.53f)
                close()
            }
        }.build()
        
        return _ArrowTurnLeftDown!!
    }

private var _ArrowTurnLeftDown: ImageVector? = null

