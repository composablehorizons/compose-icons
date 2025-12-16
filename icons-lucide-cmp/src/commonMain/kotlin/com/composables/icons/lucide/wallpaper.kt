package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Wallpaper: ImageVector
    get() {
        if (_Wallpaper != null) return _Wallpaper!!
        
        _Wallpaper = ImageVector.Builder(
            name = "wallpaper",
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
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                lineToRelative(6.1f, -6.1f)
                arcToRelative(2f, 2f, 0f, false, true, 2.81f, 0.01f)
                lineTo(22f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 9f)
                arcTo(2f, 2f, 0f, false, true, 8f, 11f)
                arcTo(2f, 2f, 0f, false, true, 6f, 9f)
                arcTo(2f, 2f, 0f, false, true, 10f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 20f, 17f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 4f, 3f)
                close()
            }
        }.build()
        
        return _Wallpaper!!
    }

private var _Wallpaper: ImageVector? = null

