package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Wallet: ImageVector
    get() {
        if (_Wallet != null) return _Wallet!!
        
        _Wallet = ImageVector.Builder(
            name = "wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.25f)
                arcToRelative(3.733f, 3.733f, 0f, false, true, 2.25f, -0.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.844f, 0f, 1.623f, 0.279f, 2.25f, 0.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 16.75f, 2f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 4.25f)
                close()
                moveTo(1f, 7.25f)
                arcToRelative(3.733f, 3.733f, 0f, false, true, 2.25f, -0.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.844f, 0f, 1.623f, 0.279f, 2.25f, 0.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 16.75f, 5f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 7.25f)
                close()
                moveTo(7f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(3.75f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19f, 10.25f)
                verticalLineToRelative(5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.75f, 18f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 15.75f)
                verticalLineToRelative(-5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 8f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null

