package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Grape: ImageVector
    get() {
        if (_Grape != null) return _Grape!!
        
        _Grape = ImageVector.Builder(
            name = "grape",
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
                moveTo(22f, 5f)
                verticalLineTo(2f)
                lineToRelative(-5.89f, 5.89f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.6f, 15.89f)
                arcTo(3f, 3f, 0f, false, true, 16.6f, 18.89f)
                arcTo(3f, 3f, 0f, false, true, 13.6f, 15.89f)
                arcTo(3f, 3f, 0f, false, true, 19.6f, 15.89f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.11f, 7.4f)
                arcTo(3f, 3f, 0f, false, true, 8.11f, 10.4f)
                arcTo(3f, 3f, 0f, false, true, 5.11f, 7.4f)
                arcTo(3f, 3f, 0f, false, true, 11.11f, 7.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.35f, 11.65f)
                arcTo(3f, 3f, 0f, false, true, 12.35f, 14.65f)
                arcTo(3f, 3f, 0f, false, true, 9.35f, 11.65f)
                arcTo(3f, 3f, 0f, false, true, 15.35f, 11.65f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.91f, 5.85f)
                arcTo(3f, 3f, 0f, false, true, 13.91f, 8.85f)
                arcTo(3f, 3f, 0f, false, true, 10.91f, 5.85f)
                arcTo(3f, 3f, 0f, false, true, 16.91f, 5.85f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.15f, 10.09f)
                arcTo(3f, 3f, 0f, false, true, 18.15f, 13.09f)
                arcTo(3f, 3f, 0f, false, true, 15.15f, 10.09f)
                arcTo(3f, 3f, 0f, false, true, 21.15f, 10.09f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.56f, 13.2f)
                arcTo(3f, 3f, 0f, false, true, 6.56f, 16.2f)
                arcTo(3f, 3f, 0f, false, true, 3.56f, 13.2f)
                arcTo(3f, 3f, 0f, false, true, 9.56f, 13.2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.8f, 17.44f)
                arcTo(3f, 3f, 0f, false, true, 10.8f, 20.44f)
                arcTo(3f, 3f, 0f, false, true, 7.8f, 17.44f)
                arcTo(3f, 3f, 0f, false, true, 13.8f, 17.44f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 19f)
                arcTo(3f, 3f, 0f, false, true, 5f, 22f)
                arcTo(3f, 3f, 0f, false, true, 2f, 19f)
                arcTo(3f, 3f, 0f, false, true, 8f, 19f)
                close()
            }
        }.build()
        
        return _Grape!!
    }

private var _Grape: ImageVector? = null

