package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sos: ImageVector
    get() {
        if (_Sos != null) return _Sos!!
        
        _Sos = ImageVector.Builder(
            name = "sos",
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
                    moveTo(15.5f, 7f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(7f)
                    close()
                    moveTo(13.5f, 15f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    close()
                    moveTo(1f, 15f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(1f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(1f)
                    verticalLineTo(15f)
                    close()
                    moveTo(17f, 15f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-6f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Sos!!
    }

private var _Sos: ImageVector? = null

