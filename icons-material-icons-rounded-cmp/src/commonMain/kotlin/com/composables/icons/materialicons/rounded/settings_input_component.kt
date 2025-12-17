package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_input_component: ImageVector
    get() {
        if (_Settings_input_component != null) return _Settings_input_component!!
        
        _Settings_input_component = ImageVector.Builder(
            name = "settings_input_component",
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
                    moveTo(5f, 2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveTo(3f, 1.45f, 3f, 2f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(2f)
                    curveTo(1.45f, 6f, 1f, 6.45f, 1f, 7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(5f)
                    verticalLineTo(2f)
                    close()
                    moveTo(9f, 16f)
                    curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                    verticalLineTo(22f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3.18f)
                    curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9f)
                    verticalLineTo(16f)
                    close()
                    moveTo(1f, 16f)
                    curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                    verticalLineTo(22f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3.18f)
                    curveTo(6.16f, 18.4f, 7f, 17.3f, 7f, 16f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(1f)
                    verticalLineTo(16f)
                    close()
                    moveTo(21f, 6f)
                    verticalLineTo(2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(13f, 2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-1f)
                    curveTo(9.45f, 6f, 9f, 6.45f, 9f, 7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(2f)
                    close()
                    moveTo(17f, 16f)
                    curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                    verticalLineTo(22f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3.18f)
                    curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-6f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Settings_input_component!!
    }

private var _Settings_input_component: ImageVector? = null

