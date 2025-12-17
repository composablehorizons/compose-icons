package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.House: ImageVector
    get() {
        if (_House != null) return _House!!
        
        _House = ImageVector.Builder(
            name = "house",
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
                    moveTo(19f, 9.3f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2.6f)
                    lineTo(12f, 3f)
                    lineTo(2f, 12f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(3f)
                    lineTo(19f, 9.3f)
                    close()
                    moveTo(10f, 10f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    horizontalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _House!!
    }

private var _House: ImageVector? = null

