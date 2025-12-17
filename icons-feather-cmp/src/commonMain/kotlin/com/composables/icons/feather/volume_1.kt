package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Volume1: ImageVector
    get() {
        if (_Volume1 != null) return _Volume1!!
        
        _Volume1 = ImageVector.Builder(
            name = "volume-1",
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
                moveTo(11f, 5f)
                lineTo(6f, 9f)
                lineTo(2f, 9f)
                lineTo(2f, 15f)
                lineTo(6f, 15f)
                lineTo(11f, 19f)
                lineTo(11f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.54f, 8.46f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 7.07f)
            }
        }.build()
        
        return _Volume1!!
    }

private var _Volume1: ImageVector? = null

