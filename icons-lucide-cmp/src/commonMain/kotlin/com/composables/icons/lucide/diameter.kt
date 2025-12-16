package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Diameter: ImageVector
    get() {
        if (_Diameter != null) return _Diameter!!
        
        _Diameter = ImageVector.Builder(
            name = "diameter",
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
                moveTo(21f, 19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                arcTo(2f, 2f, 0f, false, true, 17f, 19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 5f)
                arcTo(2f, 2f, 0f, false, true, 5f, 7f)
                arcTo(2f, 2f, 0f, false, true, 3f, 5f)
                arcTo(2f, 2f, 0f, false, true, 7f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.48f, 3.66f)
                arcToRelative(10f, 10f, 0f, false, true, 13.86f, 13.86f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.41f, 6.41f)
                lineToRelative(11.18f, 11.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.66f, 6.48f)
                arcToRelative(10f, 10f, 0f, false, false, 13.86f, 13.86f)
            }
        }.build()
        
        return _Diameter!!
    }

private var _Diameter: ImageVector? = null

