package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Battery_4_bar: ImageVector
    get() {
        if (_Battery_4_bar != null) return _Battery_4_bar!!
        
        _Battery_4_bar = ImageVector.Builder(
            name = "battery_4_bar",
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
                    moveTo(17f, 5f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(8f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    curveTo(16.55f, 4f, 17f, 4.45f, 17f, 5f)
                    close()
                    moveTo(15f, 6f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(6f)
                    close()
                }
            }
        }.build()
        
        return _Battery_4_bar!!
    }

private var _Battery_4_bar: ImageVector? = null

