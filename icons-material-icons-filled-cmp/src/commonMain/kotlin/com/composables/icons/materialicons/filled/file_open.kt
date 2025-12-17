package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.File_open: ImageVector
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
                    moveTo(14f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(13f, 9f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(17f, 21.66f)
                    verticalLineTo(16f)
                    horizontalLineToRelative(5.66f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2.24f)
                    lineToRelative(2.95f, 2.95f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(19f, 19.41f)
                    lineToRelative(0f, 2.24f)
                    horizontalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _File_open!!
    }

private var _File_open: ImageVector? = null

