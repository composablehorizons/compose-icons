package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Om: ImageVector
    get() {
        if (_Om != null) return _Om!!
        
        _Om = ImageVector.Builder(
            name = "om",
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
                moveTo(7f, 12f)
                curveToRelative(2.21f, 0f, 4f, -1.567f, 4f, -3.5f)
                reflectiveCurveToRelative(-1.79f, -3.5f, -4f, -3.5f)
                curveToRelative(-1.594f, 0f, -2.97f, 0.816f, -3.613f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.423f, 14.483f)
                arcToRelative(4.944f, 4.944f, 0f, false, false, -0.423f, 2.017f)
                curveToRelative(0f, 2.485f, 1.79f, 4.5f, 4f, 4.5f)
                reflectiveCurveToRelative(4f, -2.015f, 4f, -4.5f)
                reflectiveCurveToRelative(-1.79f, -4.5f, -4f, -4.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.071f, 17.01f)
                curveToRelative(0.327f, 2.277f, 1.739f, 3.99f, 3.429f, 3.99f)
                curveToRelative(1.933f, 0f, 3.5f, -2.239f, 3.5f, -5f)
                reflectiveCurveToRelative(-1.567f, -5f, -3.5f, -5f)
                curveToRelative(-0.96f, 0f, -1.868f, 0.606f, -2.5f, 1.5f)
                curveToRelative(-0.717f, 1.049f, -1.76f, 1.7f, -2.936f, 1.7f)
                curveToRelative(-0.92f, 0f, -1.766f, -0.406f, -2.434f, -1.087f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 3f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(1.667f, 3.667f, 4.667f, 5.333f, 9f, 5f)
            }
        }.build()
        
        return _Om!!
    }

private var _Om: ImageVector? = null

