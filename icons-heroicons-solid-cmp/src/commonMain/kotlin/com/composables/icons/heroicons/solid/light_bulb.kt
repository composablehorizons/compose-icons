package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.LightBulb: ImageVector
    get() {
        if (_LightBulb != null) return _LightBulb!!
        
        _LightBulb = ImageVector.Builder(
            name = "light-bulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0.75f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, -4.135f, 15.39f)
                curveToRelative(0.686f, 0.398f, 1.115f, 1.008f, 1.134f, 1.623f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.577f, 0.706f)
                curveToRelative(0.352f, 0.083f, 0.71f, 0.148f, 1.074f, 0.195f)
                curveToRelative(0.323f, 0.041f, 0.6f, -0.218f, 0.6f, -0.544f)
                verticalLineToRelative(-4.661f)
                arcToRelative(6.714f, 6.714f, 0f, false, true, -0.937f, -0.171f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.374f, -1.453f)
                arcToRelative(5.261f, 5.261f, 0f, false, false, 2.626f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.374f, 1.452f)
                arcToRelative(6.712f, 6.712f, 0f, false, true, -0.937f, 0.172f)
                verticalLineToRelative(4.66f)
                curveToRelative(0f, 0.327f, 0.277f, 0.586f, 0.6f, 0.545f)
                curveToRelative(0.364f, -0.047f, 0.722f, -0.112f, 1.074f, -0.195f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.577f, -0.706f)
                curveToRelative(0.02f, -0.615f, 0.448f, -1.225f, 1.134f, -1.623f)
                arcTo(8.25f, 8.25f, 0f, false, false, 12f, 0.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.013f, 19.9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.877f, -0.597f)
                arcToRelative(11.319f, 11.319f, 0f, false, false, 4.22f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.28f, 1.473f)
                arcToRelative(12.819f, 12.819f, 0f, false, true, -4.78f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.597f, -0.876f)
                close()
                moveTo(9.754f, 22.344f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.824f, -0.668f)
                arcToRelative(13.682f, 13.682f, 0f, false, false, 2.844f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.156f, 1.492f)
                arcToRelative(15.156f, 15.156f, 0f, false, true, -3.156f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.668f, -0.824f)
                close()
            }
        }.build()
        
        return _LightBulb!!
    }

private var _LightBulb: ImageVector? = null

