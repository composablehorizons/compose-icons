package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTurnUpLeft: ImageVector
    get() {
        if (_ArrowTurnUpLeft != null) return _ArrowTurnUpLeft!!
        
        _ArrowTurnUpLeft = ImageVector.Builder(
            name = "arrow-turn-up-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(7.49f, 12f)
                lineTo(3.74f, 8.248f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, -3.75f)
                moveToRelative(-3.75f, 3.75f)
                horizontalLineToRelative(16.5f)
                verticalLineTo(19.5f)
            }
        }.build()
        
        return _ArrowTurnUpLeft!!
    }

private var _ArrowTurnUpLeft: ImageVector? = null

