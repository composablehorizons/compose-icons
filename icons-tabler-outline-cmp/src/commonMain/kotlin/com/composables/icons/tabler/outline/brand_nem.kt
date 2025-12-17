package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandNem: ImageVector
    get() {
        if (_BrandNem != null) return _BrandNem!!
        
        _BrandNem = ImageVector.Builder(
            name = "brand-nem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.182f, 2f)
                curveToRelative(1.94f, 0.022f, 3.879f, 0.382f, 5.818f, 1.08f)
                lineToRelative(0.364f, 0.135f)
                arcToRelative(23.075f, 23.075f, 0f, false, true, 3.636f, 1.785f)
                curveToRelative(0f, 5.618f, -1.957f, 10.258f, -5.87f, 13.92f)
                curveToRelative(-1.24f, 1.239f, -2.5f, 2.204f, -3.78f, 2.898f)
                lineToRelative(-0.35f, 0.182f)
                curveToRelative(-1.4f, -0.703f, -2.777f, -1.729f, -4.13f, -3.079f)
                curveToRelative(-3.912f, -3.663f, -5.87f, -8.303f, -5.87f, -13.921f)
                curveToRelative(2.545f, -1.527f, 5.09f, -2.471f, 7.636f, -2.832f)
                lineToRelative(0.364f, -0.048f)
                arcToRelative(16.786f, 16.786f, 0f, false, true, 1.818f, -0.12f)
                horizontalLineToRelative(0.364f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.1f, 7.07f)
                curveToRelative(2.073f, 6.72f, 5.373f, 7.697f, 9.9f, 2.93f)
                curveToRelative(0f, -4f, 1.357f, -6.353f, 4.07f, -7.06f)
                lineToRelative(0.59f, -0.11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.35f, 18.51f)
                reflectiveCurveToRelative(2.65f, -5.51f, -4.35f, -8.51f)
            }
        }.build()
        
        return _BrandNem!!
    }

private var _BrandNem: ImageVector? = null

