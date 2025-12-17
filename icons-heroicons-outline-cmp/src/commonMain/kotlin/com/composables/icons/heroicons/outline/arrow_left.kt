package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) return _ArrowLeft!!
        
        _ArrowLeft = ImageVector.Builder(
            name = "arrow-left",
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
                moveTo(10.5f, 19.5f)
                lineTo(3f, 12f)
                moveToRelative(0f, 0f)
                lineToRelative(7.5f, -7.5f)
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
            }
        }.build()
        
        return _ArrowLeft!!
    }

private var _ArrowLeft: ImageVector? = null

