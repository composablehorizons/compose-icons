package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ramen_dining: ImageVector
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
                    moveTo(9f, 6f)
                    horizontalLineTo(8f)
                    verticalLineTo(4.65f)
                    lineToRelative(1f, -0.12f)
                    verticalLineTo(6f)
                    close()
                    moveTo(9f, 12f)
                    horizontalLineTo(8f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(12f)
                    close()
                    moveTo(6f, 7f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(6f)
                    verticalLineTo(7f)
                    close()
                    moveTo(6f, 4.88f)
                    lineToRelative(1f, -0.12f)
                    verticalLineTo(6f)
                    horizontalLineTo(6f)
                    verticalLineTo(4.88f)
                    close()
                    moveTo(22f, 3f)
                    verticalLineTo(2f)
                    lineTo(5f, 4f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(2f)
                    curveToRelative(0f, 3.69f, 2.47f, 6.86f, 6f, 8.25f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-1.75f)
                    curveToRelative(3.53f, -1.39f, 6f, -4.56f, 6f, -8.25f)
                    horizontalLineTo(10f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(6f)
                    horizontalLineTo(10f)
                    verticalLineTo(4.41f)
                    lineTo(22f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Ramen_dining!!
    }

private var _Ramen_dining: ImageVector? = null

