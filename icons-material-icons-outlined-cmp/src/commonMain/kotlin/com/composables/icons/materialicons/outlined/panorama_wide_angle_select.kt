package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Panorama_wide_angle_select: ImageVector
    get() {
        if (_Panorama_wide_angle_select != null) return _Panorama_wide_angle_select!!
        
        _Panorama_wide_angle_select = ImageVector.Builder(
            name = "panorama_wide_angle_select",
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
                            moveTo(12f, 4f)
                            curveTo(8.03f, 4f, 5.15f, 4.63f, 3f, 5f)
                            curveToRelative(-0.55f, 1.97f, -1f, 3.92f, -1f, 7f)
                            curveToRelative(0f, 3.03f, 0.45f, 5.05f, 1f, 7f)
                            curveToRelative(2.15f, 0.37f, 4.98f, 1f, 9f, 1f)
                            curveToRelative(3.97f, 0f, 6.85f, -0.63f, 9f, -1f)
                            curveToRelative(0.57f, -2.02f, 1f, -3.99f, 1f, -7f)
                            curveToRelative(0f, -3.03f, -0.45f, -5.05f, -1f, -7f)
                            curveTo(18.85f, 4.63f, 16.02f, 4f, 12f, 4f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Panorama_wide_angle_select!!
    }

private var _Panorama_wide_angle_select: ImageVector? = null

