package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Binary: ImageVector
    get() {
        if (_Binary != null) return _Binary!!
        
        _Binary = ImageVector.Builder(
            name = "binary",
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
                moveTo(16f, 14f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 16f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 16f, 20f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 16f, 14f)
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
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 8f, 10f)
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
                moveTo(6f, 20f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _Binary!!
    }

private var _Binary: ImageVector? = null

