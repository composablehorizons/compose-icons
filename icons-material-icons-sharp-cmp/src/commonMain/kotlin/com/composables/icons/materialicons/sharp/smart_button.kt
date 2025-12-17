package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Smart_button: ImageVector
    get() {
        if (_Smart_button != null) return _Smart_button!!
        
        _Smart_button = ImageVector.Builder(
            name = "smart_button",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 17f)
                    horizontalLineToRelative(-3f)
                    lineToRelative(0f, -2f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(9f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(17f)
                    close()
                    moveTo(14.5f, 19f)
                    lineToRelative(1.09f, -2.41f)
                    lineTo(18f, 15.5f)
                    lineToRelative(-2.41f, -1.09f)
                    lineTo(14.5f, 12f)
                    lineToRelative(-1.09f, 2.41f)
                    lineTo(11f, 15.5f)
                    lineToRelative(2.41f, 1.09f)
                    lineTo(14.5f, 19f)
                    close()
                    moveTo(17f, 14f)
                    lineToRelative(0.62f, -1.38f)
                    lineTo(19f, 12f)
                    lineToRelative(-1.38f, -0.62f)
                    lineTo(17f, 10f)
                    lineToRelative(-0.62f, 1.38f)
                    lineTo(15f, 12f)
                    lineToRelative(1.38f, 0.62f)
                    lineTo(17f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Smart_button!!
    }

private var _Smart_button: ImageVector? = null

