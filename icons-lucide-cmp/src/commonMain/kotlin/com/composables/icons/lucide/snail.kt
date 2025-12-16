package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Snail: ImageVector
    get() {
        if (_Snail != null) return _Snail!!
        
        _Snail = ImageVector.Builder(
            name = "snail",
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
                moveTo(2f, 13f)
                arcToRelative(6f, 6f, 0f, true, false, 12f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, -8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                arcTo(8f, 8f, 0f, false, true, 10f, 21f)
                arcTo(8f, 8f, 0f, false, true, 2f, 13f)
                arcTo(8f, 8f, 0f, false, true, 18f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                horizontalLineToRelative(12f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 3f)
                lineTo(19.1f, 5.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 3f)
                lineTo(20.9f, 5.2f)
            }
        }.build()
        
        return _Snail!!
    }

private var _Snail: ImageVector? = null

