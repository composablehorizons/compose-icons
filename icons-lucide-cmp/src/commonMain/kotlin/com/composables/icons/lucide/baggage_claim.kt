package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BaggageClaim: ImageVector
    get() {
        if (_BaggageClaim != null) return _BaggageClaim!!
        
        _BaggageClaim = ImageVector.Builder(
            name = "baggage-claim",
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
                moveTo(22f, 18f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 7f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, false, true, 20f, 14f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 13f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 20f)
                arcTo(2f, 2f, 0f, false, true, 18f, 22f)
                arcTo(2f, 2f, 0f, false, true, 16f, 20f)
                arcTo(2f, 2f, 0f, false, true, 20f, 20f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 20f)
                arcTo(2f, 2f, 0f, false, true, 9f, 22f)
                arcTo(2f, 2f, 0f, false, true, 7f, 20f)
                arcTo(2f, 2f, 0f, false, true, 11f, 20f)
                close()
            }
        }.build()
        
        return _BaggageClaim!!
    }

private var _BaggageClaim: ImageVector? = null

