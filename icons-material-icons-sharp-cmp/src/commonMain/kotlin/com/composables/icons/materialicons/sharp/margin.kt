package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Margin: ImageVector
    get() {
        if (_Margin != null) return _Margin!!
        
        _Margin = ImageVector.Builder(
            name = "margin",
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
                    moveTo(3f, 3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    horizontalLineTo(3f)
                    close()
                    moveTo(9f, 13f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(9f, 9f)
                    horizontalLineTo(7f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(13f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(17f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(17f, 9f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Margin!!
    }

private var _Margin: ImageVector? = null

