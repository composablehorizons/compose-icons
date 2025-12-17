package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mode_night: ImageVector
    get() {
        if (_Mode_night != null) return _Mode_night!!
        
        _Mode_night = ImageVector.Builder(
            name = "mode_night",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9.5f, 2f)
                    curveToRelative(-1.82f, 0f, -3.53f, 0.5f, -5f, 1.35f)
                    curveToRelative(2.99f, 1.73f, 5f, 4.95f, 5f, 8.65f)
                    reflectiveCurveToRelative(-2.01f, 6.92f, -5f, 8.65f)
                    curveTo(5.97f, 21.5f, 7.68f, 22f, 9.5f, 22f)
                    curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(15.02f, 2f, 9.5f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Mode_night!!
    }

private var _Mode_night: ImageVector? = null

