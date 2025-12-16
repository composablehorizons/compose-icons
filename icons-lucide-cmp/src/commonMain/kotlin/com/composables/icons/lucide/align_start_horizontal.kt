package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignStartHorizontal: ImageVector
    get() {
        if (_AlignStartHorizontal != null) return _AlignStartHorizontal!!
        
        _AlignStartHorizontal = ImageVector.Builder(
            name = "align-start-horizontal",
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
                moveTo(6f, 6f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 8f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 20f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 8f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, false, true, 18f, 15f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 13f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 16f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _AlignStartHorizontal!!
    }

private var _AlignStartHorizontal: ImageVector? = null

