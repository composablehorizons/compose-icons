package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ThumbsDown: ImageVector
    get() {
        if (_ThumbsDown != null) return _ThumbsDown!!
        
        _ThumbsDown = ImageVector.Builder(
            name = "thumbs-down",
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
                moveTo(9f, 18.12f)
                lineTo(10f, 14f)
                horizontalLineTo(4.17f)
                arcToRelative(2f, 2f, 0f, false, true, -1.92f, -2.56f)
                lineToRelative(2.33f, -8f)
                arcTo(2f, 2f, 0f, false, true, 6.5f, 2f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2.76f)
                arcToRelative(2f, 2f, 0f, false, false, -1.79f, 1.11f)
                lineTo(12f, 22f)
                arcToRelative(3.13f, 3.13f, 0f, false, true, -3f, -3.88f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _ThumbsDown!!
    }

private var _ThumbsDown: ImageVector? = null

