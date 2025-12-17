package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ReceiptPercent: ImageVector
    get() {
        if (_ReceiptPercent != null) return _ReceiptPercent!!
        
        _ReceiptPercent = ImageVector.Builder(
            name = "receipt-percent",
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
                moveToRelative(5.53f, 4.28f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(4.5f, -4.5f)
                close()
                moveTo(7f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveToRelative(2.75f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _ReceiptPercent!!
    }

private var _ReceiptPercent: ImageVector? = null

