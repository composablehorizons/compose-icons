package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Trees: ImageVector
    get() {
        if (_Trees != null) return _Trees!!
        
        _Trees = ImageVector.Builder(
            name = "trees",
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
                moveTo(10f, 10f)
                verticalLineToRelative(0.2f)
                arcTo(3f, 3f, 0f, false, true, 8.9f, 16f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, true, -1f, -5.8f)
                verticalLineTo(10f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 19f)
                verticalLineToRelative(3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                horizontalLineToRelative(8.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.7f, -1.7f)
                lineTo(18f, 14f)
                horizontalLineToRelative(0.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.7f, -1.7f)
                lineTo(16f, 9f)
                horizontalLineToRelative(0.2f)
                arcToRelative(1f, 1f, 0f, false, false, 0.8f, -1.7f)
                lineTo(13f, 3f)
                lineToRelative(-1.4f, 1.5f)
            }
        }.build()
        
        return _Trees!!
    }

private var _Trees: ImageVector? = null

