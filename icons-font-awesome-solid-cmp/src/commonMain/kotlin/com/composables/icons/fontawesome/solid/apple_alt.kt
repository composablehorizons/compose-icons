package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AppleAlt: ImageVector
    get() {
        if (_AppleAlt != null) return _AppleAlt!!
        
        _AppleAlt = ImageVector.Builder(
            name = "apple-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(350.85f, 129f)
                curveToRelative(25.97f, 4.67f, 47.27f, 18.67f, 63.92f, 42f)
                curveToRelative(14.65f, 20.67f, 24.64f, 46.67f, 29.96f, 78f)
                curveToRelative(4.67f, 28.67f, 4.32f, 57.33f, -1f, 86f)
                curveToRelative(-7.99f, 47.33f, -23.97f, 87f, -47.94f, 119f)
                curveToRelative(-28.64f, 38.67f, -64.59f, 58f, -107.87f, 58f)
                curveToRelative(-10.66f, 0f, -22.3f, -3.33f, -34.96f, -10f)
                curveToRelative(-8.66f, -5.33f, -18.31f, -8f, -28.97f, -8f)
                reflectiveCurveToRelative(-20.3f, 2.67f, -28.97f, 8f)
                curveToRelative(-12.66f, 6.67f, -24.3f, 10f, -34.96f, 10f)
                curveToRelative(-43.28f, 0f, -79.23f, -19.33f, -107.87f, -58f)
                curveToRelative(-23.97f, -32f, -39.95f, -71.67f, -47.94f, -119f)
                curveToRelative(-5.32f, -28.67f, -5.67f, -57.33f, -1f, -86f)
                curveToRelative(5.32f, -31.33f, 15.31f, -57.33f, 29.96f, -78f)
                curveToRelative(16.65f, -23.33f, 37.95f, -37.33f, 63.92f, -42f)
                curveToRelative(15.98f, -2.67f, 37.95f, -0.33f, 65.92f, 7f)
                curveToRelative(23.97f, 6.67f, 44.28f, 14.67f, 60.93f, 24f)
                curveToRelative(16.65f, -9.33f, 36.96f, -17.33f, 60.93f, -24f)
                curveToRelative(27.98f, -7.33f, 49.96f, -9.67f, 65.94f, -7f)
                close()
                moveToRelative(-54.94f, -41f)
                curveToRelative(-9.32f, 8.67f, -21.65f, 15f, -36.96f, 19f)
                curveToRelative(-10.66f, 3.33f, -22.3f, 5f, -34.96f, 5f)
                lineToRelative(-14.98f, -1f)
                curveToRelative(-1.33f, -9.33f, -1.33f, -20f, 0f, -32f)
                curveToRelative(2.67f, -24f, 10.32f, -42.33f, 22.97f, -55f)
                curveToRelative(9.32f, -8.67f, 21.65f, -15f, 36.96f, -19f)
                curveToRelative(10.66f, -3.33f, 22.3f, -5f, 34.96f, -5f)
                lineToRelative(14.98f, 1f)
                lineToRelative(1f, 15f)
                curveToRelative(0f, 12.67f, -1.67f, 24.33f, -4.99f, 35f)
                curveToRelative(-3.99f, 15.33f, -10.31f, 27.67f, -18.98f, 37f)
                close()
            }
        }.build()
        
        return _AppleAlt!!
    }

private var _AppleAlt: ImageVector? = null

