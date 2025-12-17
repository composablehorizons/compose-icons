package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Wifi: ImageVector
    get() {
        if (_Wifi != null) return _Wifi!!
        
        _Wifi = ImageVector.Builder(
            name = "wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.676f, 6.941f)
                arcTo(12.964f, 12.964f, 0f, false, true, 10f, 3f)
                curveToRelative(3.657f, 0f, 6.963f, 1.511f, 9.324f, 3.941f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.008f, 1.053f)
                lineToRelative(-0.353f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.069f, -0.008f)
                curveTo(15.894f, 6.28f, 13.097f, 5f, 10f, 5f)
                curveTo(6.903f, 5f, 4.106f, 6.28f, 2.106f, 8.34f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.069f, 0.008f)
                lineToRelative(-0.353f, -0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.008f, -1.053f)
                close()
                moveToRelative(2.825f, 2.833f)
                arcTo(8.976f, 8.976f, 0f, false, true, 10f, 7f)
                arcToRelative(8.976f, 8.976f, 0f, false, true, 6.499f, 2.774f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.011f, 1.049f)
                lineToRelative(-0.354f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.072f, -0.012f)
                arcTo(6.978f, 6.978f, 0f, false, false, 10f, 9f)
                curveToRelative(-1.99f, 0f, -3.786f, 0.83f, -5.061f, 2.165f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.073f, 0.012f)
                lineToRelative(-0.354f, -0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.01f, -1.05f)
                close()
                moveToRelative(2.82f, 2.84f)
                arcTo(4.989f, 4.989f, 0f, false, true, 10f, 11f)
                curveToRelative(1.456f, 0f, 2.767f, 0.623f, 3.68f, 1.614f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.022f, 1.039f)
                lineToRelative(-0.354f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.085f, -0.026f)
                arcTo(2.99f, 2.99f, 0f, false, false, 10f, 13f)
                curveToRelative(-0.88f, 0f, -1.67f, 0.377f, -2.22f, 0.981f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.084f, 0.026f)
                lineToRelative(-0.354f, -0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.021f, -1.039f)
                close()
                moveToRelative(2.795f, 2.752f)
                arcToRelative(1.248f, 1.248f, 0f, false, true, 1.768f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-0.354f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.354f, -0.353f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null

