package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Settings_input_component: ImageVector
    get() {
        if (_Settings_input_component != null) return _Settings_input_component!!
        
        _Settings_input_component = ImageVector.Builder(
            name = "settings_input_component",
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
                moveTo(5f, 2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                close()
                moveToRelative(4f, 16.82f)
                horizontalLineToRelative(2f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineToRelative(4.82f)
                close()
                moveToRelative(-8f, 0f)
                horizontalLineToRelative(2f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                horizontalLineTo(1f)
                verticalLineToRelative(4.82f)
                close()
                moveTo(21f, 6f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-8f, -4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                close()
                moveToRelative(4f, 16.82f)
                horizontalLineToRelative(2f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4.82f)
                close()
            }
        }.build()
        
        return _Settings_input_component!!
    }

private var _Settings_input_component: ImageVector? = null

