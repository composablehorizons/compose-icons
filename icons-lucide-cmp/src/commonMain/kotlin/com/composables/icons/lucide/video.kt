package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Video: ImageVector
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
                moveTo(16f, 13f)
                lineToRelative(5.223f, 3.482f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.777f, -0.416f)
                verticalLineTo(7.87f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.752f, -0.432f)
                lineTo(16f, 10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 16f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 4f, 6f)
                close()
            }
        }.build()
        
        return _Video!!
    }

private var _Video: ImageVector? = null

