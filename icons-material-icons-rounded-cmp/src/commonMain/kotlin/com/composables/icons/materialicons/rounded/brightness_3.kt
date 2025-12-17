package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Brightness_3: ImageVector
    get() {
        if (_Brightness_3 != null) return _Brightness_3!!
        
        _Brightness_3 = ImageVector.Builder(
            name = "brightness_3",
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(8.93f, 2f)
                            curveTo(8.88f, 2f, 8.84f, 2f, 8.79f, 2f)
                            curveTo(7.96f, 2.02f, 7.7f, 3.12f, 8.4f, 3.56f)
                            curveToRelative(2.78f, 1.77f, 4.63f, 4.89f, 4.63f, 8.44f)
                            curveToRelative(0f, 3.55f, -1.84f, 6.66f, -4.62f, 8.43f)
                            curveTo(7.7f, 20.89f, 7.98f, 21.98f, 8.82f, 22f)
                            curveToRelative(0.07f, 0f, 0.14f, 0f, 0.21f, 0f)
                            curveToRelative(6.05f, 0f, 10.86f, -5.39f, 9.87f, -11.63f)
                            curveTo(18.14f, 5.53f, 13.83f, 1.95f, 8.93f, 2f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Brightness_3!!
    }

private var _Brightness_3: ImageVector? = null

