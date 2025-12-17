package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCohost: ImageVector
    get() {
        if (_BrandCohost != null) return _BrandCohost!!
        
        _BrandCohost = ImageVector.Builder(
            name = "brand-cohost",
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
                moveTo(17f, 14f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 2f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 2f, 0f, true, false, -6f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.526f, 17.666f)
                curveToRelative(-1.133f, -0.772f, -1.897f, -1.924f, -2.291f, -3.456f)
                curveToRelative(-0.398f, -1.54f, -0.29f, -2.937f, 0.32f, -4.19f)
                curveToRelative(0.61f, -1.255f, 1.59f, -2.34f, 2.938f, -3.254f)
                curveToRelative(1.348f, -0.914f, 2.93f, -1.625f, 4.749f, -2.132f)
                curveToRelative(1.81f, -0.504f, 3.516f, -0.708f, 5.12f, -0.61f)
                curveToRelative(1.608f, 0.1f, 2.979f, 0.537f, 4.112f, 1.31f)
                reflectiveCurveToRelative(1.897f, 1.924f, 2.291f, 3.456f)
                curveToRelative(0.398f, 1.541f, 0.29f, 2.938f, -0.32f, 4.192f)
                curveToRelative(-0.61f, 1.253f, -1.59f, 2.337f, -2.938f, 3.252f)
                curveToRelative(-1.348f, 0.915f, -2.93f, 1.626f, -4.749f, 2.133f)
                curveToRelative(-1.81f, 0.503f, -3.516f, 0.707f, -5.12f, 0.61f)
                curveToRelative(-1.608f, -0.102f, -2.979f, -0.538f, -4.112f, -1.31f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 12.508f)
                curveToRelative(-0.53f, -0.316f, -1.23f, -0.508f, -2f, -0.508f)
                curveToRelative(-1.657f, 0f, -3f, 0.895f, -3f, 2f)
                reflectiveCurveToRelative(1.343f, 2f, 3f, 2f)
                curveToRelative(0.767f, 0f, 1.467f, -0.192f, 2f, -0.508f)
            }
        }.build()
        
        return _BrandCohost!!
    }

private var _BrandCohost: ImageVector? = null

