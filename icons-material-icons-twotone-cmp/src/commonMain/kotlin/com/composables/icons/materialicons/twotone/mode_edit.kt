package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mode_edit: ImageVector
    get() {
        if (_Mode_edit != null) return _Mode_edit!!
        
        _Mode_edit = ImageVector.Builder(
            name = "mode_edit",
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
                        moveTo(5f, 18.08f)
                        lineTo(5f, 19f)
                        lineTo(5.92f, 19f)
                        lineTo(14.98f, 9.94f)
                        lineTo(14.06f, 9.02f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3f, 17.25f)
                            lineTo(3f, 21f)
                            lineToRelative(3.75f, 0f)
                            lineTo(17.81f, 9.94f)
                            lineToRelative(-3.75f, -3.75f)
                            lineTo(3f, 17.25f)
                            close()
                            moveTo(5.92f, 19f)
                            lineTo(5f, 19f)
                            lineToRelative(0f, -0.92f)
                            lineToRelative(9.06f, -9.06f)
                            lineToRelative(0.92f, 0.92f)
                            lineTo(5.92f, 19f)
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
        
        return _Mode_edit!!
    }

private var _Mode_edit: ImageVector? = null

