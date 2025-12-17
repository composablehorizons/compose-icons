package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ReceiptEuro: ImageVector
    get() {
        if (_ReceiptEuro != null) return _ReceiptEuro!!
        
        _ReceiptEuro = ImageVector.Builder(
            name = "receipt-euro",
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
                moveTo(4f, 2f)
                verticalLineToRelative(20f)
                lineToRelative(2f, -1f)
                lineToRelative(2f, 1f)
                lineToRelative(2f, -1f)
                lineToRelative(2f, 1f)
                lineToRelative(2f, -1f)
                lineToRelative(2f, 1f)
                lineToRelative(2f, -1f)
                lineToRelative(2f, 1f)
                verticalLineTo(2f)
                lineToRelative(-2f, 1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-2f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9.5f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 5.2f)
            }
        }.build()
        
        return _ReceiptEuro!!
    }

private var _ReceiptEuro: ImageVector? = null

