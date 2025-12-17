package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hls: ImageVector
    get() {
        if (_Hls != null) return _Hls!!
        
        _Hls = ImageVector.Builder(
            name = "hls",
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
                    moveTo(10.75f, 9f)
                    curveTo(10.34f, 9f, 10f, 9.34f, 10f, 9.75f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.25f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                    horizontalLineTo(11.5f)
                    verticalLineTo(9.75f)
                    curveTo(11.5f, 9.34f, 11.16f, 9f, 10.75f, 9f)
                    close()
                    moveTo(19.04f, 10.5f)
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
                    curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(-1f)
                    lineTo(19.04f, 10.5f)
                    close()
                    moveTo(8f, 9.75f)
                    curveTo(8f, 9.34f, 7.66f, 9f, 7.25f, 9f)
                    reflectiveCurveTo(6.5f, 9.34f, 6.5f, 9.75f)
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
                    verticalLineTo(9.75f)
                    close()
                }
            }
        }.build()
        
        return _Hls!!
    }

private var _Hls: ImageVector? = null

