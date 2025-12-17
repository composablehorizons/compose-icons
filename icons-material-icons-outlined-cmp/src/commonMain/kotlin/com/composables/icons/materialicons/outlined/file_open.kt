package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.File_open: ImageVector
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
                    moveTo(15f, 22f)
                    horizontalLineTo(6f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(8f)
                    lineToRelative(6f, 6f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(4f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(22f)
                    close()
                    moveTo(19f, 21.66f)
                    lineToRelative(0f, -2.24f)
                    lineToRelative(2.95f, 2.95f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(20.41f, 18f)
                    horizontalLineToRelative(2.24f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(5.66f)
                    horizontalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _File_open!!
    }

private var _File_open: ImageVector? = null

