package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.File_open: ImageVector
    get() {
        if (_File_open != null) return _File_open!!
        
        _File_open = ImageVector.Builder(
            name = "file_open",
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
                    moveTo(13.17f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(-6f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(8.83f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineToRelative(-4.83f, -4.83f)
                    curveTo(14.21f, 2.21f, 13.7f, 2f, 13.17f, 2f)
                    close()
                    moveTo(13f, 8f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(14f)
                    curveTo(13.45f, 9f, 13f, 8.55f, 13f, 8f)
                    close()
                    moveTo(22.66f, 17f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-1.24f)
                    lineToRelative(2.24f, 2.24f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineTo(19f, 19.41f)
                    lineToRelative(0f, 1.24f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(17f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3.66f)
                    curveTo(22.21f, 16f, 22.66f, 16.45f, 22.66f, 17f)
                    close()
                }
            }
        }.build()
        
        return _File_open!!
    }

private var _File_open: ImageVector? = null

