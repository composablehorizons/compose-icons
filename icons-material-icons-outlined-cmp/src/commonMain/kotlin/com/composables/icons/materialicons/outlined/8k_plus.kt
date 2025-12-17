package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`8k_plus`: ImageVector
    get() {
        if (_8k_plus != null) return _8k_plus!!
        
        _8k_plus = ImageVector.Builder(
            name = "8k_plus",
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
                            moveTo(7f, 15f)
                            horizontalLineToRelative(2f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-4f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(7f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(4f)
                            curveTo(6f, 14.55f, 6.45f, 15f, 7f, 15f)
                            close()
                            moveTo(7.5f, 10f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(1.5f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(10f)
                            close()
                            moveTo(7.5f, 12.5f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(14f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(12.5f)
                            close()
                        }
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
                            moveTo(19f, 11.5f)
                            horizontalLineToRelative(-1.5f)
                            verticalLineTo(10f)
                            horizontalLineToRelative(-1f)
                            verticalLineToRelative(1.5f)
                            horizontalLineTo(15f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(1.5f)
                            verticalLineTo(14f)
                            horizontalLineToRelative(1f)
                            verticalLineToRelative(-1.5f)
                            horizontalLineTo(19f)
                            verticalLineTo(19f)
                            horizontalLineTo(5f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(14f)
                            verticalLineTo(11.5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12.5f, 12.75f)
                            lineTo(14.25f, 15f)
                            lineTo(16f, 15f)
                            lineTo(13.75f, 12f)
                            lineTo(16f, 9f)
                            lineTo(14.25f, 9f)
                            lineTo(12.5f, 11.25f)
                            lineTo(12.5f, 9f)
                            lineTo(11f, 9f)
                            lineTo(11f, 15f)
                            lineTo(12.5f, 15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _8k_plus!!
    }

private var _8k_plus: ImageVector? = null

