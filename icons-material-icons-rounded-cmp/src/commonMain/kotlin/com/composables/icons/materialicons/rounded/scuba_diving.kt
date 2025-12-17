package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Scuba_diving: ImageVector
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
                    lineToRelative(3.56f, -0.95f)
                    curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.71f, -1.22f)
                    lineTo(12.9f, 6.97f)
                    curveToRelative(-0.14f, -0.53f, -0.69f, -0.85f, -1.22f, -0.71f)
                    lineTo(8.11f, 7.21f)
                    curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f)
                    lineToRelative(0f, 0f)
                    curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f)
                    close()
                    moveTo(22.52f, 2.52f)
                    curveToRelative(-0.29f, -0.29f, -0.75f, -0.29f, -1.04f, 0f)
                    lineTo(19f, 5f)
                    lineToRelative(-2f, 4f)
                    lineToRelative(-9.48f, 2.87f)
                    curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f)
                    lineTo(5.24f, 18f)
                    lineTo(3f, 21f)
                    curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                    curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                    lineTo(7f, 19f)
                    lineToRelative(1.14f, -3.14f)
                    lineToRelative(5.57f, -1.77f)
                    curveToRelative(0.19f, -0.06f, 0.38f, -0.15f, 0.54f, -0.27f)
                    lineToRelative(4.2f, -2.94f)
                    curveToRelative(0.36f, -0.25f, 0.62f, -0.61f, 0.75f, -1.02f)
                    lineTo(20.5f, 5.9f)
                    lineToRelative(2.06f, -2.38f)
                    curveTo(22.81f, 3.22f, 22.79f, 2.79f, 22.52f, 2.52f)
                    close()
                }
            }
        }.build()
        
        return _Scuba_diving!!
    }

private var _Scuba_diving: ImageVector? = null

