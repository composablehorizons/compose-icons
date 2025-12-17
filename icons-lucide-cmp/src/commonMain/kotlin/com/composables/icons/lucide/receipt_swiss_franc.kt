package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ReceiptSwissFranc: ImageVector
    get() {
        if (_ReceiptSwissFranc != null) return _ReceiptSwissFranc!!
        
        _ReceiptSwissFranc = ImageVector.Builder(
            name = "receipt-swiss-franc",
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
                moveTo(10f, 17f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                horizontalLineToRelative(5f)
            }
        }.build()
        
        return _ReceiptSwissFranc!!
    }

private var _ReceiptSwissFranc: ImageVector? = null

