package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.RefreshCcw: ImageVector
    get() {
        if (_RefreshCcw != null) return _RefreshCcw!!
        
        _RefreshCcw = ImageVector.Builder(
            name = "refresh-ccw",
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
                moveTo(1f, 4f)
                lineTo(1f, 10f)
                lineTo(7f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 20f)
                lineTo(23f, 14f)
                lineTo(17f, 14f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.49f, 9f)
                arcTo(9f, 9f, 0f, false, false, 5.64f, 5.64f)
                lineTo(1f, 10f)
                moveToRelative(22f, 4f)
                lineToRelative(-4.64f, 4.36f)
                arcTo(9f, 9f, 0f, false, true, 3.51f, 15f)
            }
        }.build()
        
        return _RefreshCcw!!
    }

private var _RefreshCcw: ImageVector? = null

