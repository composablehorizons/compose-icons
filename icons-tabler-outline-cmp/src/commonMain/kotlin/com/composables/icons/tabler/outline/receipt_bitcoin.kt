package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ReceiptBitcoin: ImageVector
    get() {
        if (_ReceiptBitcoin != null) return _ReceiptBitcoin!!
        
        _ReceiptBitcoin = ImageVector.Builder(
            name = "receipt-bitcoin",
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
                moveTo(5f, 21f)
                verticalLineToRelative(-16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(16f)
                lineToRelative(-3f, -2f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                lineToRelative(-3f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                horizontalLineToRelative(4.09f)
                curveToRelative(1.055f, 0f, 1.91f, 0.895f, 1.91f, 2f)
                reflectiveCurveToRelative(-0.855f, 2f, -1.91f, 2f)
                curveToRelative(1.055f, 0f, 1.91f, 0.895f, 1.91f, 2f)
                reflectiveCurveToRelative(-0.855f, 2f, -1.91f, 2f)
                horizontalLineToRelative(-4.09f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 6f)
                verticalLineToRelative(10f)
                verticalLineToRelative(-9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 6f)
                verticalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 15f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _ReceiptBitcoin!!
    }

private var _ReceiptBitcoin: ImageVector? = null

