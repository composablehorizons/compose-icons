package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Quidditch: ImageVector
    get() {
        if (_Quidditch != null) return _Quidditch!!
        
        _Quidditch = ImageVector.Builder(
            name = "quidditch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256.5f, 216.8f)
                lineTo(343.2f, 326f)
                reflectiveCurveToRelative(-16.6f, 102.4f, -76.6f, 150.1f)
                curveTo(206.7f, 523.8f, 0f, 510.2f, 0f, 510.2f)
                reflectiveCurveToRelative(3.8f, -23.1f, 11f, -55.4f)
                lineToRelative(94.6f, -112.2f)
                curveToRelative(4f, -4.7f, -0.9f, -11.6f, -6.6f, -9.5f)
                lineToRelative(-60.4f, 22.1f)
                curveToRelative(14.4f, -41.7f, 32.7f, -80f, 54.6f, -97.5f)
                curveToRelative(59.9f, -47.8f, 163.3f, -40.9f, 163.3f, -40.9f)
                close()
                moveToRelative(238f, 135f)
                curveToRelative(-44f, 0f, -79.8f, 35.8f, -79.8f, 79.9f)
                curveToRelative(0f, 44.1f, 35.7f, 79.9f, 79.8f, 79.9f)
                curveToRelative(44.1f, 0f, 79.8f, -35.8f, 79.8f, -79.9f)
                curveToRelative(0f, -44.2f, -35.8f, -79.9f, -79.8f, -79.9f)
                close()
                moveTo(636.5f, 31f)
                lineTo(616.7f, 6f)
                curveToRelative(-5.5f, -6.9f, -15.5f, -8f, -22.4f, -2.6f)
                lineTo(361.8f, 181.3f)
                lineToRelative(-34.1f, -43f)
                curveToRelative(-5.1f, -6.4f, -15.1f, -5.2f, -18.6f, 2.2f)
                lineToRelative(-25.3f, 54.6f)
                lineToRelative(86.7f, 109.2f)
                lineToRelative(58.8f, -12.4f)
                curveToRelative(8f, -1.7f, 11.4f, -11.2f, 6.3f, -17.6f)
                lineToRelative(-34.1f, -42.9f)
                lineTo(634f, 53.5f)
                curveToRelative(6.9f, -5.5f, 8f, -15.6f, 2.5f, -22.5f)
                close()
            }
        }.build()
        
        return _Quidditch!!
    }

private var _Quidditch: ImageVector? = null

