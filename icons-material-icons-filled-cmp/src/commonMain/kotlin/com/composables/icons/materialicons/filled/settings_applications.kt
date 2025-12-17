package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Settings_applications: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(7f, -7f)
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
                curveToRelative(0f, 0.23f, -0.02f, 0.46f, -0.05f, 0.68f)
                lineToRelative(1.48f, 1.16f)
                curveToRelative(0.13f, 0.11f, 0.17f, 0.3f, 0.08f, 0.45f)
                lineToRelative(-1.4f, 2.42f)
                curveToRelative(-0.09f, 0.15f, -0.27f, 0.21f, -0.43f, 0.15f)
                lineToRelative(-1.74f, -0.7f)
                curveToRelative(-0.36f, 0.28f, -0.76f, 0.51f, -1.18f, 0.69f)
                lineToRelative(-0.26f, 1.85f)
                curveToRelative(-0.03f, 0.17f, -0.18f, 0.3f, -0.35f, 0.3f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.17f, 0f, -0.32f, -0.13f, -0.35f, -0.29f)
                lineToRelative(-0.26f, -1.85f)
                curveToRelative(-0.43f, -0.18f, -0.82f, -0.41f, -1.18f, -0.69f)
                lineToRelative(-1.74f, 0.7f)
                curveToRelative(-0.16f, 0.06f, -0.34f, 0f, -0.43f, -0.15f)
                lineToRelative(-1.4f, -2.42f)
                curveToRelative(-0.09f, -0.15f, -0.05f, -0.34f, 0.08f, -0.45f)
                lineToRelative(1.48f, -1.16f)
                curveToRelative(-0.03f, -0.23f, -0.05f, -0.46f, -0.05f, -0.69f)
                curveToRelative(0f, -0.23f, 0.02f, -0.46f, 0.05f, -0.68f)
                lineToRelative(-1.48f, -1.16f)
                curveToRelative(-0.13f, -0.11f, -0.17f, -0.3f, -0.08f, -0.45f)
                lineToRelative(1.4f, -2.42f)
                curveToRelative(0.09f, -0.15f, 0.27f, -0.21f, 0.43f, -0.15f)
                lineToRelative(1.74f, 0.7f)
                curveToRelative(0.36f, -0.28f, 0.76f, -0.51f, 1.18f, -0.69f)
                lineToRelative(0.26f, -1.85f)
                curveToRelative(0.03f, -0.17f, 0.18f, -0.3f, 0.35f, -0.3f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.17f, 0f, 0.32f, 0.13f, 0.35f, 0.29f)
                lineToRelative(0.26f, 1.85f)
                curveToRelative(0.43f, 0.18f, 0.82f, 0.41f, 1.18f, 0.69f)
                lineToRelative(1.74f, -0.7f)
                curveToRelative(0.16f, -0.06f, 0.34f, 0f, 0.43f, 0.15f)
                lineToRelative(1.4f, 2.42f)
                curveToRelative(0.09f, 0.15f, 0.05f, 0.34f, -0.08f, 0.45f)
                lineToRelative(-1.48f, 1.16f)
                curveToRelative(0.03f, 0.23f, 0.05f, 0.46f, 0.05f, 0.69f)
                close()
            }
        }.build()
        
        return _Settings_applications!!
    }

private var _Settings_applications: ImageVector? = null

