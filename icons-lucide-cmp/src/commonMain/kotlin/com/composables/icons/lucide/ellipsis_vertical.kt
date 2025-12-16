package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EllipsisVertical: ImageVector
    get() {
        if (_EllipsisVertical != null) return _EllipsisVertical!!
        
        _EllipsisVertical = ImageVector.Builder(
            name = "ellipsis-vertical",
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
                moveTo(13f, 12f)
                arcTo(1f, 1f, 0f, false, true, 12f, 13f)
                arcTo(1f, 1f, 0f, false, true, 11f, 12f)
                arcTo(1f, 1f, 0f, false, true, 13f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 5f)
                arcTo(1f, 1f, 0f, false, true, 12f, 6f)
                arcTo(1f, 1f, 0f, false, true, 11f, 5f)
                arcTo(1f, 1f, 0f, false, true, 13f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 19f)
                arcTo(1f, 1f, 0f, false, true, 12f, 20f)
                arcTo(1f, 1f, 0f, false, true, 11f, 19f)
                arcTo(1f, 1f, 0f, false, true, 13f, 19f)
                close()
            }
        }.build()
        
        return _EllipsisVertical!!
    }

private var _EllipsisVertical: ImageVector? = null

