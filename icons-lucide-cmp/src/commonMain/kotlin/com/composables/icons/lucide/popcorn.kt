package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Popcorn: ImageVector
    get() {
        if (_Popcorn != null) return _Popcorn!!
        
        _Popcorn = ImageVector.Builder(
            name = "popcorn",
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
                moveTo(18f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 22f)
                lineTo(9f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 22f)
                lineToRelative(1f, -14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 8f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.8f, 1f)
                lineToRelative(-2.6f, 12f)
                curveToRelative(-0.1f, 0.5f, -0.7f, 1f, -1.2f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-0.6f, 0f, -1.1f, -0.4f, -1.2f, -1f)
                lineTo(3.2f, 9f)
                curveToRelative(-0.1f, -0.6f, 0.3f, -1f, 0.8f, -1f)
                close()
            }
        }.build()
        
        return _Popcorn!!
    }

private var _Popcorn: ImageVector? = null

