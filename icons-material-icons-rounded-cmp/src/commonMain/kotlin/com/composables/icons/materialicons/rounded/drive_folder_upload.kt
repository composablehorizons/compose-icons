package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Drive_folder_upload: ImageVector
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
                    lineToRelative(-1.41f, -1.41f)
                    curveTo(10.21f, 4.21f, 9.7f, 4f, 9.17f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                    close()
                    moveTo(13f, 13f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(9.21f)
                    curveToRelative(-0.45f, 0f, -0.67f, -0.54f, -0.35f, -0.85f)
                    lineToRelative(2.8f, -2.79f)
                    curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0f)
                    lineToRelative(2.79f, 2.79f)
                    curveTo(15.46f, 12.46f, 15.24f, 13f, 14.8f, 13f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Drive_folder_upload!!
    }

private var _Drive_folder_upload: ImageVector? = null

