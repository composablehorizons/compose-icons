package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(18f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-18f, -18f)
                close()
                moveTo(20.57f, 16.476f)
                curveToRelative(-0.223f, 0.082f, -0.448f, 0.161f, -0.674f, 0.238f)
                lineTo(7.319f, 4.137f)
                arcTo(6.75f, 6.75f, 0f, false, true, 18.75f, 9f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 2.123f, 0.8f, 4.057f, 2.118f, 5.52f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.297f, 1.206f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.25f, 9f)
                curveToRelative(0f, -0.184f, 0.007f, -0.366f, 0.022f, -0.546f)
                lineToRelative(10.384f, 10.384f)
                arcToRelative(3.751f, 3.751f, 0f, false, true, -7.396f, -1.119f)
                arcToRelative(24.585f, 24.585f, 0f, false, true, -4.831f, -1.244f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.298f, -1.205f)
                arcTo(8.217f, 8.217f, 0f, false, false, 5.25f, 9.75f)
                verticalLineTo(9f)
                close()
                moveToRelative(4.502f, 8.9f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 4.496f, 0f)
                arcToRelative(25.057f, 25.057f, 0f, false, true, -4.496f, 0f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

