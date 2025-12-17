package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.EyeDropper: ImageVector
    get() {
        if (_EyeDropper != null) return _EyeDropper!!
        
        _EyeDropper = ImageVector.Builder(
            name = "eye-dropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(50.75f, 333.25f)
                curveToRelative(-12f, 12f, -18.75f, 28.28f, -18.75f, 45.26f)
                verticalLineTo(424f)
                lineTo(0f, 480f)
                lineToRelative(32f, 32f)
                lineToRelative(56f, -32f)
                horizontalLineToRelative(45.49f)
                curveToRelative(16.97f, 0f, 33.25f, -6.74f, 45.25f, -18.74f)
                lineToRelative(126.64f, -126.62f)
                lineToRelative(-128f, -128f)
                lineTo(50.75f, 333.25f)
                close()
                moveTo(483.88f, 28.12f)
                curveToRelative(-37.47f, -37.5f, -98.28f, -37.5f, -135.75f, 0f)
                lineToRelative(-77.09f, 77.09f)
                lineToRelative(-13.1f, -13.1f)
                curveToRelative(-9.44f, -9.44f, -24.65f, -9.31f, -33.94f, 0f)
                lineToRelative(-40.97f, 40.97f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0f, 33.94f)
                lineToRelative(161.94f, 161.94f)
                curveToRelative(9.44f, 9.44f, 24.65f, 9.31f, 33.94f, 0f)
                lineTo(419.88f, 288f)
                curveToRelative(9.37f, -9.37f, 9.37f, -24.57f, 0f, -33.94f)
                lineToRelative(-13.1f, -13.1f)
                lineToRelative(77.09f, -77.09f)
                curveToRelative(37.51f, -37.48f, 37.51f, -98.26f, 0.01f, -135.75f)
                close()
            }
        }.build()
        
        return _EyeDropper!!
    }

private var _EyeDropper: ImageVector? = null

