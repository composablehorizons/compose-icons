package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowTurnUpRight: ImageVector
    get() {
        if (_ArrowTurnUpRight != null) return _ArrowTurnUpRight!!
        
        _ArrowTurnUpRight = ImageVector.Builder(
            name = "arrow-turn-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.74f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(8.999f)
                horizontalLineToRelative(13.938f)
                lineToRelative(-2.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.061f, 1.06f)
                lineToRelative(3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.47f, 2.47f)
                horizontalLineTo(3.738f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(19.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnUpRight!!
    }

private var _ArrowTurnUpRight: ImageVector? = null

