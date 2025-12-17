package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ReceiptRefund: ImageVector
    get() {
        if (_ReceiptRefund != null) return _ReceiptRefund!!
        
        _ReceiptRefund = ImageVector.Builder(
            name = "receipt-refund",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.25f, 2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3f, 4.25f)
                verticalLineToRelative(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.183f, 0.613f)
                lineToRelative(1.692f, -1.195f)
                lineToRelative(1.692f, 1.195f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.866f, 0f)
                lineToRelative(1.692f, -1.195f)
                lineToRelative(1.693f, 1.195f)
                arcTo(0.75f, 0.75f, 0f, false, false, 13f, 13.25f)
                verticalLineToRelative(-9f)
                arcTo(2.25f, 2.25f, 0f, false, false, 10.75f, 2f)
                horizontalLineToRelative(-5.5f)
                close()
                moveToRelative(3.03f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(4.97f, 6.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-0.97f, -0.97f)
                horizontalLineToRelative(1.315f)
                curveToRelative(0.76f, 0f, 1.375f, 0.616f, 1.375f, 1.375f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                arcTo(2.875f, 2.875f, 0f, false, false, 8.625f, 6.25f)
                horizontalLineTo(7.311f)
                lineToRelative(0.97f, -0.97f)
                close()
            }
        }.build()
        
        return _ReceiptRefund!!
    }

private var _ReceiptRefund: ImageVector? = null

