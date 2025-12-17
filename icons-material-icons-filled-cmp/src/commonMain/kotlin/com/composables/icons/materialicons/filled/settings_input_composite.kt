package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Settings_input_composite: ImageVector
    get() {
        if (_Settings_input_composite != null) return _Settings_input_composite!!
        
        _Settings_input_composite = ImageVector.Builder(
            name = "settings_input_composite",
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
                moveToRelative(4f, 14f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-8f, 0f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                curveTo(6.16f, 18.4f, 7f, 17.3f, 7f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
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
                moveToRelative(4f, 14f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Settings_input_composite!!
    }

private var _Settings_input_composite: ImageVector? = null

