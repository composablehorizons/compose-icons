package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowTurnUpRight: ImageVector
    get() {
        if (_ArrowTurnUpRight != null) return _ArrowTurnUpRight!!
        
        _ArrowTurnUpRight = ImageVector.Builder(
            name = "arrow-turn-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.75f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(7.94f)
                lineToRelative(-0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineToRelative(0.97f, 0.97f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2f, 6f)
                verticalLineToRelative(7.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnUpRight!!
    }

private var _ArrowTurnUpRight: ImageVector? = null

