package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_list_off: ImageVector
    get() {
        if (_Filter_list_off != null) return _Filter_list_off!!
        
        _Filter_list_off = ImageVector.Builder(
            name = "filter_list_off",
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
                    moveTo(10.83f, 8f)
                    horizontalLineTo(21f)
                    verticalLineTo(6f)
                    horizontalLineTo(8.83f)
                    lineTo(10.83f, 8f)
                    close()
                    moveTo(15.83f, 13f)
                    horizontalLineTo(18f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-4.17f)
                    lineTo(15.83f, 13f)
                    close()
                    moveTo(14f, 16.83f)
                    verticalLineTo(18f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(3.17f)
                    lineToRelative(-3f, -3f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2.17f)
                    lineToRelative(-3f, -3f)
                    horizontalLineTo(3f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(0.17f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(18.38f, 18.38f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(14f, 16.83f)
                    close()
                }
            }
        }.build()
        
        return _Filter_list_off!!
    }

private var _Filter_list_off: ImageVector? = null

