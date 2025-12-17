package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_input_hdmi: ImageVector
    get() {
        if (_Settings_input_hdmi != null) return _Settings_input_hdmi!!
        
        _Settings_input_hdmi = ImageVector.Builder(
            name = "settings_input_hdmi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 7f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                    verticalLineToRelative(3f)
                    curveTo(5.45f, 7f, 5f, 7.45f, 5f, 8f)
                    verticalLineToRelative(4.7f)
                    curveToRelative(0f, 0.2f, 0.06f, 0.39f, 0.17f, 0.55f)
                    lineTo(8f, 19f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-2f)
                    lineToRelative(2.83f, -5.75f)
                    curveTo(18.94f, 13.09f, 19f, 12.89f, 19f, 12.7f)
                    verticalLineTo(8f)
                    curveTo(19f, 7.45f, 18.55f, 7f, 18f, 7f)
                    close()
                    moveTo(16f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(5.5f)
                    curveTo(14f, 5.22f, 13.78f, 5f, 13.5f, 5f)
                    reflectiveCurveTo(13f, 5.22f, 13f, 5.5f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(5.5f)
                    curveTo(11f, 5.22f, 10.78f, 5f, 10.5f, 5f)
                    reflectiveCurveTo(10f, 5.22f, 10f, 5.5f)
                    verticalLineTo(7f)
                    horizontalLineTo(8f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Settings_input_hdmi!!
    }

private var _Settings_input_hdmi: ImageVector? = null

