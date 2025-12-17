package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Magic: ImageVector
    get() {
        if (_Magic != null) return _Magic!!
        
        _Magic = ImageVector.Builder(
            name = "magic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 96f)
                lineToRelative(16f, -32f)
                lineToRelative(32f, -16f)
                lineToRelative(-32f, -16f)
                lineToRelative(-16f, -32f)
                lineToRelative(-16f, 32f)
                lineToRelative(-32f, 16f)
                lineToRelative(32f, 16f)
                lineToRelative(16f, 32f)
                close()
                moveTo(80f, 160f)
                lineToRelative(26.66f, -53.33f)
                lineTo(160f, 80f)
                lineToRelative(-53.34f, -26.67f)
                lineTo(80f, 0f)
                lineTo(53.34f, 53.33f)
                lineTo(0f, 80f)
                lineToRelative(53.34f, 26.67f)
                lineTo(80f, 160f)
                close()
                moveToRelative(352f, 128f)
                lineToRelative(-26.66f, 53.33f)
                lineTo(352f, 368f)
                lineToRelative(53.34f, 26.67f)
                lineTo(432f, 448f)
                lineToRelative(26.66f, -53.33f)
                lineTo(512f, 368f)
                lineToRelative(-53.34f, -26.67f)
                lineTo(432f, 288f)
                close()
                moveToRelative(70.62f, -193.77f)
                lineTo(417.77f, 9.38f)
                curveTo(411.53f, 3.12f, 403.34f, 0f, 395.15f, 0f)
                curveToRelative(-8.19f, 0f, -16.38f, 3.12f, -22.63f, 9.38f)
                lineTo(9.38f, 372.52f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0f, 45.25f)
                lineToRelative(84.85f, 84.85f)
                curveToRelative(6.25f, 6.25f, 14.44f, 9.37f, 22.62f, 9.37f)
                curveToRelative(8.19f, 0f, 16.38f, -3.12f, 22.63f, -9.37f)
                lineToRelative(363.14f, -363.15f)
                curveToRelative(12.5f, -12.48f, 12.5f, -32.75f, 0f, -45.24f)
                close()
                moveTo(359.45f, 203.46f)
                lineToRelative(-50.91f, -50.91f)
                lineToRelative(86.6f, -86.6f)
                lineToRelative(50.91f, 50.91f)
                lineToRelative(-86.6f, 86.6f)
                close()
            }
        }.build()
        
        return _Magic!!
    }

private var _Magic: ImageVector? = null

