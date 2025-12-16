package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ReceiptText: ImageVector
    get() {
        if (_ReceiptText != null) return _ReceiptText!!
        
        _ReceiptText = ImageVector.Builder(
            name = "receipt-text",
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
                moveTo(13f, 16f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, 0.7f, 0.2f)
                lineToRelative(0.933f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, 1.4f, 0f)
                lineToRelative(0.934f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, 1.4f, 0f)
                lineToRelative(0.933f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, 1.4f, 0f)
                lineToRelative(0.933f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, 1.4f, 0f)
                lineToRelative(0.934f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, 1.4f, 0f)
                lineToRelative(0.933f, -0.6f)
                arcTo(1.3f, 1.3f, 0f, false, true, 19f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.7f, -0.2f)
                lineToRelative(-0.933f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-0.934f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -1.4f, 0f)
                lineToRelative(-0.933f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-0.933f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -1.4f, 0f)
                lineToRelative(-0.934f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-0.933f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.7f, 0.2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _ReceiptText!!
    }

private var _ReceiptText: ImageVector? = null

