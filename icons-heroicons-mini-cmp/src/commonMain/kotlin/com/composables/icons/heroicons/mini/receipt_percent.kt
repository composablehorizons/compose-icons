package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ReceiptPercent: ImageVector
    get() {
        if (_ReceiptPercent != null) return _ReceiptPercent!!
        
        _ReceiptPercent = ImageVector.Builder(
            name = "receipt-percent",
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
                moveToRelative(8.85f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(6.5f, -6.5f)
                close()
                moveTo(9f, 8f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveToRelative(3f, 5f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ReceiptPercent!!
    }

private var _ReceiptPercent: ImageVector? = null

