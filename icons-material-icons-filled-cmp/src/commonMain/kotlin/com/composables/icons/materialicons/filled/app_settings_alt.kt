package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.App_settings_alt: ImageVector
    get() {
        if (_App_settings_alt != null) return _App_settings_alt!!
        
        _App_settings_alt = ImageVector.Builder(
            name = "app_settings_alt",
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
                moveTo(21.81f, 12.74f)
                lineToRelative(-0.82f, -0.63f)
                verticalLineToRelative(-0.22f)
                lineToRelative(0.8f, -0.63f)
                curveToRelative(0.16f, -0.12f, 0.2f, -0.34f, 0.1f, -0.51f)
                lineToRelative(-0.85f, -1.48f)
                curveToRelative(-0.07f, -0.13f, -0.21f, -0.2f, -0.35f, -0.2f)
                curveToRelative(-0.05f, 0f, -0.1f, 0.01f, -0.15f, 0.03f)
                lineToRelative(-0.95f, 0.38f)
                curveToRelative(-0.08f, -0.05f, -0.11f, -0.07f, -0.19f, -0.11f)
                lineToRelative(-0.15f, -1.01f)
                curveToRelative(-0.03f, -0.21f, -0.2f, -0.36f, -0.4f, -0.36f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-0.2f, 0f, -0.37f, 0.15f, -0.4f, 0.34f)
                lineToRelative(-0.14f, 1.01f)
                curveToRelative(-0.03f, 0.02f, -0.07f, 0.03f, -0.1f, 0.05f)
                lineToRelative(-0.09f, 0.06f)
                lineToRelative(-0.95f, -0.38f)
                curveToRelative(-0.05f, -0.02f, -0.1f, -0.03f, -0.15f, -0.03f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.07f, -0.35f, 0.2f)
                lineToRelative(-0.85f, 1.48f)
                curveToRelative(-0.1f, 0.17f, -0.06f, 0.39f, 0.1f, 0.51f)
                lineToRelative(0.8f, 0.63f)
                verticalLineToRelative(0.23f)
                lineToRelative(-0.8f, 0.63f)
                curveToRelative(-0.16f, 0.12f, -0.2f, 0.34f, -0.1f, 0.51f)
                lineToRelative(0.85f, 1.48f)
                curveToRelative(0.07f, 0.13f, 0.21f, 0.2f, 0.35f, 0.2f)
                curveToRelative(0.05f, 0f, 0.1f, -0.01f, 0.15f, -0.03f)
                lineToRelative(0.95f, -0.37f)
                curveToRelative(0.08f, 0.05f, 0.12f, 0.07f, 0.2f, 0.11f)
                lineToRelative(0.15f, 1.01f)
                curveToRelative(0.03f, 0.2f, 0.2f, 0.34f, 0.4f, 0.34f)
                horizontalLineToRelative(1.71f)
                curveToRelative(0.2f, 0f, 0.37f, -0.15f, 0.4f, -0.34f)
                lineToRelative(0.15f, -1.01f)
                curveToRelative(0.03f, -0.02f, 0.07f, -0.03f, 0.1f, -0.05f)
                lineToRelative(0.09f, -0.06f)
                lineToRelative(0.95f, 0.38f)
                curveToRelative(0.05f, 0.02f, 0.1f, 0.03f, 0.15f, 0.03f)
                curveToRelative(0.14f, 0f, 0.27f, -0.07f, 0.35f, -0.2f)
                lineToRelative(0.85f, -1.48f)
                curveToRelative(0.1f, -0.17f, 0.06f, -0.39f, -0.1f, -0.51f)
                close()
                moveTo(18f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _App_settings_alt!!
    }

private var _App_settings_alt: ImageVector? = null

