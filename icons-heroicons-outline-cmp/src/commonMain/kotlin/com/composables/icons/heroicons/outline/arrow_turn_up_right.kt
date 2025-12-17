package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTurnUpRight: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(16.49f, 12f)
                lineToRelative(3.75f, -3.751f)
                moveToRelative(0f, 0f)
                lineToRelative(-3.75f, -3.75f)
                moveToRelative(3.75f, 3.75f)
                horizontalLineTo(3.74f)
                verticalLineTo(19.5f)
            }
        }.build()
        
        return _ArrowTurnUpRight!!
    }

private var _ArrowTurnUpRight: ImageVector? = null

