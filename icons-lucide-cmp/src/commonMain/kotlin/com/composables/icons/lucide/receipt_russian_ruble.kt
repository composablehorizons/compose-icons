package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ReceiptRussianRuble: ImageVector
    get() {
        if (_ReceiptRussianRuble != null) return _ReceiptRussianRuble!!
        
        _ReceiptRussianRuble = ImageVector.Builder(
            name = "receipt-russian-ruble",
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
            }
        }.build()
        
        return _ReceiptRussianRuble!!
    }

private var _ReceiptRussianRuble: ImageVector? = null

