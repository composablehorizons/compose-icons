package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Shield: ImageVector
    get() {
        if (_Shield != null) return _Shield!!
        
        _Shield = ImageVector.Builder(
            name = "shield",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.3f, 2.26f)
                        lineToRelative(-6f, 2.25f)
                        curveTo(4.52f, 4.81f, 4f, 5.55f, 4f, 6.39f)
                        verticalLineToRelative(4.7f)
                        curveToRelative(0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f)
                        curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0f)
                        curveToRelative(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f)
                        verticalLineToRelative(-4.7f)
                        curveToRelative(0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f)
                        lineToRelative(-6f, -2.25f)
                        curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Shield!!
    }

private var _Shield: ImageVector? = null

