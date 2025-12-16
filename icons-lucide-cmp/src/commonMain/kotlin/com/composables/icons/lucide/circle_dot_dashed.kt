package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleDotDashed: ImageVector
    get() {
        if (_CircleDotDashed != null) return _CircleDotDashed!!
        
        _CircleDotDashed = ImageVector.Builder(
            name = "circle-dot-dashed",
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
                moveTo(10.1f, 2.18f)
                arcToRelative(9.93f, 9.93f, 0f, false, true, 3.8f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.6f, 3.71f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, 2.69f, 2.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.82f, 10.1f)
                arcToRelative(9.93f, 9.93f, 0f, false, true, 0f, 3.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.29f, 17.6f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, -2.7f, 2.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.9f, 21.82f)
                arcToRelative(9.94f, 9.94f, 0f, false, true, -3.8f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.4f, 20.29f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, -2.69f, -2.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.18f, 13.9f)
                arcToRelative(9.93f, 9.93f, 0f, false, true, 0f, -3.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.71f, 6.4f)
                arcToRelative(9.95f, 9.95f, 0f, false, true, 2.7f, -2.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                arcTo(1f, 1f, 0f, false, true, 12f, 13f)
                arcTo(1f, 1f, 0f, false, true, 11f, 12f)
                arcTo(1f, 1f, 0f, false, true, 13f, 12f)
                close()
            }
        }.build()
        
        return _CircleDotDashed!!
    }

private var _CircleDotDashed: ImageVector? = null

