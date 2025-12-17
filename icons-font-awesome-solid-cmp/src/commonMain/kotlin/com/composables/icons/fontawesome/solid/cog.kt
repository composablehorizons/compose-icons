package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cog: ImageVector
    get() {
        if (_Cog != null) return _Cog!!
        
        _Cog = ImageVector.Builder(
            name = "cog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(487.4f, 315.7f)
                lineToRelative(-42.6f, -24.6f)
                curveToRelative(4.3f, -23.2f, 4.3f, -47f, 0f, -70.2f)
                lineToRelative(42.6f, -24.6f)
                curveToRelative(4.9f, -2.8f, 7.1f, -8.6f, 5.5f, -14f)
                curveToRelative(-11.1f, -35.6f, -30f, -67.8f, -54.7f, -94.6f)
                curveToRelative(-3.8f, -4.1f, -10f, -5.1f, -14.8f, -2.3f)
                lineTo(380.8f, 110f)
                curveToRelative(-17.9f, -15.4f, -38.5f, -27.3f, -60.8f, -35.1f)
                verticalLineTo(25.8f)
                curveToRelative(0f, -5.6f, -3.9f, -10.5f, -9.4f, -11.7f)
                curveToRelative(-36.7f, -8.2f, -74.3f, -7.8f, -109.2f, 0f)
                curveToRelative(-5.5f, 1.2f, -9.4f, 6.1f, -9.4f, 11.7f)
                verticalLineTo(75f)
                curveToRelative(-22.2f, 7.9f, -42.8f, 19.8f, -60.8f, 35.1f)
                lineTo(88.7f, 85.5f)
                curveToRelative(-4.9f, -2.8f, -11f, -1.9f, -14.8f, 2.3f)
                curveToRelative(-24.7f, 26.7f, -43.6f, 58.9f, -54.7f, 94.6f)
                curveToRelative(-1.7f, 5.4f, 0.6f, 11.2f, 5.5f, 14f)
                lineTo(67.3f, 221f)
                curveToRelative(-4.3f, 23.2f, -4.3f, 47f, 0f, 70.2f)
                lineToRelative(-42.6f, 24.6f)
                curveToRelative(-4.9f, 2.8f, -7.1f, 8.6f, -5.5f, 14f)
                curveToRelative(11.1f, 35.6f, 30f, 67.8f, 54.7f, 94.6f)
                curveToRelative(3.8f, 4.1f, 10f, 5.1f, 14.8f, 2.3f)
                lineToRelative(42.6f, -24.6f)
                curveToRelative(17.9f, 15.4f, 38.5f, 27.3f, 60.8f, 35.1f)
                verticalLineToRelative(49.2f)
                curveToRelative(0f, 5.6f, 3.9f, 10.5f, 9.4f, 11.7f)
                curveToRelative(36.7f, 8.2f, 74.3f, 7.8f, 109.2f, 0f)
                curveToRelative(5.5f, -1.2f, 9.4f, -6.1f, 9.4f, -11.7f)
                verticalLineToRelative(-49.2f)
                curveToRelative(22.2f, -7.9f, 42.8f, -19.8f, 60.8f, -35.1f)
                lineToRelative(42.6f, 24.6f)
                curveToRelative(4.9f, 2.8f, 11f, 1.9f, 14.8f, -2.3f)
                curveToRelative(24.7f, -26.7f, 43.6f, -58.9f, 54.7f, -94.6f)
                curveToRelative(1.5f, -5.5f, -0.7f, -11.3f, -5.6f, -14.1f)
                close()
                moveTo(256f, 336f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _Cog!!
    }

private var _Cog: ImageVector? = null

