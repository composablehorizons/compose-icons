package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Offline_share: ImageVector
    get() {
        if (_Offline_share != null) return _Offline_share!!
        
        _Offline_share = ImageVector.Builder(
            name = "offline_share",
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
                            moveTo(6f, 5f)
                            lineTo(4f, 5f)
                            lineTo(4f, 23f)
                            lineTo(16f, 23f)
                            lineTo(16f, 21f)
                            lineTo(6f, 21f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20f, 1f)
                            horizontalLineTo(8f)
                            verticalLineToRelative(18f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(1f)
                            close()
                            moveTo(18f, 15f)
                            horizontalLineToRelative(-8f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(8f)
                            verticalLineTo(15f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12.5f, 10.25f)
                            lineTo(14.5f, 10.25f)
                            lineTo(14.5f, 12f)
                            lineTo(17f, 9.5f)
                            lineTo(14.5f, 7f)
                            lineTo(14.5f, 8.75f)
                            lineTo(11f, 8.75f)
                            lineTo(11f, 12f)
                            lineTo(12.5f, 12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Offline_share!!
    }

private var _Offline_share: ImageVector? = null

