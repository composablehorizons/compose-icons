package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Fire: ImageVector
    get() {
        if (_Fire != null) return _Fire!!
        
        _Fire = ImageVector.Builder(
            name = "fire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 23.86f)
                curveToRelative(0f, -23.8f, -30.65f, -32.77f, -44.15f, -13.04f)
                curveTo(48f, 191.85f, 224f, 200f, 224f, 288f)
                curveToRelative(0f, 35.63f, -29.11f, 64.46f, -64.85f, 63.99f)
                curveToRelative(-35.17f, -0.45f, -63.15f, -29.77f, -63.15f, -64.94f)
                verticalLineToRelative(-85.51f)
                curveToRelative(0f, -21.7f, -26.47f, -32.23f, -41.43f, -16.5f)
                curveTo(27.8f, 213.16f, 0f, 261.33f, 0f, 320f)
                curveToRelative(0f, 105.87f, 86.13f, 192f, 192f, 192f)
                reflectiveCurveToRelative(192f, -86.13f, 192f, -192f)
                curveToRelative(0f, -170.29f, -168f, -193f, -168f, -296.14f)
                close()
            }
        }.build()
        
        return _Fire!!
    }

private var _Fire: ImageVector? = null

