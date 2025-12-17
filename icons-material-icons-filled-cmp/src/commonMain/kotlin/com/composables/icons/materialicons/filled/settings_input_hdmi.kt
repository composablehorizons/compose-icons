package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Settings_input_hdmi: ImageVector
    get() {
        if (_Settings_input_hdmi != null) return _Settings_input_hdmi!!
        
        _Settings_input_hdmi = ImageVector.Builder(
            name = "settings_input_hdmi",
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
                moveTo(18f, 7f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                lineToRelative(3f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -6f)
                verticalLineTo(7f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Settings_input_hdmi!!
    }

private var _Settings_input_hdmi: ImageVector? = null

