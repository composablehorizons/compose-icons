package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Road: ImageVector
    get() {
        if (_Road != null) return _Road!!
        
        _Road = ImageVector.Builder(
            name = "road",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(573.19f, 402.67f)
                lineToRelative(-139.79f, -320f)
                curveTo(428.43f, 71.29f, 417.6f, 64f, 405.68f, 64f)
                horizontalLineToRelative(-97.59f)
                lineToRelative(2.45f, 23.16f)
                curveToRelative(0.5f, 4.72f, -3.21f, 8.84f, -7.96f, 8.84f)
                horizontalLineToRelative(-29.16f)
                curveToRelative(-4.75f, 0f, -8.46f, -4.12f, -7.96f, -8.84f)
                lineTo(267.91f, 64f)
                horizontalLineToRelative(-97.59f)
                curveToRelative(-11.93f, 0f, -22.76f, 7.29f, -27.73f, 18.67f)
                lineTo(2.8f, 402.67f)
                curveTo(-6.45f, 423.86f, 8.31f, 448f, 30.54f, 448f)
                horizontalLineToRelative(196.84f)
                lineToRelative(10.31f, -97.68f)
                curveToRelative(0.86f, -8.14f, 7.72f, -14.32f, 15.91f, -14.32f)
                horizontalLineToRelative(68.8f)
                curveToRelative(8.19f, 0f, 15.05f, 6.18f, 15.91f, 14.32f)
                lineTo(348.62f, 448f)
                horizontalLineToRelative(196.84f)
                curveToRelative(22.23f, 0f, 36.99f, -24.14f, 27.73f, -45.33f)
                close()
                moveTo(260.4f, 135.16f)
                arcToRelative(8f, 8f, 0f, false, true, 7.96f, -7.16f)
                horizontalLineToRelative(39.29f)
                curveToRelative(4.09f, 0f, 7.53f, 3.09f, 7.96f, 7.16f)
                lineToRelative(4.6f, 43.58f)
                curveToRelative(0.75f, 7.09f, -4.81f, 13.26f, -11.93f, 13.26f)
                horizontalLineToRelative(-40.54f)
                curveToRelative(-7.13f, 0f, -12.68f, -6.17f, -11.93f, -13.26f)
                lineToRelative(4.59f, -43.58f)
                close()
                moveTo(315.64f, 304f)
                horizontalLineToRelative(-55.29f)
                curveToRelative(-9.5f, 0f, -16.91f, -8.23f, -15.91f, -17.68f)
                lineToRelative(5.07f, -48f)
                curveToRelative(0.86f, -8.14f, 7.72f, -14.32f, 15.91f, -14.32f)
                horizontalLineToRelative(45.15f)
                curveToRelative(8.19f, 0f, 15.05f, 6.18f, 15.91f, 14.32f)
                lineToRelative(5.07f, 48f)
                curveToRelative(1f, 9.45f, -6.41f, 17.68f, -15.91f, 17.68f)
                close()
            }
        }.build()
        
        return _Road!!
    }

private var _Road: ImageVector? = null

