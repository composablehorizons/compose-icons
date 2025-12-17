package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`5k`: ImageVector
    get() {
        if (_5k != null) return _5k!!
        
        _5k = ImageVector.Builder(
            name = "5k",
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
                            moveTo(19f, 3f)
                            horizontalLineTo(5f)
                            curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(5f)
                            curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                            close()
                            moveTo(19f, 19f)
                            horizontalLineTo(5f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(14f)
                            verticalLineTo(19f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11f, 14f)
                            verticalLineToRelative(-1.5f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(8f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(3f)
                            verticalLineTo(9f)
                            horizontalLineTo(6.5f)
                            verticalLineToRelative(3.5f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(-3f)
                            verticalLineTo(15f)
                            horizontalLineTo(10f)
                            curveTo(10.55f, 15f, 11f, 14.55f, 11f, 14f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14.5f, 12.75f)
                            lineTo(16.25f, 15f)
                            lineTo(18f, 15f)
                            lineTo(15.75f, 12f)
                            lineTo(18f, 9f)
                            lineTo(16.25f, 9f)
                            lineTo(14.5f, 11.25f)
                            lineTo(14.5f, 9f)
                            lineTo(13f, 9f)
                            lineTo(13f, 15f)
                            lineTo(14.5f, 15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _5k!!
    }

private var _5k: ImageVector? = null

