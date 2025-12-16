package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StretchHorizontal: ImageVector
    get() {
        if (_StretchHorizontal != null) return _StretchHorizontal!!
        
        _StretchHorizontal = ImageVector.Builder(
            name = "stretch-horizontal",
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
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 20f, 10f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 8f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 16f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 4f, 14f)
                close()
            }
        }.build()
        
        return _StretchHorizontal!!
    }

private var _StretchHorizontal: ImageVector? = null

