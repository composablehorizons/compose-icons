package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.File_download: ImageVector
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
                    moveTo(18f, 15f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(18f)
                    close()
                    moveTo(17f, 11f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(13f, 12.17f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(8.17f)
                    lineTo(8.41f, 9.59f)
                    lineTo(7f, 11f)
                    lineToRelative(5f, 5f)
                    lineTo(17f, 11f)
                    close()
                }
            }
        }.build()
        
        return _File_download!!
    }

private var _File_download: ImageVector? = null

