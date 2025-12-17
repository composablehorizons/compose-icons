package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.RefreshCw: ImageVector
    get() {
        if (_RefreshCw != null) return _RefreshCw!!
        
        _RefreshCw = ImageVector.Builder(
            name = "refresh-cw",
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
                moveTo(23f, 4f)
                lineTo(23f, 10f)
                lineTo(17f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 20f)
                lineTo(1f, 14f)
                lineTo(7f, 14f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.51f, 9f)
                arcToRelative(9f, 9f, 0f, false, true, 14.85f, -3.36f)
                lineTo(23f, 10f)
                moveTo(1f, 14f)
                lineToRelative(4.64f, 4.36f)
                arcTo(9f, 9f, 0f, false, false, 20.49f, 15f)
            }
        }.build()
        
        return _RefreshCw!!
    }

private var _RefreshCw: ImageVector? = null

