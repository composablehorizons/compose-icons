package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageSquareDot: ImageVector
    get() {
        if (_MessageSquareDot != null) return _MessageSquareDot!!
        
        _MessageSquareDot = ImageVector.Builder(
            name = "message-square-dot",
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
                moveTo(12.7f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(16.286f)
                arcToRelative(0.71f, 0.71f, 0f, false, false, 1.212f, 0.502f)
                lineToRelative(2.202f, -2.202f)
                arcTo(2f, 2f, 0f, false, true, 6.828f, 19f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                arcTo(3f, 3f, 0f, false, true, 19f, 9f)
                arcTo(3f, 3f, 0f, false, true, 16f, 6f)
                arcTo(3f, 3f, 0f, false, true, 22f, 6f)
                close()
            }
        }.build()
        
        return _MessageSquareDot!!
    }

private var _MessageSquareDot: ImageVector? = null

