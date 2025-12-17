package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.File_upload: ImageVector
    get() {
        if (_File_upload != null) return _File_upload!!
        
        _File_upload = ImageVector.Builder(
            name = "file_upload",
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
                    moveTo(7f, 9f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(11f, 7.83f)
                    verticalLineTo(16f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7.83f)
                    lineToRelative(2.59f, 2.58f)
                    lineTo(17f, 9f)
                    lineToRelative(-5f, -5f)
                    lineTo(7f, 9f)
                    close()
                }
            }
        }.build()
        
        return _File_upload!!
    }

private var _File_upload: ImageVector? = null

