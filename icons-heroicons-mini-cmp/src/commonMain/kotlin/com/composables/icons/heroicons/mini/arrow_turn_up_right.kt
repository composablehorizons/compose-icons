package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnUpRight: ImageVector
    get() {
        if (_ArrowTurnUpRight != null) return _ArrowTurnUpRight!!
        
        _ArrowTurnUpRight = ImageVector.Builder(
            name = "arrow-turn-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 17f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(10.94f)
                lineToRelative(-1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.97f, 1.97f)
                horizontalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, false, 3f, 8f)
                verticalLineToRelative(8.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnUpRight!!
    }

private var _ArrowTurnUpRight: ImageVector? = null

