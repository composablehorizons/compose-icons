package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Zoom_in_map: ImageVector
    get() {
        if (_Zoom_in_map != null) return _Zoom_in_map!!
        
        _Zoom_in_map = ImageVector.Builder(
            name = "zoom_in_map",
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
                    moveTo(9f, 9f)
                    lineToRelative(0f, -6f)
                    lineTo(7f, 3f)
                    lineToRelative(0f, 2.59f)
                    lineTo(3.91f, 2.5f)
                    lineTo(2.5f, 3.91f)
                    lineTo(5.59f, 7f)
                    lineTo(3f, 7f)
                    lineToRelative(0f, 2f)
                    lineTo(9f, 9f)
                    close()
                    moveTo(21f, 9f)
                    verticalLineTo(7f)
                    lineToRelative(-2.59f, 0f)
                    lineToRelative(3.09f, -3.09f)
                    lineTo(20.09f, 2.5f)
                    lineTo(17f, 5.59f)
                    verticalLineTo(3f)
                    lineToRelative(-2f, 0f)
                    lineToRelative(0f, 6f)
                    lineTo(21f, 9f)
                    close()
                    moveTo(3f, 15f)
                    lineToRelative(0f, 2f)
                    horizontalLineToRelative(2.59f)
                    lineTo(2.5f, 20.09f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(7f, 18.41f)
                    lineTo(7f, 21f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0f, -6f)
                    lineTo(3f, 15f)
                    close()
                    moveTo(15f, 15f)
                    lineToRelative(0f, 6f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2.59f)
                    lineToRelative(3.09f, 3.09f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(18.41f, 17f)
                    horizontalLineTo(21f)
                    verticalLineToRelative(-2f)
                    lineTo(15f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Zoom_in_map!!
    }

private var _Zoom_in_map: ImageVector? = null

