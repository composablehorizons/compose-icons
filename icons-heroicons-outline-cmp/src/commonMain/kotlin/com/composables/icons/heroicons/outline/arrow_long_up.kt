package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowLongUp: ImageVector
    get() {
        if (_ArrowLongUp != null) return _ArrowLongUp!!
        
        _ArrowLongUp = ImageVector.Builder(
            name = "arrow-long-up",
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
                moveTo(8.25f, 6.75f)
                lineTo(12f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(3.75f, 3.75f)
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
        }.build()
        
        return _ArrowLongUp!!
    }

private var _ArrowLongUp: ImageVector? = null

