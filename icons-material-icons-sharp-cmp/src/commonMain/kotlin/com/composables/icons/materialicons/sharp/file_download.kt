package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.File_download: ImageVector
    get() {
        if (_File_download != null) return _File_download!!
        
        _File_download = ImageVector.Builder(
            name = "file_download",
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
                    moveTo(19f, 9f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(3f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(5f)
                    lineToRelative(7f, 7f)
                    lineTo(19f, 9f)
                    close()
                    moveTo(5f, 18f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(5f)
                    close()
                }
            }
        }.build()
        
        return _File_download!!
    }

private var _File_download: ImageVector? = null

