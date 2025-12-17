package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Do_not_disturb_on_total_silence: ImageVector
    get() {
        if (_Do_not_disturb_on_total_silence != null) return _Do_not_disturb_on_total_silence!!
        
        _Do_not_disturb_on_total_silence = ImageVector.Builder(
            name = "do_not_disturb_on_total_silence",
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
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                        close()
                        moveTo(12f, 6f)
                        curveToRelative(-3.3f, 0f, -6f, 2.7f, -6f, 6f)
                        reflectiveCurveToRelative(2.7f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.7f, 6f, -6f)
                        reflectiveCurveTo(15.4f, 6f, 12f, 6f)
                        close()
                        moveTo(15f, 13f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Do_not_disturb_on_total_silence!!
    }

private var _Do_not_disturb_on_total_silence: ImageVector? = null

