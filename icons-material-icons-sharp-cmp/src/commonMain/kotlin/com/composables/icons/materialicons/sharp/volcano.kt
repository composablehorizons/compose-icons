package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Volcano: ImageVector
    get() {
        if (_Volcano != null) return _Volcano!!
        
        _Volcano = ImageVector.Builder(
            name = "volcano",
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
                            moveTo(18f, 8f)
                            lineTo(11f, 8f)
                            lineTo(9f, 13f)
                            lineTo(6f, 13f)
                            lineTo(2f, 22f)
                            lineTo(22f, 22f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 1f)
                            horizontalLineTo(15f)
                            verticalLineTo(5f)
                            horizontalLineTo(13f)
                            verticalLineTo(1f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.121199f, 5.468293f)
                            lineTo(18.9496f, 2.6398926f)
                            lineTo(20.3638f, 4.0540924f)
                            lineTo(17.535398f, 6.882493f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7.639692f, 4.0503f)
                            lineTo(9.053892f, 2.6360998f)
                            lineTo(11.882292f, 5.4645f)
                            lineTo(10.468092f, 6.8787003f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Volcano!!
    }

private var _Volcano: ImageVector? = null

