package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Addchart: ImageVector
    get() {
        if (_Addchart != null) return _Addchart!!
        
        _Addchart = ImageVector.Builder(
            name = "addchart",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11f, 9f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(9f, 17f)
                    verticalLineToRelative(-6f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(9f)
                    close()
                    moveTo(19f, 19f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(15f, 13f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(19f, 5f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(5f)
                    horizontalLineTo(19f)
                    close()
                }
            }
            group {
            }
        }.build()
        
        return _Addchart!!
    }

private var _Addchart: ImageVector? = null

