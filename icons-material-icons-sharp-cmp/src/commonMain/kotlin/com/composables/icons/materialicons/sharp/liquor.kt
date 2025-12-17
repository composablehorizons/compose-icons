package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Liquor: ImageVector
    get() {
        if (_Liquor != null) return _Liquor!!
        
        _Liquor = ImageVector.Builder(
            name = "liquor",
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
                                moveTo(3f, 14f)
                                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                                verticalLineTo(20f)
                                horizontalLineTo(3f)
                                verticalLineToRelative(2f)
                                horizontalLineToRelative(6f)
                                verticalLineToRelative(-2f)
                                horizontalLineTo(7f)
                                verticalLineToRelative(-3.18f)
                                curveTo(8.16f, 16.4f, 9f, 15.3f, 9f, 14f)
                                verticalLineTo(6f)
                                horizontalLineTo(3f)
                                verticalLineTo(14f)
                                close()
                                moveTo(5f, 8f)
                                horizontalLineToRelative(2f)
                                verticalLineToRelative(3f)
                                horizontalLineTo(5f)
                                verticalLineTo(8f)
                                close()
                            }
                        }
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(22f, 9f)
                                lineToRelative(-3f, -1.01f)
                                verticalLineTo(2f)
                                horizontalLineToRelative(-5f)
                                verticalLineToRelative(6f)
                                lineToRelative(-3f, 1.01f)
                                verticalLineTo(22f)
                                horizontalLineToRelative(11f)
                                verticalLineTo(9f)
                                close()
                                moveTo(16f, 4f)
                                horizontalLineToRelative(1f)
                                verticalLineToRelative(1f)
                                horizontalLineToRelative(-1f)
                                verticalLineTo(4f)
                                close()
                                moveTo(13f, 10.44f)
                                lineToRelative(3f, -0.98f)
                                verticalLineTo(7f)
                                horizontalLineToRelative(1f)
                                verticalLineToRelative(2.46f)
                                lineToRelative(3f, 0.98f)
                                verticalLineTo(12f)
                                horizontalLineToRelative(-7f)
                                verticalLineTo(10.44f)
                                close()
                                moveTo(20f, 20f)
                                horizontalLineToRelative(-7f)
                                verticalLineToRelative(-2f)
                                horizontalLineToRelative(7f)
                                verticalLineTo(20f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Liquor!!
    }

private var _Liquor: ImageVector? = null

