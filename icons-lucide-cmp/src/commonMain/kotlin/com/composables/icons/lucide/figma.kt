package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Figma: ImageVector
    get() {
        if (_Figma != null) return _Figma!!
        
        _Figma = ImageVector.Builder(
            name = "figma",
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
                moveTo(5f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8.5f, 2f)
                horizontalLineTo(12f)
                verticalLineToRelative(7f)
                horizontalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                horizontalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 0f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8.5f, 16f)
                horizontalLineTo(12f)
                verticalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8.5f, 9f)
                horizontalLineTo(12f)
                verticalLineToRelative(7f)
                horizontalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5f, 12.5f)
                close()
            }
        }.build()
        
        return _Figma!!
    }

private var _Figma: ImageVector? = null

