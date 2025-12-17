package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PaperPlane: ImageVector
    get() {
        if (_PaperPlane != null) return _PaperPlane!!
        
        _PaperPlane = ImageVector.Builder(
            name = "paper-plane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476f, 3.2f)
                lineTo(12.5f, 270.6f)
                curveToRelative(-18.1f, 10.4f, -15.8f, 35.6f, 2.2f, 43.2f)
                lineTo(121f, 358.4f)
                lineToRelative(287.3f, -253.2f)
                curveToRelative(5.5f, -4.9f, 13.3f, 2.6f, 8.6f, 8.3f)
                lineTo(176f, 407f)
                verticalLineToRelative(80.5f)
                curveToRelative(0f, 23.6f, 28.5f, 32.9f, 42.5f, 15.8f)
                lineTo(282f, 426f)
                lineToRelative(124.6f, 52.2f)
                curveToRelative(14.2f, 6f, 30.4f, -2.9f, 33f, -18.2f)
                lineToRelative(72f, -432f)
                curveTo(515f, 7.8f, 493.3f, -6.8f, 476f, 3.2f)
                close()
            }
        }.build()
        
        return _PaperPlane!!
    }

private var _PaperPlane: ImageVector? = null

