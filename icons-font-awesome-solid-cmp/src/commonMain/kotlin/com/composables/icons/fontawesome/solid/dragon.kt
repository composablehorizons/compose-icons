package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dragon: ImageVector
    get() {
        if (_Dragon != null) return _Dragon!!
        
        _Dragon = ImageVector.Builder(
            name = "dragon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.32f, 255.78f)
                lineTo(192f, 223.96f)
                lineToRelative(-91.28f, 68.69f)
                curveToRelative(-10.08f, 10.08f, -2.94f, 27.31f, 11.31f, 27.31f)
                horizontalLineToRelative(222.7f)
                curveToRelative(-9.44f, -26.4f, -14.73f, -54.47f, -14.73f, -83.38f)
                verticalLineToRelative(-42.27f)
                lineToRelative(-119.73f, -87.6f)
                curveToRelative(-23.82f, -15.88f, -55.29f, -14.01f, -77.06f, 4.59f)
                lineTo(5.81f, 227.64f)
                curveToRelative(-12.38f, 10.33f, -3.45f, 30.42f, 12.51f, 28.14f)
                close()
                moveToRelative(556.87f, 34.1f)
                lineToRelative(-100.66f, -50.31f)
                arcTo(47.992f, 47.992f, 0f, false, true, 448f, 196.65f)
                verticalLineToRelative(-36.69f)
                horizontalLineToRelative(64f)
                lineToRelative(28.09f, 22.63f)
                curveToRelative(6f, 6f, 14.14f, 9.37f, 22.63f, 9.37f)
                horizontalLineToRelative(30.97f)
                arcToRelative(32f, 32f, 0f, false, false, 28.62f, -17.69f)
                lineToRelative(14.31f, -28.62f)
                arcToRelative(32.005f, 32.005f, 0f, false, false, -3.02f, -33.51f)
                lineToRelative(-74.53f, -99.38f)
                curveTo(553.02f, 4.7f, 543.54f, 0f, 533.47f, 0f)
                horizontalLineTo(296.02f)
                curveToRelative(-7.13f, 0f, -10.7f, 8.57f, -5.66f, 13.61f)
                lineTo(352f, 63.96f)
                lineTo(292.42f, 88.8f)
                curveToRelative(-5.9f, 2.95f, -5.9f, 11.36f, 0f, 14.31f)
                lineTo(352f, 127.96f)
                verticalLineToRelative(108.62f)
                curveToRelative(0f, 72.08f, 36.03f, 139.39f, 96f, 179.38f)
                curveToRelative(-195.59f, 6.81f, -344.56f, 41.01f, -434.1f, 60.91f)
                curveTo(5.78f, 478.67f, 0f, 485.88f, 0f, 494.2f)
                curveTo(0f, 504f, 7.95f, 512f, 17.76f, 512f)
                horizontalLineToRelative(499.08f)
                curveToRelative(63.29f, 0.01f, 119.61f, -47.56f, 122.99f, -110.76f)
                curveToRelative(2.52f, -47.28f, -22.73f, -90.4f, -64.64f, -111.36f)
                close()
                moveTo(489.18f, 66.25f)
                lineToRelative(45.65f, 11.41f)
                curveToRelative(-2.75f, 10.91f, -12.47f, 18.89f, -24.13f, 18.26f)
                curveToRelative(-12.96f, -0.71f, -25.85f, -12.53f, -21.52f, -29.67f)
                close()
            }
        }.build()
        
        return _Dragon!!
    }

private var _Dragon: ImageVector? = null

