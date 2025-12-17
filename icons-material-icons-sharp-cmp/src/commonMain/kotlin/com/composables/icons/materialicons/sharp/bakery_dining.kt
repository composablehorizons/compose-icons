package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bakery_dining: ImageVector
    get() {
        if (_Bakery_dining != null) return _Bakery_dining!!
        
        _Bakery_dining = ImageVector.Builder(
            name = "bakery_dining",
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
                            moveTo(16.36f, 7.58f)
                            lineTo(15.5f, 16.99f)
                            lineTo(17f, 16.99f)
                            lineTo(20.16f, 9.1f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3.84f, 9.1f)
                            lineTo(7f, 16.99f)
                            lineTo(8.5f, 16.99f)
                            lineTo(7.64f, 7.58f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(10f, 16.99f)
                            lineTo(14f, 16.99f)
                            lineTo(15f, 6f)
                            lineTo(9f, 6f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.32f, 12.75f)
                            lineTo(18.51f, 17.25f)
                            lineTo(20.46f, 18.21f)
                            lineTo(22.52f, 16.99f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(1.48f, 16.99f)
                            lineTo(3.54f, 18.21f)
                            lineTo(5.49f, 17.25f)
                            lineTo(3.68f, 12.75f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Bakery_dining!!
    }

private var _Bakery_dining: ImageVector? = null

