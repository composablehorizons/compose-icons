package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mode_night: ImageVector
    get() {
        if (_Mode_night != null) return _Mode_night!!
        
        _Mode_night = ImageVector.Builder(
            name = "mode_night",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11.93f, 2.3f)
                    curveTo(9.89f, 1.8f, 7.91f, 1.95f, 6.16f, 2.58f)
                    curveTo(5.44f, 2.84f, 5.25f, 3.8f, 5.85f, 4.29f)
                    curveTo(8.08f, 6.12f, 9.5f, 8.89f, 9.5f, 12f)
                    curveToRelative(0f, 3.11f, -1.42f, 5.88f, -3.65f, 7.71f)
                    curveToRelative(-0.59f, 0.49f, -0.42f, 1.45f, 0.31f, 1.7f)
                    curveTo(7.2f, 21.79f, 8.33f, 22f, 9.5f, 22f)
                    curveToRelative(6.05f, 0f, 10.85f, -5.38f, 9.87f, -11.6f)
                    curveTo(18.76f, 6.48f, 15.78f, 3.24f, 11.93f, 2.3f)
                    close()
                }
            }
        }.build()
        
        return _Mode_night!!
    }

private var _Mode_night: ImageVector? = null

