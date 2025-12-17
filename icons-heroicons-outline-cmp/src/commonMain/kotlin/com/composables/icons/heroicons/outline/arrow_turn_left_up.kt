package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTurnLeftUp: ImageVector
    get() {
        if (_ArrowTurnLeftUp != null) return _ArrowTurnLeftUp!!
        
        _ArrowTurnLeftUp = ImageVector.Builder(
            name = "arrow-turn-left-up",
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
                moveTo(11.99f, 7.5f)
                lineTo(8.24f, 3.75f)
                moveToRelative(0f, 0f)
                lineTo(4.49f, 7.5f)
                moveToRelative(3.75f, -3.75f)
                verticalLineToRelative(16.499f)
                horizontalLineToRelative(11.25f)
            }
        }.build()
        
        return _ArrowTurnLeftUp!!
    }

private var _ArrowTurnLeftUp: ImageVector? = null

