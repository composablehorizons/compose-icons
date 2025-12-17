package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTurnDownLeft: ImageVector
    get() {
        if (_ArrowTurnDownLeft != null) return _ArrowTurnDownLeft!!
        
        _ArrowTurnDownLeft = ImageVector.Builder(
            name = "arrow-turn-down-left",
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
                lineToRelative(-3.75f, 3.75f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, 3.75f)
                moveToRelative(-3.75f, -3.75f)
                horizontalLineToRelative(16.5f)
                verticalLineTo(4.499f)
            }
        }.build()
        
        return _ArrowTurnDownLeft!!
    }

private var _ArrowTurnDownLeft: ImageVector? = null

