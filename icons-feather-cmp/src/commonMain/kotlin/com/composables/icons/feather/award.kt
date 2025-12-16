package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Award: ImageVector
    get() {
        if (_Award != null) return _Award!!
        
        _Award = ImageVector.Builder(
            name = "award",
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
                moveTo(19f, 8f)
                arcTo(7f, 7f, 0f, false, true, 12f, 15f)
                arcTo(7f, 7f, 0f, false, true, 5f, 8f)
                arcTo(7f, 7f, 0f, false, true, 19f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.21f, 13.89f)
                lineTo(7f, 23f)
                lineTo(12f, 20f)
                lineTo(17f, 23f)
                lineTo(15.79f, 13.88f)
            }
        }.build()
        
        return _Award!!
    }

private var _Award: ImageVector? = null

