package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Terminal: ImageVector
    get() {
        if (_Terminal != null) return _Terminal!!
        
        _Terminal = ImageVector.Builder(
            name = "terminal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(257.981f, 272.971f)
                lineTo(63.638f, 467.314f)
                curveToRelative(-9.373f, 9.373f, -24.569f, 9.373f, -33.941f, 0f)
                lineTo(7.029f, 444.647f)
                curveToRelative(-9.357f, -9.357f, -9.375f, -24.522f, -0.04f, -33.901f)
                lineTo(161.011f, 256f)
                lineTo(6.99f, 101.255f)
                curveToRelative(-9.335f, -9.379f, -9.317f, -24.544f, 0.04f, -33.901f)
                lineToRelative(22.667f, -22.667f)
                curveToRelative(9.373f, -9.373f, 24.569f, -9.373f, 33.941f, 0f)
                lineTo(257.981f, 239.03f)
                curveToRelative(9.373f, 9.372f, 9.373f, 24.568f, 0f, 33.941f)
                close()
                moveTo(640f, 456f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(312f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(304f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                close()
            }
        }.build()
        
        return _Terminal!!
    }

private var _Terminal: ImageVector? = null

