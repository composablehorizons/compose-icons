package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.LightBulb: ImageVector
    get() {
        if (_LightBulb != null) return _LightBulb!!
        
        _LightBulb = ImageVector.Builder(
            name = "light-bulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1f)
                arcToRelative(6f, 6f, 0f, false, false, -3.815f, 10.631f)
                curveTo(7.237f, 12.5f, 8f, 13.443f, 8f, 14.456f)
                verticalLineToRelative(0.644f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.572f, 0.729f)
                arcToRelative(6.016f, 6.016f, 0f, false, false, 2.856f, 0f)
                arcTo(0.75f, 0.75f, 0f, false, false, 12f, 15.1f)
                verticalLineToRelative(-0.644f)
                curveToRelative(0f, -1.013f, 0.762f, -1.957f, 1.815f, -2.825f)
                arcTo(6f, 6f, 0f, false, false, 10f, 1f)
                close()
                moveTo(8.863f, 17.414f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.226f, 1.483f)
                arcToRelative(9.066f, 9.066f, 0f, false, false, 2.726f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.226f, -1.483f)
                arcToRelative(7.553f, 7.553f, 0f, false, true, -2.274f, 0f)
                close()
            }
        }.build()
        
        return _LightBulb!!
    }

private var _LightBulb: ImageVector? = null

