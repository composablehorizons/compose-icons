package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hls_off: ImageVector
    get() {
        if (_Hls_off != null) return _Hls_off!!
        
        _Hls_off = ImageVector.Builder(
            name = "hls_off",
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
                    moveTo(17.83f, 15f)
                    horizontalLineToRelative(1.67f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(-1f)
                    lineToRelative(2.04f, 0f)
                    curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineTo(19f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2.04f)
                    verticalLineToRelative(0f)
                    curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f)
                    curveToRelative(-0.12f, 0f, -0.24f, 0.03f, -0.34f, 0.08f)
                    lineTo(17.83f, 15f)
                    close()
                    moveTo(19.07f, 21.9f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(4.48f, 4.48f)
                    curveTo(6.53f, 9.51f, 6.5f, 9.63f, 6.5f, 9.75f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9.75f)
                    curveTo(4.5f, 9.34f, 4.16f, 9f, 3.75f, 9f)
                    reflectiveCurveTo(3f, 9.34f, 3f, 9.75f)
                    verticalLineToRelative(4.5f)
                    curveTo(3f, 14.66f, 3.34f, 15f, 3.75f, 15f)
                    reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(12.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1.75f)
                    curveTo(6.5f, 14.66f, 6.84f, 15f, 7.25f, 15f)
                    reflectiveCurveTo(8f, 14.66f, 8f, 14.25f)
                    verticalLineToRelative(-3.42f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1.17f)
                    lineTo(19.07f, 21.9f)
                    close()
                }
            }
        }.build()
        
        return _Hls_off!!
    }

private var _Hls_off: ImageVector? = null

