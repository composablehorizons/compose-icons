package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Scuba_diving: ImageVector
    get() {
        if (_Scuba_diving != null) return _Scuba_diving!!
        
        _Scuba_diving = ImageVector.Builder(
            name = "scuba_diving",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(1f, 13f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(1f, 14.1f, 1f, 13f)
                    close()
                    moveTo(8.89f, 10.11f)
                    lineToRelative(4.53f, -1.21f)
                    lineTo(12.64f, 6f)
                    lineTo(8.11f, 7.21f)
                    curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f)
                    lineToRelative(0f, 0f)
                    curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f)
                    close()
                    moveTo(20.5f, 5.9f)
                    lineTo(23f, 3f)
                    lineToRelative(-1f, -1f)
                    lineToRelative(-3f, 3f)
                    lineToRelative(-2f, 4f)
                    lineToRelative(-9.48f, 2.87f)
                    curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f)
                    lineTo(5.24f, 18f)
                    lineTo(2.4f, 21.8f)
                    lineTo(4f, 23f)
                    lineToRelative(3f, -4f)
                    lineToRelative(1.14f, -3.14f)
                    lineTo(14f, 14f)
                    lineToRelative(5f, -3.5f)
                    lineTo(20.5f, 5.9f)
                    close()
                }
            }
        }.build()
        
        return _Scuba_diving!!
    }

private var _Scuba_diving: ImageVector? = null

