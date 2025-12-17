package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowTurnDownLeft: ImageVector
    get() {
        if (_ArrowTurnDownLeft != null) return _ArrowTurnDownLeft!!
        
        _ArrowTurnDownLeft = ImageVector.Builder(
            name = "arrow-turn-down-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.25f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(4.56f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(2.22f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-0.97f, -0.97f)
                horizontalLineToRelative(8.69f)
                arcTo(0.75f, 0.75f, 0f, false, false, 14f, 10f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArrowTurnDownLeft!!
    }

private var _ArrowTurnDownLeft: ImageVector? = null

