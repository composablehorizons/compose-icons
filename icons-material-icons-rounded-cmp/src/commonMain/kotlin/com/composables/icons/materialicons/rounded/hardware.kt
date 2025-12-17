package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hardware: ImageVector
    get() {
        if (_Hardware != null) return _Hardware!!
        
        _Hardware = ImageVector.Builder(
            name = "hardware",
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
                                moveTo(17.59f, 3.41f)
                                lineTo(15f, 6f)
                                verticalLineTo(5f)
                                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                                horizontalLineTo(9f)
                                curveTo(6.24f, 3f, 4f, 5.24f, 4f, 8f)
                                horizontalLineToRelative(5f)
                                verticalLineToRelative(3f)
                                horizontalLineToRelative(6f)
                                verticalLineTo(8f)
                                lineToRelative(2.59f, 2.59f)
                                curveToRelative(0.26f, 0.26f, 0.62f, 0.41f, 1f, 0.41f)
                                horizontalLineToRelative(0.01f)
                                curveTo(19.37f, 11f, 20f, 10.37f, 20f, 9.59f)
                                verticalLineTo(4.41f)
                                curveTo(20f, 3.63f, 19.37f, 3f, 18.59f, 3f)
                                horizontalLineToRelative(-0.01f)
                                curveTo(18.21f, 3f, 17.85f, 3.15f, 17.59f, 3.41f)
                                close()
                            }
                        }
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(9f, 13f)
                                verticalLineToRelative(7f)
                                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                                horizontalLineToRelative(4f)
                                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                                verticalLineToRelative(-7f)
                                horizontalLineTo(9f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

