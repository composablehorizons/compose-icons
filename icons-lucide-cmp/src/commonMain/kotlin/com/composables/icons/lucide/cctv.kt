package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cctv: ImageVector
    get() {
        if (_Cctv != null) return _Cctv!!
        
        _Cctv = ImageVector.Builder(
            name = "cctv",
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
                moveTo(16.75f, 12f)
                horizontalLineToRelative(3.632f)
                arcToRelative(1f, 1f, 0f, false, true, 0.894f, 1.447f)
                lineToRelative(-2.034f, 4.069f)
                arcToRelative(1f, 1f, 0f, false, true, -1.708f, 0.134f)
                lineToRelative(-2.124f, -2.97f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.106f, 9.053f)
                arcToRelative(1f, 1f, 0f, false, true, 0.447f, 1.341f)
                lineToRelative(-3.106f, 6.211f)
                arcToRelative(1f, 1f, 0f, false, true, -1.342f, 0.447f)
                lineTo(3.61f, 12.3f)
                arcToRelative(2.92f, 2.92f, 0f, false, true, -1.3f, -3.91f)
                lineTo(3.69f, 5.6f)
                arcToRelative(2.92f, 2.92f, 0f, false, true, 3.92f, -1.3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19f)
                horizontalLineToRelative(3.76f)
                arcToRelative(2f, 2f, 0f, false, false, 1.8f, -1.1f)
                lineTo(9f, 15f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                verticalLineToRelative(-4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Cctv!!
    }

private var _Cctv: ImageVector? = null

