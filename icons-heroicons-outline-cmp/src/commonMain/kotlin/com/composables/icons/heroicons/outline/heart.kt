package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
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
                moveTo(21f, 8.25f)
                curveToRelative(0f, -2.485f, -2.099f, -4.5f, -4.688f, -4.5f)
                curveToRelative(-1.935f, 0f, -3.597f, 1.126f, -4.312f, 2.733f)
                curveToRelative(-0.715f, -1.607f, -2.377f, -2.733f, -4.313f, -2.733f)
                curveTo(5.1f, 3.75f, 3f, 5.765f, 3f, 8.25f)
                curveToRelative(0f, 7.22f, 9f, 12f, 9f, 12f)
                reflectiveCurveToRelative(9f, -4.78f, 9f, -12f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null

