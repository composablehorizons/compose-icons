package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.VercelLogo: ImageVector
    get() {
        if (_VercelLogo != null) return _VercelLogo!!
        
        _VercelLogo = ImageVector.Builder(
            name = "vercel-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.3998f, 13f)
                horizontalLineTo(0.599976f)
                lineTo(7.50037f, 1f)
                lineTo(14.3998f, 13f)
                close()
                moveTo(2.32849f, 12f)
                horizontalLineTo(12.6713f)
                lineTo(7.49939f, 3.00488f)
                lineTo(2.32849f, 12f)
                close()
            }
        }.build()
        
        return _VercelLogo!!
    }

private var _VercelLogo: ImageVector? = null

