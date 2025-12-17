package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTurnLeftDown: ImageVector
    get() {
        if (_ArrowTurnLeftDown != null) return _ArrowTurnLeftDown!!
        
        _ArrowTurnLeftDown = ImageVector.Builder(
            name = "arrow-turn-left-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(11.99f, 16.5f)
                lineToRelative(-3.75f, 3.75f)
                moveToRelative(0f, 0f)
                lineTo(4.49f, 16.5f)
                moveToRelative(3.75f, 3.75f)
                verticalLineTo(3.75f)
                horizontalLineToRelative(11.25f)
            }
        }.build()
        
        return _ArrowTurnLeftDown!!
    }

private var _ArrowTurnLeftDown: ImageVector? = null

