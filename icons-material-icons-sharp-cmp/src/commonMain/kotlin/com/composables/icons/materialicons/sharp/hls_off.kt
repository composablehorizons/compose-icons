package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hls_off: ImageVector
    get() {
        if (_Hls_off != null) return _Hls_off!!
        
        _Hls_off = ImageVector.Builder(
            name = "hls_off",
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
                    moveTo(17.83f, 15f)
                    horizontalLineToRelative(2.67f)
                    verticalLineToRelative(-3.5f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(3.5f)
                    horizontalLineTo(19f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(-1.17f)
                    lineTo(17.83f, 15f)
                    close()
                    moveTo(8f, 10.83f)
                    verticalLineTo(15f)
                    horizontalLineTo(6.5f)
                    verticalLineToRelative(-2.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(15f)
                    horizontalLineTo(3f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9.33f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(18.38f, 18.38f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(12.17f, 15f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(-2.17f)
                    lineTo(8f, 10.83f)
                    close()
                }
            }
        }.build()
        
        return _Hls_off!!
    }

private var _Hls_off: ImageVector? = null

