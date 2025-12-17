package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageSquareLock: ImageVector
    get() {
        if (_MessageSquareLock != null) return _MessageSquareLock!!
        
        _MessageSquareLock = ImageVector.Builder(
            name = "message-square-lock",
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
                moveTo(22f, 8.5f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(16.286f)
                arcToRelative(0.71f, 0.71f, 0f, false, false, 1.212f, 0.502f)
                lineToRelative(2.202f, -2.202f)
                arcTo(2f, 2f, 0f, false, true, 6.828f, 19f)
                horizontalLineTo(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 15f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 22f, 16f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, false, true, 21f, 20f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 19f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, false, true, 15f, 15f)
                close()
            }
        }.build()
        
        return _MessageSquareLock!!
    }

private var _MessageSquareLock: ImageVector? = null

