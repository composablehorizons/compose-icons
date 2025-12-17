package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
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
                moveTo(4f, 8f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 9f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, false, true, 20f, 12f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 11f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 4f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                verticalLineToRelative(13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -5f)
                arcTo(4.8f, 8f, 0f, false, true, 12f, 8f)
                arcToRelative(4.8f, 8f, 0f, false, true, 4.5f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

