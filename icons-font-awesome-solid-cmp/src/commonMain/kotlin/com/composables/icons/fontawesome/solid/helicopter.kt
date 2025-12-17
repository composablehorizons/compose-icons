package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Helicopter: ImageVector
    get() {
        if (_Helicopter != null) return _Helicopter!!
        
        _Helicopter = ImageVector.Builder(
            name = "helicopter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(304f, 384f)
                horizontalLineToRelative(272f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                curveToRelative(0f, -123.71f, -100.29f, -224f, -224f, -224f)
                verticalLineTo(64f)
                horizontalLineToRelative(176f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(144f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(176f)
                verticalLineToRelative(64f)
                horizontalLineTo(112f)
                lineTo(68.8f, 70.4f)
                curveTo(65.78f, 66.37f, 61.03f, 64f, 56f, 64f)
                horizontalLineTo(16.01f)
                curveTo(5.6f, 64f, -2.04f, 73.78f, 0.49f, 83.88f)
                lineTo(32f, 192f)
                lineToRelative(160f, 64f)
                lineToRelative(86.4f, 115.2f)
                arcTo(31.992f, 31.992f, 0f, false, false, 304f, 384f)
                close()
                moveToRelative(112f, -188.49f)
                curveTo(478.55f, 208.3f, 528.03f, 257.44f, 540.79f, 320f)
                horizontalLineTo(416f)
                verticalLineTo(195.51f)
                close()
                moveToRelative(219.37f, 263.3f)
                lineToRelative(-22.15f, -22.2f)
                curveToRelative(-6.25f, -6.26f, -16.24f, -6.1f, -22.64f, 0.01f)
                curveToRelative(-7.09f, 6.77f, -13.84f, 11.25f, -24.64f, 11.25f)
                horizontalLineTo(240f)
                curveToRelative(-8.84f, 0f, -16f, 7.18f, -16f, 16.03f)
                verticalLineToRelative(32.06f)
                curveToRelative(0f, 8.85f, 7.16f, 16.03f, 16f, 16.03f)
                horizontalLineToRelative(325.94f)
                curveToRelative(14.88f, 0f, 35.3f, -0.47f, 68.45f, -29.52f)
                curveToRelative(7.02f, -6.14f, 7.57f, -17.05f, 0.98f, -23.66f)
                close()
            }
        }.build()
        
        return _Helicopter!!
    }

private var _Helicopter: ImageVector? = null

