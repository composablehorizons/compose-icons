package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bubbles: ImageVector
    get() {
        if (_Bubbles != null) return _Bubbles!!
        
        _Bubbles = ImageVector.Builder(
            name = "bubbles",
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
                moveTo(7.001f, 15.085f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 18.5f, 12f)
                arcTo(3.5f, 3.5f, 0f, false, true, 15f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 22f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 16.5f)
                arcTo(5.5f, 5.5f, 0f, false, true, 7.5f, 22f)
                arcTo(5.5f, 5.5f, 0f, false, true, 2f, 16.5f)
                arcTo(5.5f, 5.5f, 0f, false, true, 13f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 7.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 5f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 10f, 4.5f)
                close()
            }
        }.build()
        
        return _Bubbles!!
    }

private var _Bubbles: ImageVector? = null

