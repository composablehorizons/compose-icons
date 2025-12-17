package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowsUpDown: ImageVector
    get() {
        if (_ArrowsUpDown != null) return _ArrowsUpDown!!
        
        _ArrowsUpDown = ImageVector.Builder(
            name = "arrows-up-down",
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
                moveTo(3f, 7.5f)
                lineTo(7.5f, 3f)
                moveToRelative(0f, 0f)
                lineTo(12f, 7.5f)
                moveTo(7.5f, 3f)
                verticalLineToRelative(13.5f)
                moveToRelative(13.5f, 0f)
                lineTo(16.5f, 21f)
                moveToRelative(0f, 0f)
                lineTo(12f, 16.5f)
                moveToRelative(4.5f, 4.5f)
                verticalLineTo(7.5f)
            }
        }.build()
        
        return _ArrowsUpDown!!
    }

private var _ArrowsUpDown: ImageVector? = null

