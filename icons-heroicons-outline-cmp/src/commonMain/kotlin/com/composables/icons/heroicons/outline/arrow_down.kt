package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) return _ArrowDown!!
        
        _ArrowDown = ImageVector.Builder(
            name = "arrow-down",
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
                moveTo(19.5f, 13.5f)
                lineTo(12f, 21f)
                moveToRelative(0f, 0f)
                lineToRelative(-7.5f, -7.5f)
                moveTo(12f, 21f)
                verticalLineTo(3f)
            }
        }.build()
        
        return _ArrowDown!!
    }

private var _ArrowDown: ImageVector? = null

