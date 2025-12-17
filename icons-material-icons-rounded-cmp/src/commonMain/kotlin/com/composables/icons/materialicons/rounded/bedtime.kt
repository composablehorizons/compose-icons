package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bedtime: ImageVector
    get() {
        if (_Bedtime != null) return _Bedtime!!
        
        _Bedtime = ImageVector.Builder(
            name = "bedtime",
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
                        moveTo(11.65f, 3.46f)
                        curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f)
                        curveToRelative(-5.52f, 0.8f, -9.47f, 6.07f, -8.34f, 11.88f)
                        curveToRelative(0.78f, 4.02f, 4.09f, 7.21f, 8.14f, 7.87f)
                        curveToRelative(3.74f, 0.61f, 7.16f, -0.87f, 9.32f, -3.44f)
                        curveToRelative(0.48f, -0.57f, 0.19f, -1.48f, -0.55f, -1.62f)
                        curveTo(13.08f, 15.66f, 9.42f, 9.27f, 11.65f, 3.46f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedtime!!
    }

private var _Bedtime: ImageVector? = null

