package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowsRightLeft: ImageVector
    get() {
        if (_ArrowsRightLeft != null) return _ArrowsRightLeft!!
        
        _ArrowsRightLeft = ImageVector.Builder(
            name = "arrows-right-left",
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
                moveTo(7.5f, 21f)
                lineTo(3f, 16.5f)
                moveToRelative(0f, 0f)
                lineTo(7.5f, 12f)
                moveTo(3f, 16.5f)
                horizontalLineToRelative(13.5f)
                moveToRelative(0f, -13.5f)
                lineTo(21f, 7.5f)
                moveToRelative(0f, 0f)
                lineTo(16.5f, 12f)
                moveTo(21f, 7.5f)
                horizontalLineTo(7.5f)
            }
        }.build()
        
        return _ArrowsRightLeft!!
    }

private var _ArrowsRightLeft: ImageVector? = null

