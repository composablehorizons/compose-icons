package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CookieOff: ImageVector
    get() {
        if (_CookieOff != null) return _CookieOff!!
        
        _CookieOff = ImageVector.Builder(
            name = "cookie-off",
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
                moveTo(8f, 13f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.192f, 18.187f)
                arcToRelative(3f, 3f, 0f, false, true, -0.976f, 0.652f)
                curveToRelative(-1.048f, 0.263f, -1.787f, 0.483f, -2.216f, 0.661f)
                curveToRelative(-0.475f, 0.197f, -1.092f, 0.538f, -1.852f, 1.024f)
                arcToRelative(3f, 3f, 0f, false, true, -2.296f, 0f)
                curveToRelative(-0.802f, -0.503f, -1.419f, -0.844f, -1.852f, -1.024f)
                curveToRelative(-0.471f, -0.195f, -1.21f, -0.415f, -2.216f, -0.66f)
                arcToRelative(3f, 3f, 0f, false, true, -1.623f, -1.624f)
                curveToRelative(-0.265f, -1.052f, -0.485f, -1.79f, -0.661f, -2.216f)
                curveToRelative(-0.198f, -0.479f, -0.54f, -1.096f, -1.024f, -1.852f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -2.296f)
                curveToRelative(0.48f, -0.744f, 0.82f, -1.361f, 1.024f, -1.852f)
                curveToRelative(0.171f, -0.413f, 0.391f, -1.152f, 0.66f, -2.216f)
                arcToRelative(3f, 3f, 0f, false, true, 0.649f, -0.971f)
                moveToRelative(2.821f, -1.174f)
                curveToRelative(0.14f, -0.049f, 0.263f, -0.095f, 0.37f, -0.139f)
                curveToRelative(0.458f, -0.19f, 1.075f, -0.531f, 1.852f, -1.024f)
                arcToRelative(3f, 3f, 0f, false, true, 2.296f, 0f)
                lineToRelative(2.667f, 1.104f)
                arcToRelative(4f, 4f, 0f, false, false, 4.656f, 6.14f)
                lineToRelative(0.053f, 0.132f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 2.296f)
                curveToRelative(-0.497f, 0.786f, -0.838f, 1.404f, -1.024f, 1.852f)
                arcToRelative(6.579f, 6.579f, 0f, false, false, -0.135f, 0.36f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _CookieOff!!
    }

private var _CookieOff: ImageVector? = null

