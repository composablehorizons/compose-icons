package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Drive_folder_upload: ImageVector
    get() {
        if (_Drive_folder_upload != null) return _Drive_folder_upload!!
        
        _Drive_folder_upload = ImageVector.Builder(
            name = "drive_folder_upload",
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
                moveTo(20f, 6f)
                horizontalLineToRelative(-8f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(10f)
                close()
                moveTo(8f, 13.01f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11f, 12.84f)
                verticalLineTo(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.16f)
                lineToRelative(1.59f, 1.59f)
                lineTo(16f, 13.01f)
                lineTo(12.01f, 9f)
                lineTo(8f, 13.01f)
                close()
            }
        }.build()
        
        return _Drive_folder_upload!!
    }

private var _Drive_folder_upload: ImageVector? = null

