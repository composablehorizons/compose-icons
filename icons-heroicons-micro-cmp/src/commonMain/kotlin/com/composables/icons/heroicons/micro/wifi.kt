package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Wifi: ImageVector
    get() {
        if (_Wifi != null) return _Wifi!!
        
        _Wifi = ImageVector.Builder(
            name = "wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.188f, 7.063f)
                arcToRelative(8.75f, 8.75f, 0f, false, false, -12.374f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, -1.06f)
                curveToRelative(4.003f, -4.004f, 10.493f, -4.004f, 14.496f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.061f, 1.06f)
                close()
                moveToRelative(-2.121f, 2.121f)
                arcToRelative(5.75f, 5.75f, 0f, false, false, -8.132f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                arcToRelative(7.25f, 7.25f, 0f, false, true, 10.252f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                close()
                moveToRelative(-2.122f, 2.122f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -3.889f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.061f)
                arcToRelative(4.25f, 4.25f, 0f, false, true, 6.01f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                close()
                moveToRelative(-2.828f, 1.06f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 1.768f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-0.355f, 0.355f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.354f, -0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null

