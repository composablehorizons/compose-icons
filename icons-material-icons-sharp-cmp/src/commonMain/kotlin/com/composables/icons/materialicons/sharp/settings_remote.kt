package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Settings_remote: ImageVector
    get() {
        if (_Settings_remote != null) return _Settings_remote!!
        
        _Settings_remote = ImageVector.Builder(
            name = "settings_remote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 9f)
                horizontalLineTo(8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(8f)
                verticalLineTo(9f)
                close()
                moveToRelative(-4f, 6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(7.05f, 6.05f)
                lineToRelative(1.41f, 1.41f)
                curveTo(9.37f, 6.56f, 10.62f, 6f, 12f, 6f)
                reflectiveCurveToRelative(2.63f, 0.56f, 3.54f, 1.46f)
                lineToRelative(1.41f, -1.41f)
                curveTo(15.68f, 4.78f, 13.93f, 4f, 12f, 4f)
                reflectiveCurveToRelative(-3.68f, 0.78f, -4.95f, 2.05f)
                close()
                moveTo(12f, 0f)
                curveTo(8.96f, 0f, 6.21f, 1.23f, 4.22f, 3.22f)
                lineToRelative(1.41f, 1.41f)
                curveTo(7.26f, 3.01f, 9.51f, 2f, 12f, 2f)
                reflectiveCurveToRelative(4.74f, 1.01f, 6.36f, 2.64f)
                lineToRelative(1.41f, -1.41f)
                curveTo(17.79f, 1.23f, 15.04f, 0f, 12f, 0f)
                close()
            }
        }.build()
        
        return _Settings_remote!!
    }

private var _Settings_remote: ImageVector? = null

