package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Soap: ImageVector
    get() {
        if (_Soap != null) return _Soap!!
        
        _Soap = ImageVector.Builder(
            name = "soap",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.25f, 6f)
                    curveTo(14.66f, 6f, 15f, 6.34f, 15f, 6.75f)
                    reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f)
                    reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f)
                    reflectiveCurveTo(13.84f, 6f, 14.25f, 6f)
                    moveTo(14.25f, 4.5f)
                    curveTo(13.01f, 4.5f, 12f, 5.51f, 12f, 6.75f)
                    reflectiveCurveTo(13.01f, 9f, 14.25f, 9f)
                    reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f)
                    reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f)
                    lineTo(14.25f, 4.5f)
                    close()
                    moveTo(20f, 5.5f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    reflectiveCurveTo(20.28f, 6.5f, 20f, 6.5f)
                    reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6f)
                    reflectiveCurveTo(19.72f, 5.5f, 20f, 5.5f)
                    moveTo(20f, 4f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(21.1f, 4f, 20f, 4f)
                    lineTo(20f, 4f)
                    close()
                    moveTo(18f, 2.5f)
                    curveTo(18f, 3.33f, 17.33f, 4f, 16.5f, 4f)
                    curveTo(15.67f, 4f, 15f, 3.33f, 15f, 2.5f)
                    reflectiveCurveTo(15.67f, 1f, 16.5f, 1f)
                    curveTo(17.33f, 1f, 18f, 1.67f, 18f, 2.5f)
                    close()
                    moveTo(1.94f, 11.79f)
                    curveTo(1.34f, 12.35f, 1f, 13.14f, 1f, 13.97f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    lineToRelative(13.68f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(12.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(7.18f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(12.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(8.18f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(12.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(6.18f, 0f)
                    curveToRelative(0.65f, 0f, 1.25f, -0.47f, 1.32f, -1.12f)
                    curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f)
                    horizontalLineTo(8.86f)
                    lineToRelative(1.49f, -2.61f)
                    curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f)
                    curveToRelative(0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f)
                    lineTo(9.81f, 5.71f)
                    curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f)
                    lineTo(1.94f, 11.79f)
                    close()
                }
            }
        }.build()
        
        return _Soap!!
    }

private var _Soap: ImageVector? = null

