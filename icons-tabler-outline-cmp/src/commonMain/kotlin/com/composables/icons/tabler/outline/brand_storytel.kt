package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandStorytel: ImageVector
    get() {
        if (_BrandStorytel != null) return _BrandStorytel!!
        
        _BrandStorytel = ImageVector.Builder(
            name = "brand-storytel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.103f, 22f)
                curveToRelative(2.292f, -2.933f, 16.825f, -2.43f, 16.825f, -11.538f)
                curveToRelative(0f, -6.298f, -4.974f, -8.462f, -8.451f, -8.462f)
                curveToRelative(-3.477f, 0f, -9.477f, 3.036f, -9.477f, 11.241f)
                curveToRelative(0f, 6.374f, 1.103f, 8.759f, 1.103f, 8.759f)
                close()
            }
        }.build()
        
        return _BrandStorytel!!
    }

private var _BrandStorytel: ImageVector? = null

