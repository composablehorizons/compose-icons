package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) return _Umbrella!!
        
        _Umbrella = ImageVector.Builder(
            name = "umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(575.7f, 280.8f)
                curveTo(547.1f, 144.5f, 437.3f, 62.6f, 320f, 49.9f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                verticalLineToRelative(17.9f)
                curveTo(138.3f, 62.6f, 29.5f, 144.5f, 0.3f, 280.8f)
                curveToRelative(-2.2f, 10.1f, 8.5f, 21.3f, 18.7f, 11.4f)
                curveToRelative(52f, -55f, 107.7f, -52.4f, 158.6f, 37f)
                curveToRelative(5.3f, 9.5f, 14.9f, 8.6f, 19.7f, 0f)
                curveToRelative(20.2f, -35.4f, 44.9f, -73.2f, 90.7f, -73.2f)
                curveToRelative(58.5f, 0f, 88.2f, 68.8f, 90.7f, 73.2f)
                curveToRelative(4.8f, 8.6f, 14.4f, 9.5f, 19.7f, 0f)
                curveToRelative(51f, -89.5f, 107.1f, -91.4f, 158.6f, -37f)
                curveToRelative(10.3f, 10f, 20.9f, -1.3f, 18.7f, -11.4f)
                close()
                moveTo(256f, 301.7f)
                verticalLineTo(432f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                curveToRelative(-7.8f, 0f, -13.2f, -5.3f, -15.1f, -10.7f)
                curveToRelative(-5.9f, -16.7f, -24.1f, -25.4f, -40.8f, -19.5f)
                curveToRelative(-16.7f, 5.9f, -25.4f, 24.2f, -19.5f, 40.8f)
                curveToRelative(11.2f, 31.9f, 41.6f, 53.3f, 75.4f, 53.3f)
                curveToRelative(44.1f, 0f, 80f, -35.9f, 80f, -80f)
                verticalLineTo(301.6f)
                curveToRelative(-9.1f, -7.9f, -19.8f, -13.6f, -32f, -13.6f)
                curveToRelative(-12.3f, 0.1f, -22.4f, 4.8f, -32f, 13.7f)
                close()
            }
        }.build()
        
        return _Umbrella!!
    }

private var _Umbrella: ImageVector? = null

