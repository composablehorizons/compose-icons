package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SolarPanel: ImageVector
    get() {
        if (_SolarPanel != null) return _SolarPanel!!
        
        _SolarPanel = ImageVector.Builder(
            name = "solar-panel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(431.98f, 448.01f)
                lineToRelative(-47.97f, 0.05f)
                verticalLineTo(416f)
                horizontalLineToRelative(-128f)
                verticalLineToRelative(32.21f)
                lineToRelative(-47.98f, 0.05f)
                curveToRelative(-8.82f, 0.01f, -15.97f, 7.16f, -15.98f, 15.99f)
                lineToRelative(-0.05f, 31.73f)
                curveToRelative(-0.01f, 8.85f, 7.17f, 16.03f, 16.02f, 16.02f)
                lineToRelative(223.96f, -0.26f)
                curveToRelative(8.82f, -0.01f, 15.97f, -7.16f, 15.98f, -15.98f)
                lineToRelative(0.04f, -31.73f)
                curveToRelative(0.01f, -8.85f, -7.17f, -16.03f, -16.02f, -16.02f)
                close()
                moveTo(585.2f, 26.74f)
                curveTo(582.58f, 11.31f, 568.99f, 0f, 553.06f, 0f)
                horizontalLineTo(86.93f)
                curveTo(71f, 0f, 57.41f, 11.31f, 54.79f, 26.74f)
                curveTo(-3.32f, 369.16f, 0.04f, 348.08f, 0.03f, 352f)
                curveToRelative(-0.03f, 17.32f, 14.29f, 32f, 32.6f, 32f)
                horizontalLineToRelative(574.74f)
                curveToRelative(18.23f, 0f, 32.51f, -14.56f, 32.59f, -31.79f)
                curveToRelative(0.02f, -4.08f, 3.35f, 16.95f, -54.76f, -325.47f)
                close()
                moveTo(259.83f, 64f)
                horizontalLineToRelative(120.33f)
                lineToRelative(9.77f, 96f)
                horizontalLineTo(250.06f)
                lineToRelative(9.77f, -96f)
                close()
                moveToRelative(-75.17f, 256f)
                horizontalLineTo(71.09f)
                lineTo(90.1f, 208f)
                horizontalLineToRelative(105.97f)
                lineToRelative(-11.41f, 112f)
                close()
                moveToRelative(16.29f, -160f)
                horizontalLineTo(98.24f)
                lineToRelative(16.29f, -96f)
                horizontalLineToRelative(96.19f)
                lineToRelative(-9.77f, 96f)
                close()
                moveToRelative(32.82f, 160f)
                lineToRelative(11.4f, -112f)
                horizontalLineToRelative(149.65f)
                lineToRelative(11.4f, 112f)
                horizontalLineTo(233.77f)
                close()
                moveToRelative(195.5f, -256f)
                horizontalLineToRelative(96.19f)
                lineToRelative(16.29f, 96f)
                horizontalLineTo(439.04f)
                lineToRelative(-9.77f, -96f)
                close()
                moveToRelative(26.06f, 256f)
                lineToRelative(-11.4f, -112f)
                horizontalLineTo(549.9f)
                lineToRelative(19.01f, 112f)
                horizontalLineTo(455.33f)
                close()
            }
        }.build()
        
        return _SolarPanel!!
    }

private var _SolarPanel: ImageVector? = null

