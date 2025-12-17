package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Stacked_bar_chart: ImageVector
    get() {
        if (_Stacked_bar_chart != null) return _Stacked_bar_chart!!
        
        _Stacked_bar_chart = ImageVector.Builder(
            name = "stacked_bar_chart",
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
                    moveTo(6f, 10f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(10f)
                    horizontalLineTo(6f)
                    verticalLineTo(10f)
                    close()
                    moveTo(6f, 5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(6f)
                    verticalLineTo(5f)
                    close()
                    moveTo(16f, 16f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(16f)
                    close()
                    moveTo(16f, 13f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(13f)
                    close()
                    moveTo(11f, 13f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(13f)
                    close()
                    moveTo(11f, 9f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Stacked_bar_chart!!
    }

private var _Stacked_bar_chart: ImageVector? = null

