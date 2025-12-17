package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Grip: ImageVector
    get() {
        if (_Grip != null) return _Grip!!
        
        _Grip = ImageVector.Builder(
            name = "grip",
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
                moveTo(13f, 5f)
                arcTo(1f, 1f, 0f, false, true, 12f, 6f)
                arcTo(1f, 1f, 0f, false, true, 11f, 5f)
                arcTo(1f, 1f, 0f, false, true, 13f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 5f)
                arcTo(1f, 1f, 0f, false, true, 19f, 6f)
                arcTo(1f, 1f, 0f, false, true, 18f, 5f)
                arcTo(1f, 1f, 0f, false, true, 20f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 5f)
                arcTo(1f, 1f, 0f, false, true, 5f, 6f)
                arcTo(1f, 1f, 0f, false, true, 4f, 5f)
                arcTo(1f, 1f, 0f, false, true, 6f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
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
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                arcTo(1f, 1f, 0f, false, true, 19f, 13f)
                arcTo(1f, 1f, 0f, false, true, 18f, 12f)
                arcTo(1f, 1f, 0f, false, true, 20f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                arcTo(1f, 1f, 0f, false, true, 5f, 13f)
                arcTo(1f, 1f, 0f, false, true, 4f, 12f)
                arcTo(1f, 1f, 0f, false, true, 6f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 19f)
                arcTo(1f, 1f, 0f, false, true, 12f, 20f)
                arcTo(1f, 1f, 0f, false, true, 11f, 19f)
                arcTo(1f, 1f, 0f, false, true, 13f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 19f)
                arcTo(1f, 1f, 0f, false, true, 19f, 20f)
                arcTo(1f, 1f, 0f, false, true, 18f, 19f)
                arcTo(1f, 1f, 0f, false, true, 20f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 19f)
                arcTo(1f, 1f, 0f, false, true, 5f, 20f)
                arcTo(1f, 1f, 0f, false, true, 4f, 19f)
                arcTo(1f, 1f, 0f, false, true, 6f, 19f)
                close()
            }
        }.build()
        
        return _Grip!!
    }

private var _Grip: ImageVector? = null

