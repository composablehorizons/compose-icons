package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Drive_folder_upload: ImageVector
    get() {
        if (_Drive_folder_upload != null) return _Drive_folder_upload!!
        
        _Drive_folder_upload = ImageVector.Builder(
            name = "drive_folder_upload",
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
                    moveTo(22f, 6f)
                    horizontalLineTo(12f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(6f)
                    close()
                    moveTo(13f, 13f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(8f)
                    lineToRelative(4.01f, -4f)
                    lineTo(16f, 13f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Drive_folder_upload!!
    }

private var _Drive_folder_upload: ImageVector? = null

