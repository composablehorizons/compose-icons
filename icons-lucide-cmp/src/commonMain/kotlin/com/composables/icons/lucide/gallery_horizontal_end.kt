package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GalleryHorizontalEnd: ImageVector
    get() {
        if (_GalleryHorizontalEnd != null) return _GalleryHorizontalEnd!!
        
        _GalleryHorizontalEnd = ImageVector.Builder(
            name = "gallery-horizontal-end",
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
                moveTo(2f, 7f)
                verticalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 5f)
                verticalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 20f, 21f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, false, true, 10f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 12f, 3f)
                close()
            }
        }.build()
        
        return _GalleryHorizontalEnd!!
    }

private var _GalleryHorizontalEnd: ImageVector? = null

