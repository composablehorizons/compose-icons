package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ReceiptPercent: ImageVector
    get() {
        if (_ReceiptPercent != null) return _ReceiptPercent!!
        
        _ReceiptPercent = ImageVector.Builder(
            name = "receipt-percent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(9f, 14.25f)
                lineToRelative(6f, -6f)
                moveToRelative(4.5f, -3.493f)
                verticalLineTo(21.75f)
                lineToRelative(-3.75f, -1.5f)
                lineToRelative(-3.75f, 1.5f)
                lineToRelative(-3.75f, -1.5f)
                lineToRelative(-3.75f, 1.5f)
                verticalLineTo(4.757f)
                curveToRelative(0f, -1.108f, 0.806f, -2.057f, 1.907f, -2.185f)
                arcToRelative(48.507f, 48.507f, 0f, false, true, 11.186f, 0f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                close()
                moveTo(9.75f, 9f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(9.75f)
                verticalLineTo(9f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(4.125f, 4.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(13.5f)
                close()
                moveToRelative(0.375f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
            }
        }.build()
        
        return _ReceiptPercent!!
    }

private var _ReceiptPercent: ImageVector? = null

