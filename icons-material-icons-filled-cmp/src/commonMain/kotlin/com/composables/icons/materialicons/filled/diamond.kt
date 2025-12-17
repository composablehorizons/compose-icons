package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
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
                            moveTo(12.16f, 3f)
                            lineTo(11.84f, 3f)
                            lineTo(9.21f, 8.25f)
                            lineTo(14.79f, 8.25f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.46f, 8.25f)
                            lineTo(21.62f, 8.25f)
                            lineTo(19f, 3f)
                            lineTo(13.84f, 3f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.38f, 9.75f)
                            lineTo(12.75f, 9.75f)
                            lineTo(12.75f, 20.1f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.25f, 20.1f)
                            lineTo(11.25f, 9.75f)
                            lineTo(2.62f, 9.75f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7.54f, 8.25f)
                            lineTo(10.16f, 3f)
                            lineTo(5f, 3f)
                            lineTo(2.38f, 8.25f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

