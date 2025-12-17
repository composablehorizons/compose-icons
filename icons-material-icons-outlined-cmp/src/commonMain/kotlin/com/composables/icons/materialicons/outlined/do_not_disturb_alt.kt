package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Do_not_disturb_alt: ImageVector
    get() {
        if (_Do_not_disturb_alt != null) return _Do_not_disturb_alt!!
        
        _Do_not_disturb_alt = ImageVector.Builder(
            name = "do_not_disturb_alt",
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
                            moveTo(12f, 2f)
                            curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                            reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                            reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                            reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                            close()
                            moveTo(4f, 12f)
                            curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                            curveToRelative(1.8f, 0f, 3.5f, 0.6f, 4.9f, 1.7f)
                            lineTo(5.7f, 16.9f)
                            curveTo(4.6f, 15.5f, 4f, 13.8f, 4f, 12f)
                            close()
                            moveTo(12f, 20f)
                            curveToRelative(-1.8f, 0f, -3.5f, -0.6f, -4.9f, -1.7f)
                            lineTo(18.3f, 7.1f)
                            curveTo(19.4f, 8.5f, 20f, 10.2f, 20f, 12f)
                            curveTo(20f, 16.4f, 16.4f, 20f, 12f, 20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Do_not_disturb_alt!!
    }

private var _Do_not_disturb_alt: ImageVector? = null

