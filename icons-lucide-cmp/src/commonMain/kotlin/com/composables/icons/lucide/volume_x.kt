package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.VolumeX: ImageVector
    get() {
        if (_VolumeX != null) return _VolumeX!!
        
        _VolumeX = ImageVector.Builder(
            name = "volume-x",
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
                moveTo(11f, 4.702f)
                arcToRelative(0.705f, 0.705f, 0f, false, false, -1.203f, -0.498f)
                lineTo(6.413f, 7.587f)
                arcTo(1.4f, 1.4f, 0f, false, true, 5.416f, 8f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2.416f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, 0.997f, 0.413f)
                lineToRelative(3.383f, 3.384f)
                arcTo(0.705f, 0.705f, 0f, false, false, 11f, 19.298f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                lineTo(16f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9f)
                lineTo(22f, 15f)
            }
        }.build()
        
        return _VolumeX!!
    }

private var _VolumeX: ImageVector? = null

