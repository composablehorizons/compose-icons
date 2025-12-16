package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ReceiptJapaneseYen: ImageVector
    get() {
        if (_ReceiptJapaneseYen != null) return _ReceiptJapaneseYen!!
        
        _ReceiptJapaneseYen = ImageVector.Builder(
            name = "receipt-japanese-yen",
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
                moveTo(12f, 10f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(7.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _ReceiptJapaneseYen!!
    }

private var _ReceiptJapaneseYen: ImageVector? = null

