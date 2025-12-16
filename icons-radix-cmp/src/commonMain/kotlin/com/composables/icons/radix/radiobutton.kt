package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Radiobutton: ImageVector
    get() {
        if (_Radiobutton != null) return _Radiobutton!!
        
        _Radiobutton = ImageVector.Builder(
            name = "radiobutton",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49908f, 0.87706f)
                curveTo(11.1565f, 0.87706f, 14.1217f, 3.84179f, 14.1221f, 7.49913f)
                curveTo(14.1221f, 11.1568f, 11.1567f, 14.1222f, 7.49908f, 14.1222f)
                curveTo(3.84175f, 14.1218f, 0.877014f, 11.1565f, 0.877014f, 7.49913f)
                curveTo(0.877426f, 3.84205f, 3.842f, 0.877471f, 7.49908f, 0.87706f)
                close()
                moveTo(7.49908f, 1.82628f)
                curveTo(4.36667f, 1.82669f, 1.82664f, 4.36672f, 1.82623f, 7.49913f)
                curveTo(1.82623f, 10.6319f, 4.36642f, 13.1716f, 7.49908f, 13.172f)
                curveTo(10.6321f, 13.172f, 13.1719f, 10.6321f, 13.1719f, 7.49913f)
                curveTo(13.1715f, 4.36647f, 10.6318f, 1.82628f, 7.49908f, 1.82628f)
                close()
                moveTo(7.50006f, 5.50011f)
                curveTo(8.6046f, 5.50014f, 9.50006f, 6.39556f, 9.50006f, 7.50011f)
                curveTo(9.50001f, 8.60461f, 8.60457f, 9.50007f, 7.50006f, 9.50011f)
                curveTo(6.39552f, 9.50011f, 5.50011f, 8.60463f, 5.50006f, 7.50011f)
                curveTo(5.50006f, 6.39554f, 6.39549f, 5.50011f, 7.50006f, 5.50011f)
                close()
            }
        }.build()
        
        return _Radiobutton!!
    }

private var _Radiobutton: ImageVector? = null

