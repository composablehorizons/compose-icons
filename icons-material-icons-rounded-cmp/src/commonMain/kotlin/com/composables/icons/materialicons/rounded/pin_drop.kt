package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pin_drop: ImageVector
    get() {
        if (_Pin_drop != null) return _Pin_drop!!
        
        _Pin_drop = ImageVector.Builder(
            name = "pin_drop",
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
                        moveTo(6f, 20f)
                        horizontalLineToRelative(12f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        horizontalLineTo(6f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveTo(5.45f, 20f, 6f, 20f)
                        close()
                        moveTo(12f, 7f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveTo(13.1f, 7f, 12f, 7f)
                        close()
                        moveTo(12f, 2f)
                        curveToRelative(3.27f, 0f, 7f, 2.46f, 7f, 7.15f)
                        curveToRelative(0f, 2.98f, -2.13f, 6.12f, -6.39f, 9.39f)
                        curveToRelative(-0.36f, 0.28f, -0.86f, 0.28f, -1.22f, 0f)
                        curveTo(7.13f, 15.26f, 5f, 12.13f, 5f, 9.15f)
                        curveTo(5f, 4.46f, 8.73f, 2f, 12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pin_drop!!
    }

private var _Pin_drop: ImageVector? = null

