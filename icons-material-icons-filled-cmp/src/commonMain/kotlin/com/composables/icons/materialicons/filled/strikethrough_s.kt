package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Strikethrough_s: ImageVector
    get() {
        if (_Strikethrough_s != null) return _Strikethrough_s!!
        
        _Strikethrough_s = ImageVector.Builder(
            name = "strikethrough_s",
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
                            moveTo(6.85f, 7.08f)
                            curveTo(6.85f, 4.37f, 9.45f, 3f, 12.24f, 3f)
                            curveToRelative(1.64f, 0f, 3f, 0.49f, 3.9f, 1.28f)
                            curveToRelative(0.77f, 0.65f, 1.46f, 1.73f, 1.46f, 3.24f)
                            horizontalLineToRelative(-3.01f)
                            curveToRelative(0f, -0.31f, -0.05f, -0.59f, -0.15f, -0.85f)
                            curveToRelative(-0.29f, -0.86f, -1.2f, -1.28f, -2.25f, -1.28f)
                            curveToRelative(-1.86f, 0f, -2.34f, 1.02f, -2.34f, 1.7f)
                            curveToRelative(0f, 0.48f, 0.25f, 0.88f, 0.74f, 1.21f)
                            curveTo(10.97f, 8.55f, 11.36f, 8.78f, 12f, 9f)
                            horizontalLineTo(7.39f)
                            curveTo(7.18f, 8.66f, 6.85f, 8.11f, 6.85f, 7.08f)
                            close()
                            moveTo(21f, 12f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(9.62f)
                            curveToRelative(1.15f, 0.45f, 1.96f, 0.75f, 1.96f, 1.97f)
                            curveToRelative(0f, 1f, -0.81f, 1.67f, -2.28f, 1.67f)
                            curveToRelative(-1.54f, 0f, -2.93f, -0.54f, -2.93f, -2.51f)
                            horizontalLineTo(6.4f)
                            curveToRelative(0f, 0.55f, 0.08f, 1.13f, 0.24f, 1.58f)
                            curveToRelative(0.81f, 2.29f, 3.29f, 3.3f, 5.67f, 3.3f)
                            curveToRelative(2.27f, 0f, 5.3f, -0.89f, 5.3f, -4.05f)
                            curveToRelative(0f, -0.3f, -0.01f, -1.16f, -0.48f, -1.94f)
                            horizontalLineTo(21f)
                            verticalLineTo(12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Strikethrough_s!!
    }

private var _Strikethrough_s: ImageVector? = null

