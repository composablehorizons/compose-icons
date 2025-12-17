package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ramen_dining: ImageVector
    get() {
        if (_Ramen_dining != null) return _Ramen_dining!!
        
        _Ramen_dining = ImageVector.Builder(
            name = "ramen_dining",
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
                    moveTo(22f, 3.51f)
                    verticalLineTo(2f)
                    lineTo(4f, 3.99f)
                    verticalLineTo(12f)
                    horizontalLineTo(2f)
                    curveToRelative(0f, 3.69f, 2.47f, 6.86f, 6f, 8.25f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-1.75f)
                    curveToRelative(3.53f, -1.39f, 6f, -4.56f, 6f, -8.25f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(8f)
                    horizontalLineTo(22f)
                    verticalLineTo(6.5f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(4.78f)
                    lineTo(22f, 3.51f)
                    close()
                    moveTo(6.5f, 5.22f)
                    verticalLineTo(6.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(5.34f)
                    lineTo(6.5f, 5.22f)
                    close()
                    moveTo(5.5f, 8f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(8f)
                    close()
                    moveTo(9f, 12f)
                    horizontalLineTo(8f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(12f)
                    close()
                    moveTo(9f, 6.5f)
                    horizontalLineTo(8f)
                    verticalLineTo(5.06f)
                    lineToRelative(1f, -0.11f)
                    verticalLineTo(6.5f)
                    close()
                }
            }
        }.build()
        
        return _Ramen_dining!!
    }

private var _Ramen_dining: ImageVector? = null

