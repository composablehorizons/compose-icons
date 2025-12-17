package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Drive_folder_upload: ImageVector
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
                    moveTo(20f, 6f)
                    horizontalLineToRelative(-8f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                    close()
                    moveTo(20f, 18f)
                    lineTo(4f, 18f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(5.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(20f)
                    verticalLineTo(18f)
                    close()
                    moveTo(9.41f, 14.42f)
                    lineTo(11f, 12.84f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4.16f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(16f, 13.01f)
                    lineTo(12.01f, 9f)
                    lineTo(8f, 13.01f)
                    lineTo(9.41f, 14.42f)
                    close()
                }
            }
        }.build()
        
        return _Drive_folder_upload!!
    }

private var _Drive_folder_upload: ImageVector? = null

