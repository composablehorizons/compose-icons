package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mode_standby: ImageVector
    get() {
        if (_Mode_standby != null) return _Mode_standby!!
        
        _Mode_standby = ImageVector.Builder(
            name = "mode_standby",
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
                        curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                        reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                        reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                        close()
                        moveTo(15f, 12f)
                        curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                        reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                        reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                        reflectiveCurveTo(15f, 10.34f, 15f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mode_standby!!
    }

private var _Mode_standby: ImageVector? = null

