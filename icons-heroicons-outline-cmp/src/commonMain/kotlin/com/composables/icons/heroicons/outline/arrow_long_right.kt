package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowLongRight: ImageVector
    get() {
        if (_ArrowLongRight != null) return _ArrowLongRight!!
        
        _ArrowLongRight = ImageVector.Builder(
            name = "arrow-long-right",
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
                moveTo(17.25f, 8.25f)
                lineTo(21f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(-3.75f, 3.75f)
                moveTo(21f, 12f)
                horizontalLineTo(3f)
            }
        }.build()
        
        return _ArrowLongRight!!
    }

private var _ArrowLongRight: ImageVector? = null

