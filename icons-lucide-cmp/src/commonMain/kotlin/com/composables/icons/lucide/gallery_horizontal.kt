package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GalleryHorizontal: ImageVector
    get() {
        if (_GalleryHorizontal != null) return _GalleryHorizontal!!
        
        _GalleryHorizontal = ImageVector.Builder(
            name = "gallery-horizontal",
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
                moveTo(2f, 3f)
                verticalLineToRelative(18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 3f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 16f, 21f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 8f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 3f)
                verticalLineToRelative(18f)
            }
        }.build()
        
        return _GalleryHorizontal!!
    }

private var _GalleryHorizontal: ImageVector? = null

