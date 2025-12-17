package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HouseDamage: ImageVector
    get() {
        if (_HouseDamage != null) return _HouseDamage!!
        
        _HouseDamage = ImageVector.Builder(
            name = "house-damage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 114.96f)
                lineTo(69.47f, 307.71f)
                curveToRelative(-1.62f, 1.46f, -3.69f, 2.14f, -5.47f, 3.35f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(149.23f)
                lineTo(192f, 439.19f)
                lineToRelative(104.11f, -64f)
                lineToRelative(-60.16f, -119.22f)
                lineTo(384f, 392.75f)
                lineToRelative(-104.11f, 64f)
                lineTo(319.81f, 512f)
                horizontalLineTo(496f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(311.1f)
                curveToRelative(-1.7f, -1.16f, -3.72f, -1.82f, -5.26f, -3.2f)
                lineTo(288f, 114.96f)
                close()
                moveToRelative(282.69f, 121.32f)
                lineTo(512f, 184.45f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(51.69f)
                lineTo(314.75f, 10.31f)
                curveTo(307.12f, 3.45f, 297.56f, 0.01f, 288f, 0f)
                reflectiveCurveToRelative(-19.1f, 3.41f, -26.7f, 10.27f)
                lineTo(5.31f, 236.28f)
                curveToRelative(-6.57f, 5.91f, -7.12f, 16.02f, -1.21f, 22.6f)
                lineToRelative(21.4f, 23.82f)
                curveToRelative(5.9f, 6.57f, 16.02f, 7.12f, 22.6f, 1.21f)
                lineTo(277.42f, 81.63f)
                curveToRelative(6.05f, -5.33f, 15.12f, -5.33f, 21.17f, 0f)
                lineTo(527.91f, 283.9f)
                curveToRelative(6.57f, 5.9f, 16.69f, 5.36f, 22.6f, -1.21f)
                lineToRelative(21.4f, -23.82f)
                curveToRelative(5.9f, -6.57f, 5.36f, -16.69f, -1.22f, -22.59f)
                close()
            }
        }.build()
        
        return _HouseDamage!!
    }

private var _HouseDamage: ImageVector? = null

