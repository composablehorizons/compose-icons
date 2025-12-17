package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Legend_toggle: ImageVector
    get() {
        if (_Legend_toggle != null) return _Legend_toggle!!
        
        _Legend_toggle = ImageVector.Builder(
            name = "legend_toggle",
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
                    moveTo(20f, 15f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(15f)
                    close()
                    moveTo(20f, 17f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(17f)
                    close()
                    moveTo(15f, 11f)
                    lineToRelative(5f, -3.55f)
                    lineTo(20f, 5f)
                    lineToRelative(-5f, 3.55f)
                    lineTo(10f, 5f)
                    lineTo(4f, 8.66f)
                    lineTo(4f, 11f)
                    lineToRelative(5.92f, -3.61f)
                    lineTo(15f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Legend_toggle!!
    }

private var _Legend_toggle: ImageVector? = null

