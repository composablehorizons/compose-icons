package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Compress: ImageVector
    get() {
        if (_Compress != null) return _Compress!!
        
        _Compress = ImageVector.Builder(
            name = "compress",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 9f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(9f)
                    horizontalLineTo(4f)
                    close()
                    moveTo(16f, 4f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(13f, 4.17f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3.19f)
                    lineTo(9.39f, 2.61f)
                    lineTo(8f, 4f)
                    lineToRelative(4f, 4f)
                    lineTo(16f, 4f)
                    close()
                    moveTo(4f, 14f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(14f)
                    close()
                    moveTo(8f, 19f)
                    lineToRelative(1.39f, 1.39f)
                    lineTo(11f, 18.81f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3.17f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(16f, 19f)
                    lineToRelative(-4f, -4f)
                    lineTo(8f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Compress!!
    }

private var _Compress: ImageVector? = null

