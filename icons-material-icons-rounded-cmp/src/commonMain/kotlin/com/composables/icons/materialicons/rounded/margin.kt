package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Margin: ImageVector
    get() {
        if (_Margin != null) return _Margin!!
        
        _Margin = ImageVector.Builder(
            name = "margin",
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
                    moveTo(3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    close()
                    moveTo(9f, 8f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveTo(7f, 8.55f, 7f, 8f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveTo(9f, 7.45f, 9f, 8f)
                    close()
                    moveTo(13f, 8f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveTo(13f, 7.45f, 13f, 8f)
                    close()
                    moveTo(17f, 8f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    curveTo(16.55f, 7f, 17f, 7.45f, 17f, 8f)
                    close()
                    moveTo(17f, 12f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    curveTo(16.55f, 11f, 17f, 11.45f, 17f, 12f)
                    close()
                    moveTo(13f, 12f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveTo(13f, 11.45f, 13f, 12f)
                    close()
                    moveTo(9f, 12f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveTo(9f, 11.45f, 9f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Margin!!
    }

private var _Margin: ImageVector? = null

