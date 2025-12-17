package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Co_present: ImageVector
    get() {
        if (_Co_present != null) return _Co_present!!
        
        _Co_present = ImageVector.Builder(
            name = "co_present",
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
                            moveTo(23f, 3f)
                            lineTo(1f, 3f)
                            lineTo(1f, 13f)
                            lineTo(3f, 13f)
                            lineTo(3f, 5f)
                            lineTo(21f, 5f)
                            lineTo(21f, 21f)
                            lineTo(23f, 21f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 10f)
                            arcTo(4f, 4f, 0f, false, true, 9f, 14f)
                            arcTo(4f, 4f, 0f, false, true, 5f, 10f)
                            arcTo(4f, 4f, 0f, false, true, 13f, 10f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15.39f, 16.56f)
                            curveTo(13.71f, 15.7f, 11.53f, 15f, 9f, 15f)
                            curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                            curveTo(1.61f, 17.07f, 1f, 18.1f, 1f, 19.22f)
                            verticalLineTo(22f)
                            horizontalLineToRelative(16f)
                            verticalLineToRelative(-2.78f)
                            curveTo(17f, 18.1f, 16.39f, 17.07f, 15.39f, 16.56f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Co_present!!
    }

private var _Co_present: ImageVector? = null

