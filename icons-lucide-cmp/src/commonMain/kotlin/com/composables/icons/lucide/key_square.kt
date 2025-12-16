package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.KeySquare: ImageVector
    get() {
        if (_KeySquare != null) return _KeySquare!!
        
        _KeySquare = ImageVector.Builder(
            name = "key-square",
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
                moveTo(12.4f, 2.7f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.4f, 0f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 3.4f)
                lineToRelative(-3.7f, 3.7f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.4f, 0f)
                lineTo(8.7f, 9.8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -3.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.4f, 10.6f)
                lineToRelative(-6.814f, 6.814f)
                arcTo(2f, 2f, 0f, false, false, 2f, 18.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(0.172f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -0.586f)
                lineToRelative(0.814f, -0.814f)
            }
        }.build()
        
        return _KeySquare!!
    }

private var _KeySquare: ImageVector? = null

