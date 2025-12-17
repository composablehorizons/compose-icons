package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Medical_information: ImageVector
    get() {
        if (_Medical_information != null) return _Medical_information!!
        
        _Medical_information = ImageVector.Builder(
            name = "medical_information",
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
                    moveTo(20f, 7f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-2f)
                    curveTo(9.9f, 2f, 9f, 2.9f, 9f, 4f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(9f)
                    curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                    close()
                    moveTo(11f, 4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(7f, 16f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(16f)
                    close()
                    moveTo(13.75f, 14.5f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(13.34f, 13f, 13.75f, 13f)
                    horizontalLineToRelative(4.5f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineTo(13.75f)
                    close()
                    moveTo(13.75f, 17.5f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(13.34f, 16f, 13.75f, 16f)
                    horizontalLineToRelative(2.5f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineTo(13.75f)
                    close()
                }
            }
        }.build()
        
        return _Medical_information!!
    }

private var _Medical_information: ImageVector? = null

