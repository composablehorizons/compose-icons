package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignStartVertical: ImageVector
    get() {
        if (_AlignStartVertical != null) return _AlignStartVertical!!
        
        _AlignStartVertical = ImageVector.Builder(
            name = "align-start-vertical",
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
                moveTo(8f, 14f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, false, true, 15f, 16f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 13f, 20f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 8f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 20f, 10f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 8f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 8f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _AlignStartVertical!!
    }

private var _AlignStartVertical: ImageVector? = null

