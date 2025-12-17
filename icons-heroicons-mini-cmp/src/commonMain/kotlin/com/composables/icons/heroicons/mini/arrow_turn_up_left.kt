package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTurnUpLeft: ImageVector
    get() {
        if (_ArrowTurnUpLeft != null) return _ArrowTurnUpLeft!!
        
        _ArrowTurnUpLeft = ImageVector.Builder(
            name = "arrow-turn-up-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.25f, 17f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                horizontalLineTo(4.56f)
                lineToRelative(1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(2.22f, 8.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineTo(4.56f, 7.25f)
                horizontalLineToRelative(11.69f)
                arcTo(0.75f, 0.75f, 0f, false, true, 17f, 8f)
                verticalLineToRelative(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnUpLeft!!
    }

private var _ArrowTurnUpLeft: ImageVector? = null

