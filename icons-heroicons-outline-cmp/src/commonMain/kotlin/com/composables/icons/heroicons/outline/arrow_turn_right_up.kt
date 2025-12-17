package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTurnRightUp: ImageVector
    get() {
        if (_ArrowTurnRightUp != null) return _ArrowTurnRightUp!!
        
        _ArrowTurnRightUp = ImageVector.Builder(
            name = "arrow-turn-right-up",
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
                moveTo(11.99f, 7.5f)
                lineToRelative(3.75f, -3.75f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, 3.75f)
                moveToRelative(-3.75f, -3.75f)
                verticalLineToRelative(16.499f)
                horizontalLineTo(4.49f)
            }
        }.build()
        
        return _ArrowTurnRightUp!!
    }

private var _ArrowTurnRightUp: ImageVector? = null

