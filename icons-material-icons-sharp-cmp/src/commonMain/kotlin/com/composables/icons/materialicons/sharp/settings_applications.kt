package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Settings_applications: ImageVector
    get() {
        if (_Settings_applications != null) return _Settings_applications!!
        
        _Settings_applications = ImageVector.Builder(
            name = "settings_applications",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -2f, -2f)
                close()
                moveToRelative(-1.75f, 9f)
                curveToRelative(0f, 0.24f, -0.02f, 0.47f, -0.05f, 0.71f)
                lineToRelative(0.01f, -0.02f)
                lineToRelative(1.47f, 1.16f)
                curveToRelative(0.14f, 0.1f, 0.23f, 0.18f, 0.23f, 0.18f)
                lineToRelative(-1.7f, 2.94f)
                lineToRelative(-2.02f, -0.8f)
                lineToRelative(0.02f, -0.03f)
                curveToRelative(-0.37f, 0.29f, -0.77f, 0.53f, -1.21f, 0.71f)
                horizontalLineToRelative(0.01f)
                lineToRelative(-0.27f, 1.85f)
                curveToRelative(-0.02f, 0.17f, -0.04f, 0.3f, -0.04f, 0.3f)
                horizontalLineToRelative(-3.4f)
                lineToRelative(-0.31f, -2.15f)
                horizontalLineTo(10f)
                curveToRelative(-0.44f, -0.18f, -0.84f, -0.42f, -1.21f, -0.71f)
                lineToRelative(0.02f, 0.03f)
                lineToRelative(-2.02f, 0.8f)
                lineToRelative(-1.7f, -2.94f)
                reflectiveCurveToRelative(0.1f, -0.08f, 0.23f, -0.18f)
                lineToRelative(1.47f, -1.16f)
                lineToRelative(0.01f, 0.02f)
                curveToRelative(-0.03f, -0.24f, -0.05f, -0.47f, -0.05f, -0.71f)
                reflectiveCurveToRelative(0.02f, -0.47f, 0.05f, -0.69f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-1.7f, -1.34f)
                lineToRelative(1.7f, -2.95f)
                lineToRelative(2.01f, 0.81f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.37f, -0.28f, 0.77f, -0.52f, 1.2f, -0.7f)
                horizontalLineToRelative(-0.01f)
                lineTo(10.3f, 5f)
                horizontalLineToRelative(3.41f)
                lineToRelative(0.3f, 2.15f)
                horizontalLineTo(14f)
                curveToRelative(0.43f, 0.18f, 0.83f, 0.42f, 1.2f, 0.7f)
                verticalLineToRelative(-0.01f)
                lineToRelative(2.01f, -0.81f)
                lineToRelative(1.7f, 2.95f)
                lineToRelative(-1.71f, 1.34f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(0.04f, 0.22f, 0.06f, 0.45f, 0.06f, 0.69f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.45f, 12f)
                arcTo(2.45f, 2.45f, 0f, false, true, 12f, 14.45f)
                arcTo(2.45f, 2.45f, 0f, false, true, 9.55f, 12f)
                arcTo(2.45f, 2.45f, 0f, false, true, 14.45f, 12f)
                close()
            }
        }.build()
        
        return _Settings_applications!!
    }

private var _Settings_applications: ImageVector? = null

