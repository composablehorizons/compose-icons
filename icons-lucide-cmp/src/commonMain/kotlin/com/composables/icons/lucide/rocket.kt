package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
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
                moveTo(4.5f, 16.5f)
                curveToRelative(-1.5f, 1.26f, -2f, 5f, -2f, 5f)
                reflectiveCurveToRelative(3.74f, -0.5f, 5f, -2f)
                curveToRelative(0.71f, -0.84f, 0.7f, -2.13f, -0.09f, -2.91f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, -2.91f, -0.09f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                lineToRelative(-3f, -3f)
                arcToRelative(22f, 22f, 0f, false, true, 2f, -3.95f)
                arcTo(12.88f, 12.88f, 0f, false, true, 22f, 2f)
                curveToRelative(0f, 2.72f, -0.78f, 7.5f, -6f, 11f)
                arcToRelative(22.35f, 22.35f, 0f, false, true, -4f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineTo(4f)
                reflectiveCurveToRelative(0.55f, -3.03f, 2f, -4f)
                curveToRelative(1.62f, -1.08f, 5f, 0f, 5f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineToRelative(5f)
                reflectiveCurveToRelative(3.03f, -0.55f, 4f, -2f)
                curveToRelative(1.08f, -1.62f, 0f, -5f, 0f, -5f)
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

