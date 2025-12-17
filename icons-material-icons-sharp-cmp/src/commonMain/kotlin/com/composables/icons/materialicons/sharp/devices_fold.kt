package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Devices_fold: ImageVector
    get() {
        if (_Devices_fold != null) return _Devices_fold!!
        
        _Devices_fold = ImageVector.Builder(
            name = "devices_fold",
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
                            moveTo(17f, 3f)
                            verticalLineToRelative(-3.03f)
                            lineToRelative(-7f, 3f)
                            verticalLineTo(3f)
                            verticalLineToRelative(18f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(3f)
                            horizontalLineTo(17f)
                            close()
                            moveTo(20f, 19f)
                            horizontalLineToRelative(-5.33f)
                            lineTo(17f, 18f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(3f)
                            verticalLineTo(19f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2f, 3f)
                            horizontalLineTo(4f)
                            verticalLineTo(5f)
                            horizontalLineTo(2f)
                            verticalLineTo(3f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2f, 19f)
                            horizontalLineTo(4f)
                            verticalLineTo(21f)
                            horizontalLineTo(2f)
                            verticalLineTo(19f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2f, 15f)
                            horizontalLineTo(4f)
                            verticalLineTo(17f)
                            horizontalLineTo(2f)
                            verticalLineTo(15f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2f, 11f)
                            horizontalLineTo(4f)
                            verticalLineTo(13f)
                            horizontalLineTo(2f)
                            verticalLineTo(11f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(2f, 7f)
                            horizontalLineTo(4f)
                            verticalLineTo(9f)
                            horizontalLineTo(2f)
                            verticalLineTo(7f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 3f)
                            horizontalLineTo(8f)
                            verticalLineTo(5f)
                            horizontalLineTo(6f)
                            verticalLineTo(3f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 19f)
                            horizontalLineTo(8f)
                            verticalLineTo(21f)
                            horizontalLineTo(6f)
                            verticalLineTo(19f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Devices_fold!!
    }

private var _Devices_fold: ImageVector? = null

