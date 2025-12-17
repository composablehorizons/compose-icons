package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowLongLeft: ImageVector
    get() {
        if (_ArrowLongLeft != null) return _ArrowLongLeft!!
        
        _ArrowLongLeft = ImageVector.Builder(
            name = "arrow-long-left",
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
                moveTo(6.75f, 15.75f)
                lineTo(3f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, -3.75f)
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
            }
        }.build()
        
        return _ArrowLongLeft!!
    }

private var _ArrowLongLeft: ImageVector? = null

