package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ship: ImageVector
    get() {
        if (_Ship != null) return _Ship!!
        
        _Ship = ImageVector.Builder(
            name = "ship",
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
                moveTo(12f, 10.189f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 13f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.38f, 20f)
                arcTo(11.6f, 11.6f, 0f, false, false, 21f, 14f)
                lineToRelative(-8.188f, -3.639f)
                arcToRelative(2f, 2f, 0f, false, false, -1.624f, 0f)
                lineTo(3f, 14f)
                arcToRelative(11.6f, 11.6f, 0f, false, false, 2.81f, 7.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                curveToRelative(0.6f, 0.5f, 1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, 0.5f, 2.5f, 1f)
                reflectiveCurveToRelative(1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, 0.5f, 2.5f, 1f)
            }
        }.build()
        
        return _Ship!!
    }

private var _Ship: ImageVector? = null

