package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BadgePlus: ImageVector
    get() {
        if (_BadgePlus != null) return _BadgePlus!!
        
        _BadgePlus = ImageVector.Builder(
            name = "badge-plus",
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
                moveTo(3.85f, 8.62f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 6.74f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 6.74f)
                arcToRelative(4f, 4f, 0f, false, true, -4.77f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, -6.75f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -6.76f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineTo(12f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                lineTo(16f, 12f)
            }
        }.build()
        
        return _BadgePlus!!
    }

private var _BadgePlus: ImageVector? = null

