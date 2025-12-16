package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Percent: ImageVector
    get() {
        if (_Percent != null) return _Percent!!
        
        _Percent = ImageVector.Builder(
            name = "percent",
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
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9f, 6.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 17.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 20f, 17.5f)
                close()
            }
        }.build()
        
        return _Percent!!
    }

private var _Percent: ImageVector? = null

