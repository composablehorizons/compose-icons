package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Video: ImageVector
    get() {
        if (_Video != null) return _Video!!
        
        _Video = ImageVector.Builder(
            name = "video",
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
                moveTo(23f, 7f)
                lineTo(16f, 12f)
                lineTo(23f, 17f)
                lineTo(23f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 5f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 16f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 14f, 19f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, false, true, 1f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 3f, 5f)
                close()
            }
        }.build()
        
        return _Video!!
    }

private var _Video: ImageVector? = null

