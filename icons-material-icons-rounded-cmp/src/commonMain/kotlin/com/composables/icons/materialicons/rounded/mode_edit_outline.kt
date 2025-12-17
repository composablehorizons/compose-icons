package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mode_edit_outline: ImageVector
    get() {
        if (_Mode_edit_outline != null) return _Mode_edit_outline!!
        
        _Mode_edit_outline = ImageVector.Builder(
            name = "mode_edit_outline",
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
                            moveTo(3f, 17.46f)
                            lineToRelative(0f, 3.04f)
                            curveTo(3f, 20.78f, 3.22f, 21f, 3.5f, 21f)
                            horizontalLineToRelative(3.04f)
                            curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                            lineTo(17.81f, 9.94f)
                            lineToRelative(-3.75f, -3.75f)
                            lineTo(3.15f, 17.1f)
                            curveTo(3.05f, 17.2f, 3f, 17.32f, 3f, 17.46f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.71f, 5.63f)
                            lineToRelative(-2.34f, -2.34f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineToRelative(-1.83f, 1.83f)
                            lineToRelative(3.75f, 3.75f)
                            lineToRelative(1.83f, -1.83f)
                            curveTo(21.1f, 6.65f, 21.1f, 6.02f, 20.71f, 5.63f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Mode_edit_outline!!
    }

private var _Mode_edit_outline: ImageVector? = null

