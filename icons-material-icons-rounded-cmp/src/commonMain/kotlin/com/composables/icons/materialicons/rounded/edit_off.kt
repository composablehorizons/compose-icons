package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edit_off: ImageVector
    get() {
        if (_Edit_off != null) return _Edit_off!!
        
        _Edit_off = ImageVector.Builder(
            name = "edit_off",
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2.1f, 3.51f)
                            lineTo(2.1f, 3.51f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(6.61f, 6.61f)
                            lineTo(3.15f, 17.1f)
                            curveTo(3.05f, 17.2f, 3f, 17.32f, 3f, 17.46f)
                            verticalLineToRelative(3.04f)
                            curveTo(3f, 20.78f, 3.22f, 21f, 3.5f, 21f)
                            horizontalLineToRelative(3.04f)
                            curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                            lineToRelative(5.56f, -5.56f)
                            lineToRelative(6.61f, 6.61f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                            lineTo(3.52f, 3.51f)
                            curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.71f, 7.04f)
                            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                            lineToRelative(-2.34f, -2.34f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(-1.83f, 1.83f)
                            lineToRelative(3.75f, 3.75f)
                            lineTo(20.71f, 7.04f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.535175f, 8.709738f)
                            lineTo(14.052452f, 6.1924615f)
                            lineTo(17.800083f, 9.940092f)
                            lineTo(15.282806f, 12.457368f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Edit_off!!
    }

private var _Edit_off: ImageVector? = null

