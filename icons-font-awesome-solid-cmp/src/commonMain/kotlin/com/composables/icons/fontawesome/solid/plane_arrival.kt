package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PlaneArrival: ImageVector
    get() {
        if (_PlaneArrival != null) return _PlaneArrival!!
        
        _PlaneArrival = ImageVector.Builder(
            name = "plane-arrival",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(44.81f, 205.66f)
                lineToRelative(88.74f, 80f)
                arcToRelative(62.607f, 62.607f, 0f, false, false, 25.47f, 13.93f)
                lineToRelative(287.6f, 78.35f)
                curveToRelative(26.48f, 7.21f, 54.56f, 8.72f, 81f, 1.36f)
                curveToRelative(29.67f, -8.27f, 43.44f, -21.21f, 47.25f, -35.71f)
                curveToRelative(3.83f, -14.5f, -1.73f, -32.71f, -23.37f, -54.96f)
                curveToRelative(-19.28f, -19.82f, -44.35f, -32.79f, -70.83f, -40f)
                lineToRelative(-97.51f, -26.56f)
                lineTo(282.8f, 30.22f)
                curveToRelative(-1.51f, -5.81f, -5.95f, -10.35f, -11.66f, -11.91f)
                lineTo(206.05f, 0.58f)
                curveToRelative(-10.56f, -2.88f, -20.9f, 5.32f, -20.71f, 16.44f)
                lineToRelative(47.92f, 164.21f)
                lineToRelative(-102.2f, -27.84f)
                lineToRelative(-27.59f, -67.88f)
                curveToRelative(-1.93f, -4.89f, -6.01f, -8.57f, -11.02f, -9.93f)
                lineTo(52.72f, 64.75f)
                curveToRelative(-10.34f, -2.82f, -20.53f, 5f, -20.72f, 15.88f)
                lineToRelative(0.23f, 101.78f)
                curveToRelative(0.19f, 8.91f, 6.03f, 17.34f, 12.58f, 23.25f)
                close()
            }
        }.build()
        
        return _PlaneArrival!!
    }

private var _PlaneArrival: ImageVector? = null

