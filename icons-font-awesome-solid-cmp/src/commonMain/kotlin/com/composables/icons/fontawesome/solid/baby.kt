package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Baby: ImageVector
    get() {
        if (_Baby != null) return _Baby!!
        
        _Baby = ImageVector.Builder(
            name = "baby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 160f)
                curveToRelative(44.2f, 0f, 80f, -35.8f, 80f, -80f)
                reflectiveCurveTo(236.2f, 0f, 192f, 0f)
                reflectiveCurveToRelative(-80f, 35.8f, -80f, 80f)
                reflectiveCurveToRelative(35.8f, 80f, 80f, 80f)
                close()
                moveToRelative(-53.4f, 248.8f)
                lineToRelative(25.6f, -32f)
                lineToRelative(-61.5f, -51.2f)
                lineTo(56.8f, 383f)
                curveToRelative(-11.4f, 14.2f, -11.7f, 34.4f, -0.8f, 49f)
                lineToRelative(48f, 64f)
                curveToRelative(7.9f, 10.5f, 19.9f, 16f, 32f, 16f)
                curveToRelative(8.3f, 0f, 16.8f, -2.6f, 24f, -8f)
                curveToRelative(17.7f, -13.2f, 21.2f, -38.3f, 8f, -56f)
                lineToRelative(-29.4f, -39.2f)
                close()
                moveToRelative(142.7f, -83.2f)
                lineToRelative(-61.5f, 51.2f)
                lineToRelative(25.6f, 32f)
                lineTo(216f, 448f)
                curveToRelative(-13.2f, 17.7f, -9.7f, 42.8f, 8f, 56f)
                curveToRelative(7.2f, 5.4f, 15.6f, 8f, 24f, 8f)
                curveToRelative(12.2f, 0f, 24.2f, -5.5f, 32f, -16f)
                lineToRelative(48f, -64f)
                curveToRelative(10.9f, -14.6f, 10.6f, -34.8f, -0.8f, -49f)
                lineToRelative(-45.9f, -57.4f)
                close()
                moveTo(376.7f, 145f)
                curveToRelative(-12.7f, -18.1f, -37.6f, -22.4f, -55.7f, -9.8f)
                lineToRelative(-40.6f, 28.5f)
                curveToRelative(-52.7f, 37f, -124.2f, 37f, -176.8f, 0f)
                lineTo(63f, 135.3f)
                curveTo(44.9f, 122.6f, 20f, 127f, 7.3f, 145f)
                curveTo(-5.4f, 163.1f, -1f, 188f, 17f, 200.7f)
                lineToRelative(40.6f, 28.5f)
                curveToRelative(17f, 11.9f, 35.4f, 20.9f, 54.4f, 27.9f)
                verticalLineTo(288f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-30.8f)
                curveToRelative(19f, -7f, 37.4f, -16f, 54.4f, -27.9f)
                lineToRelative(40.6f, -28.5f)
                curveToRelative(18.1f, -12.8f, 22.4f, -37.7f, 9.7f, -55.8f)
                close()
            }
        }.build()
        
        return _Baby!!
    }

private var _Baby: ImageVector? = null

