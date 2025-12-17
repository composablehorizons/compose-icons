package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Upload_file: ImageVector
    get() {
        if (_Upload_file != null) return _Upload_file!!
        
        _Upload_file = ImageVector.Builder(
            name = "upload_file",
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
                    horizontalLineTo(4f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(13f, 15f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(8f)
                    lineToRelative(4.01f, -4f)
                    lineTo(16f, 15f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(13f, 9f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Upload_file!!
    }

private var _Upload_file: ImageVector? = null

