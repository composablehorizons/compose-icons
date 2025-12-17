package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Css: ImageVector
    get() {
        if (_Css != null) return _Css!!
        
        _Css = ImageVector.Builder(
            name = "css",
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
                    moveTo(9.5f, 15f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(11f)
                    verticalLineToRelative(0.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(9.5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(13f)
                    verticalLineToRelative(-0.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3.5f)
                    verticalLineTo(15f)
                    horizontalLineTo(9.5f)
                    close()
                    moveTo(16f, 15f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-3.5f)
                    horizontalLineToRelative(-3.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    horizontalLineTo(21f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(3.5f)
                    horizontalLineToRelative(3.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13f)
                    horizontalLineTo(16f)
                    verticalLineTo(15f)
                    close()
                    moveTo(8f, 11f)
                    verticalLineTo(9f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(6.5f)
                    verticalLineToRelative(0.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    horizontalLineTo(8f)
                    close()
                }
            }
        }.build()
        
        return _Css!!
    }

private var _Css: ImageVector? = null

