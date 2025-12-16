package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Divide: ImageVector
    get() {
        if (_Divide != null) return _Divide!!
        
        _Divide = ImageVector.Builder(
            name = "divide",
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
                moveTo(14f, 6f)
                arcTo(2f, 2f, 0f, false, true, 12f, 8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 6f)
                arcTo(2f, 2f, 0f, false, true, 14f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                lineTo(19f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                arcTo(2f, 2f, 0f, false, true, 12f, 20f)
                arcTo(2f, 2f, 0f, false, true, 10f, 18f)
                arcTo(2f, 2f, 0f, false, true, 14f, 18f)
                close()
            }
        }.build()
        
        return _Divide!!
    }

private var _Divide: ImageVector? = null

