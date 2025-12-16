package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Battery: ImageVector
    get() {
        if (_Battery != null) return _Battery!!
        
        _Battery = ImageVector.Builder(
            name = "battery",
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
                moveTo(3f, 6f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 17f, 18f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, false, true, 1f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 3f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 13f)
                lineTo(23f, 11f)
            }
        }.build()
        
        return _Battery!!
    }

private var _Battery: ImageVector? = null

