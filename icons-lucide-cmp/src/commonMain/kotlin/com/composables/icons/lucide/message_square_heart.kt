package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageSquareHeart: ImageVector
    get() {
        if (_MessageSquareHeart != null) return _MessageSquareHeart!!
        
        _MessageSquareHeart = ImageVector.Builder(
            name = "message-square-heart",
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
                moveTo(22f, 17f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 0.586f)
                lineToRelative(-2.202f, 2.202f)
                arcTo(0.71f, 0.71f, 0f, false, true, 2f, 21.286f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 9.5f)
                curveToRelative(0f, 0.687f, 0.265f, 1.383f, 0.697f, 1.844f)
                lineToRelative(3.009f, 3.264f)
                arcToRelative(1.14f, 1.14f, 0f, false, false, 0.407f, 0.314f)
                arcToRelative(1f, 1f, 0f, false, false, 0.783f, -0.004f)
                arcToRelative(1.14f, 1.14f, 0f, false, false, 0.398f, -0.31f)
                lineToRelative(3.008f, -3.264f)
                arcTo(2.77f, 2.77f, 0f, false, false, 16.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 12f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -4.5f, 1.5f)
            }
        }.build()
        
        return _MessageSquareHeart!!
    }

private var _MessageSquareHeart: ImageVector? = null

