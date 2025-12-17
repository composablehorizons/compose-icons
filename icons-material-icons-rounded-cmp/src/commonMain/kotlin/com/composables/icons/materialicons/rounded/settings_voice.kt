package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_voice: ImageVector
    get() {
        if (_Settings_voice != null) return _Settings_voice!!
        
        _Settings_voice = ImageVector.Builder(
            name = "settings_voice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 24f)
                lineTo(8f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveTo(7f, 23.55f, 7.45f, 24f, 8f, 24f)
                close()
                moveTo(12f, 24f)
                lineTo(12f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveTo(11f, 23.55f, 11.45f, 24f, 12f, 24f)
                close()
                moveTo(16f, 24f)
                lineTo(16f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveTo(15f, 23.55f, 15.45f, 24f, 16f, 24f)
                close()
                moveTo(9f, 10f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveTo(9f, 11.66f, 9f, 10f)
                close()
                moveTo(17.91f, 10f)
                curveToRelative(0.61f, 0f, 1.09f, 0.54f, 1f, 1.14f)
                curveToRelative(-0.49f, 3f, -2.89f, 5.34f, -5.91f, 5.78f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.08f)
                curveToRelative(-3.02f, -0.44f, -5.42f, -2.78f, -5.91f, -5.78f)
                curveToRelative(-0.1f, -0.6f, 0.39f, -1.14f, 1f, -1.14f)
                horizontalLineToRelative(0f)
                curveToRelative(0.49f, 0f, 0.9f, 0.36f, 0.98f, 0.85f)
                curveTo(7.48f, 13.21f, 9.53f, 15f, 12f, 15f)
                reflectiveCurveToRelative(4.52f, -1.79f, 4.93f, -4.15f)
                curveTo(17.01f, 10.36f, 17.42f, 10f, 17.91f, 10f)
                lineTo(17.91f, 10f)
                close()
            }
        }.build()
        
        return _Settings_voice!!
    }

private var _Settings_voice: ImageVector? = null

