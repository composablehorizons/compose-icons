package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Wifi: ImageVector
    get() {
        if (_Wifi != null) return _Wifi!!
        
        _Wifi = ImageVector.Builder(
            name = "wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.371f, 8.143f)
                curveToRelative(5.858f, -5.857f, 15.356f, -5.857f, 21.213f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                curveToRelative(-4.98f, -4.979f, -13.053f, -4.979f, -18.032f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(3.182f, 3.182f)
                curveToRelative(4.1f, -4.1f, 10.749f, -4.1f, 14.85f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.062f, 0f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, -11.667f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(3.204f, 3.182f)
                arcToRelative(6f, 6f, 0f, false, true, 8.486f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, -5.304f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(3.182f, 3.182f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.122f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 0f)
                lineToRelative(-0.53f, -0.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null

