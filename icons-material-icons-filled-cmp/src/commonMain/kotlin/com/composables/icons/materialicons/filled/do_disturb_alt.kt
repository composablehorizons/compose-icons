package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Do_disturb_alt: ImageVector
    get() {
        if (_Do_disturb_alt != null) return _Do_disturb_alt!!
        
        _Do_disturb_alt = ImageVector.Builder(
            name = "do_disturb_alt",
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
                            moveTo(12f, 2f)
                            curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                            reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                            reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                            reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                            close()
                            moveTo(12f, 20f)
                            curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                            curveToRelative(0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f)
                            lineTo(16.9f, 18.31f)
                            curveTo(15.55f, 19.37f, 13.85f, 20f, 12f, 20f)
                            close()
                            moveTo(18.31f, 16.9f)
                            lineTo(7.1f, 5.69f)
                            curveTo(8.45f, 4.63f, 10.15f, 4f, 12f, 4f)
                            curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                            curveTo(20f, 13.85f, 19.37f, 15.55f, 18.31f, 16.9f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Do_disturb_alt!!
    }

private var _Do_disturb_alt: ImageVector? = null

