package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChefHat: ImageVector
    get() {
        if (_ChefHat != null) return _ChefHat!!
        
        _ChefHat = ImageVector.Builder(
            name = "chef-hat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 19.002f)
                verticalLineToRelative(1.998f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-1.994f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                lineToRelative(12f, -0.004f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(5f, 5f, 0f, false, true, 4.533f, 2.888f)
                lineToRelative(0.06f, 0.137f)
                lineToRelative(0.136f, -0.009f)
                arcToRelative(5f, 5f, 0f, false, true, 4.99f, 3.477f)
                lineToRelative(0.063f, 0.213f)
                arcToRelative(5f, 5f, 0f, false, true, -2.696f, 5.831f)
                lineToRelative(-0.087f, 0.037f)
                verticalLineToRelative(1.428f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                lineToRelative(-12f, 0.004f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.433f)
                lineToRelative(-0.123f, -0.055f)
                arcToRelative(5f, 5f, 0f, false, true, -2.6f, -3.001f)
                lineToRelative(-0.064f, -0.223f)
                arcToRelative(5f, 5f, 0f, false, true, 5.193f, -6.27f)
                lineToRelative(0.066f, -0.142f)
                arcToRelative(5f, 5f, 0f, false, true, 4.302f, -2.877f)
                close()
            }
        }.build()
        
        return _ChefHat!!
    }

private var _ChefHat: ImageVector? = null

