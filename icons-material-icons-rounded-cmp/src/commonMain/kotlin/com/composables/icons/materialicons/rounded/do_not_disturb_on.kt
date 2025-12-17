package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Do_not_disturb_on: ImageVector
    get() {
        if (_Do_not_disturb_on != null) return _Do_not_disturb_on!!
        
        _Do_not_disturb_on = ImageVector.Builder(
            name = "do_not_disturb_on",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(16f, 13f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        lineToRelative(0f, 0f)
                        curveTo(17f, 12.55f, 16.55f, 13f, 16f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Do_not_disturb_on!!
    }

private var _Do_not_disturb_on: ImageVector? = null

