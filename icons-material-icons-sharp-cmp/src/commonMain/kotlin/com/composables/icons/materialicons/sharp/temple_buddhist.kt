package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Temple_buddhist: ImageVector
    get() {
        if (_Temple_buddhist != null) return _Temple_buddhist!!
        
        _Temple_buddhist = ImageVector.Builder(
            name = "temple_buddhist",
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
                            moveTo(21f, 9.02f)
                            curveToRelative(0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f)
                            horizontalLineTo(4.98f)
                            curveTo(3.89f, 11f, 3f, 10.11f, 3f, 9.02f)
                            horizontalLineTo(1f)
                            curveToRelative(0f, 1.86f, 1.28f, 3.4f, 3f, 3.84f)
                            verticalLineTo(22f)
                            horizontalLineToRelative(6f)
                            verticalLineToRelative(-5f)
                            horizontalLineToRelative(4f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(6f)
                            verticalLineToRelative(-9.14f)
                            curveToRelative(0.55f, -0.14f, 3f, -1.04f, 3f, -3.86f)
                            lineTo(21f, 9.02f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 8.86f)
                            verticalLineTo(10f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(8.86f)
                            curveToRelative(0.55f, -0.14f, 3f, -1.04f, 3f, -3.86f)
                            lineToRelative(-2f, 0.02f)
                            curveTo(19f, 6.11f, 18.11f, 7f, 17.02f, 7f)
                            horizontalLineTo(6.98f)
                            curveTo(5.89f, 7f, 5f, 6.11f, 5f, 5.02f)
                            horizontalLineTo(3f)
                            curveTo(3f, 6.87f, 4.28f, 8.42f, 6f, 8.86f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 1f)
                            lineTo(8.25f, 6f)
                            lineTo(15.75f, 6f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Temple_buddhist!!
    }

private var _Temple_buddhist: ImageVector? = null

