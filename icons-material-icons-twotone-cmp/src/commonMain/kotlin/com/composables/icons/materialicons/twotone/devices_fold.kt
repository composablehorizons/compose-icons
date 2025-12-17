package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Devices_fold: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 3f)
                        lineTo(12f, 4.29f)
                        lineTo(12f, 17.97f)
                        lineTo(15f, 16.68f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 3f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(0f, -1.44f, -1.47f, -2.4f, -2.79f, -1.84f)
                        lineToRelative(-3f, 1.29f)
                        curveTo(10.48f, 2.76f, 10f, 3.49f, 10f, 4.29f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                        close()
                        moveTo(12f, 4.29f)
                        lineTo(15f, 3f)
                        verticalLineToRelative(13.68f)
                        lineToRelative(-3f, 1.29f)
                        verticalLineTo(4.29f)
                        close()
                        moveTo(20f, 19f)
                        horizontalLineToRelative(-5.33f)
                        lineToRelative(1.12f, -0.48f)
                        curveTo(16.52f, 18.2f, 17f, 17.48f, 17f, 16.68f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(19f)
                        close()
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

