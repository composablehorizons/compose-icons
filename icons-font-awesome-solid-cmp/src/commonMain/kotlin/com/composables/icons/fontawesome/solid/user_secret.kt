package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserSecret: ImageVector
    get() {
        if (_UserSecret != null) return _UserSecret!!
        
        _UserSecret = ImageVector.Builder(
            name = "user-secret",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(383.9f, 308.3f)
                lineToRelative(23.9f, -62.6f)
                curveToRelative(4f, -10.5f, -3.7f, -21.7f, -15f, -21.7f)
                horizontalLineToRelative(-58.5f)
                curveToRelative(11f, -18.9f, 17.8f, -40.6f, 17.8f, -64f)
                verticalLineToRelative(-0.3f)
                curveToRelative(39.2f, -7.8f, 64f, -19.1f, 64f, -31.7f)
                curveToRelative(0f, -13.3f, -27.3f, -25.1f, -70.1f, -33f)
                curveToRelative(-9.2f, -32.8f, -27f, -65.8f, -40.6f, -82.8f)
                curveToRelative(-9.5f, -11.9f, -25.9f, -15.6f, -39.5f, -8.8f)
                lineToRelative(-27.6f, 13.8f)
                curveToRelative(-9f, 4.5f, -19.6f, 4.5f, -28.6f, 0f)
                lineTo(182.1f, 3.4f)
                curveToRelative(-13.6f, -6.8f, -30f, -3.1f, -39.5f, 8.8f)
                curveToRelative(-13.5f, 17f, -31.4f, 50f, -40.6f, 82.8f)
                curveToRelative(-42.7f, 7.9f, -70f, 19.7f, -70f, 33f)
                curveToRelative(0f, 12.6f, 24.8f, 23.9f, 64f, 31.7f)
                verticalLineToRelative(0.3f)
                curveToRelative(0f, 23.4f, 6.8f, 45.1f, 17.8f, 64f)
                horizontalLineTo(56.3f)
                curveToRelative(-11.5f, 0f, -19.2f, 11.7f, -14.7f, 22.3f)
                lineToRelative(25.8f, 60.2f)
                curveTo(27.3f, 329.8f, 0f, 372.7f, 0f, 422.4f)
                verticalLineToRelative(44.8f)
                curveTo(0f, 491.9f, 20.1f, 512f, 44.8f, 512f)
                horizontalLineToRelative(358.4f)
                curveToRelative(24.7f, 0f, 44.8f, -20.1f, 44.8f, -44.8f)
                verticalLineToRelative(-44.8f)
                curveToRelative(0f, -48.4f, -25.8f, -90.4f, -64.1f, -114.1f)
                close()
                moveTo(176f, 480f)
                lineToRelative(-41.6f, -192f)
                lineToRelative(49.6f, 32f)
                lineToRelative(24f, 40f)
                lineToRelative(-32f, 120f)
                close()
                moveToRelative(96f, 0f)
                lineToRelative(-32f, -120f)
                lineToRelative(24f, -40f)
                lineToRelative(49.6f, -32f)
                lineTo(272f, 480f)
                close()
                moveToRelative(41.7f, -298.5f)
                curveToRelative(-3.9f, 11.9f, -7f, 24.6f, -16.5f, 33.4f)
                curveToRelative(-10.1f, 9.3f, -48f, 22.4f, -64f, -25f)
                curveToRelative(-2.8f, -8.4f, -15.4f, -8.4f, -18.3f, 0f)
                curveToRelative(-17f, 50.2f, -56f, 32.4f, -64f, 25f)
                curveToRelative(-9.5f, -8.8f, -12.7f, -21.5f, -16.5f, -33.4f)
                curveToRelative(-0.8f, -2.5f, -6.3f, -5.7f, -6.3f, -5.8f)
                verticalLineToRelative(-10.8f)
                curveToRelative(28.3f, 3.6f, 61f, 5.8f, 96f, 5.8f)
                reflectiveCurveToRelative(67.7f, -2.1f, 96f, -5.8f)
                verticalLineToRelative(10.8f)
                curveToRelative(-0.1f, 0.1f, -5.6f, 3.2f, -6.4f, 5.8f)
                close()
            }
        }.build()
        
        return _UserSecret!!
    }

private var _UserSecret: ImageVector? = null

