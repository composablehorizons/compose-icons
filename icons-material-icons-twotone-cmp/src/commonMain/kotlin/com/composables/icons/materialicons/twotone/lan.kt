package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Lan: ImageVector
    get() {
        if (_Lan != null) return _Lan!!
        
        _Lan = ImageVector.Builder(
            name = "lan",
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
                    moveTo(10f, 7f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(10f)
                    close()
                    moveTo(9f, 17f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(9f)
                    close()
                    moveTo(19f, 17f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(19f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 22f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-7f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(2f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-7f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(22f)
                    close()
                    moveTo(10f, 7f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(10f)
                    close()
                    moveTo(9f, 17f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(9f)
                    close()
                    moveTo(19f, 17f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Lan!!
    }

private var _Lan: ImageVector? = null

