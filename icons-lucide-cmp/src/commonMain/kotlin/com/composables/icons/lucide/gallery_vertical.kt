package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GalleryVertical: ImageVector
    get() {
        if (_GalleryVertical != null) return _GalleryVertical!!
        
        _GalleryVertical = ImageVector.Builder(
            name = "gallery-vertical",
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
                moveTo(3f, 2f)
                horizontalLineToRelative(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 6f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 19f, 18f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 5f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                horizontalLineToRelative(18f)
            }
        }.build()
        
        return _GalleryVertical!!
    }

private var _GalleryVertical: ImageVector? = null

