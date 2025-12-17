package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ReceiptRefund: ImageVector
    get() {
        if (_ReceiptRefund != null) return _ReceiptRefund!!
        
        _ReceiptRefund = ImageVector.Builder(
            name = "receipt-refund",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.93f, 2.31f)
                arcToRelative(41.401f, 41.401f, 0f, false, true, 10.14f, 0f)
                curveTo(16.194f, 2.45f, 17f, 3.414f, 17f, 4.517f)
                verticalLineTo(17.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.075f, 0.676f)
                lineToRelative(-2.8f, -1.344f)
                lineToRelative(-2.8f, 1.344f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.65f, 0f)
                lineToRelative(-2.8f, -1.344f)
                lineToRelative(-2.8f, 1.344f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 17.25f)
                verticalLineTo(4.517f)
                curveToRelative(0f, -1.103f, 0.806f, -2.068f, 1.93f, -2.207f)
                close()
                moveToRelative(4.822f, 3.997f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.004f, -1.114f)
                lineToRelative(-2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.114f)
                lineToRelative(2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.004f, -1.114f)
                lineTo(8.704f, 8.75f)
                horizontalLineToRelative(1.921f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                arcToRelative(3.375f, 3.375f, 0f, true, false, 0f, -6.75f)
                horizontalLineToRelative(-1.92f)
                lineToRelative(1.047f, -0.943f)
                close()
            }
        }.build()
        
        return _ReceiptRefund!!
    }

private var _ReceiptRefund: ImageVector? = null

