package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowTrendingDown: ImageVector
    get() {
        if (_ArrowTrendingDown != null) return _ArrowTrendingDown!!
        
        _ArrowTrendingDown = ImageVector.Builder(
            name = "arrow-trending-down",
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
                moveTo(2.25f, 6f)
                lineTo(9f, 12.75f)
                lineToRelative(4.286f, -4.286f)
                arcToRelative(11.948f, 11.948f, 0f, false, true, 4.306f, 6.43f)
                lineToRelative(0.776f, 2.898f)
                moveToRelative(0f, 0f)
                lineToRelative(3.182f, -5.511f)
                moveToRelative(-3.182f, 5.51f)
                lineToRelative(-5.511f, -3.181f)
            }
        }.build()
        
        return _ArrowTrendingDown!!
    }

private var _ArrowTrendingDown: ImageVector? = null

