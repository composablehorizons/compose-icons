package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Zoom_out_map: ImageVector
    get() {
        if (_Zoom_out_map != null) return _Zoom_out_map!!
        
        _Zoom_out_map = ImageVector.Builder(
            name = "zoom_out_map",
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
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(15.85f, 3.85f)
                                lineTo(17.3f, 5.3f)
                                lineToRelative(-2.18f, 2.16f)
                                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                                lineToRelative(0f, 0f)
                                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                                lineTo(18.7f, 6.7f)
                                lineToRelative(1.45f, 1.45f)
                                curveTo(20.46f, 8.46f, 21f, 8.24f, 21f, 7.79f)
                                verticalLineTo(3.5f)
                                curveTo(21f, 3.22f, 20.78f, 3f, 20.5f, 3f)
                                horizontalLineToRelative(-4.29f)
                                curveTo(15.76f, 3f, 15.54f, 3.54f, 15.85f, 3.85f)
                                close()
                                moveTo(3.85f, 8.15f)
                                lineTo(5.3f, 6.7f)
                                lineToRelative(2.16f, 2.18f)
                                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                                lineToRelative(0f, 0f)
                                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                                lineTo(6.7f, 5.3f)
                                lineToRelative(1.45f, -1.45f)
                                curveTo(8.46f, 3.54f, 8.24f, 3f, 7.79f, 3f)
                                horizontalLineTo(3.5f)
                                curveTo(3.22f, 3f, 3f, 3.22f, 3f, 3.5f)
                                verticalLineToRelative(4.29f)
                                curveTo(3f, 8.24f, 3.54f, 8.46f, 3.85f, 8.15f)
                                close()
                                moveTo(8.15f, 20.15f)
                                lineTo(6.7f, 18.7f)
                                lineToRelative(2.18f, -2.16f)
                                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                                lineToRelative(0f, 0f)
                                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                                lineTo(5.3f, 17.3f)
                                lineToRelative(-1.45f, -1.45f)
                                curveTo(3.54f, 15.54f, 3f, 15.76f, 3f, 16.21f)
                                verticalLineToRelative(4.29f)
                                curveTo(3f, 20.78f, 3.22f, 21f, 3.5f, 21f)
                                horizontalLineToRelative(4.29f)
                                curveTo(8.24f, 21f, 8.46f, 20.46f, 8.15f, 20.15f)
                                close()
                                moveTo(20.15f, 15.85f)
                                lineTo(18.7f, 17.3f)
                                lineToRelative(-2.16f, -2.18f)
                                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                                lineToRelative(0f, 0f)
                                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                                lineToRelative(2.18f, 2.16f)
                                lineToRelative(-1.45f, 1.45f)
                                curveTo(15.54f, 20.46f, 15.76f, 21f, 16.21f, 21f)
                                horizontalLineToRelative(4.29f)
                                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                                verticalLineToRelative(-4.29f)
                                curveTo(21f, 15.76f, 20.46f, 15.54f, 20.15f, 15.85f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Zoom_out_map!!
    }

private var _Zoom_out_map: ImageVector? = null

