package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Speaker_group: ImageVector
    get() {
        if (_Speaker_group != null) return _Speaker_group!!
        
        _Speaker_group = ImageVector.Builder(
            name = "speaker_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 16.99f)
                lineToRelative(8f, 0.01f)
                verticalLineTo(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(13.99f)
                close()
                moveTo(14f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.89f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveToRelative(0f, 5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(15.93f, 16f, 14f, 16f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveTo(12.07f, 9f, 14f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.2f, 1f)
                horizontalLineTo(9.8f)
                curveTo(8.81f, 1f, 8f, 1.81f, 8f, 2.8f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 0.99f, 0.81f, 1.79f, 1.8f, 1.79f)
                lineToRelative(8.4f, 0.01f)
                curveToRelative(0.99f, 0f, 1.8f, -0.81f, 1.8f, -1.8f)
                verticalLineTo(2.8f)
                curveToRelative(0f, -0.99f, -0.81f, -1.8f, -1.8f, -1.8f)
                close()
                moveTo(18f, 17f)
                lineToRelative(-8f, -0.01f)
                verticalLineTo(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-4f, -9f)
                curveToRelative(1.1f, 0f, 2f, -0.89f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.89f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(0f, 8f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(15.93f, 9f, 14f, 9f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveTo(12.07f, 16f, 14f, 16f)
                close()
                moveToRelative(0f, -5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(14.83f, 14f, 14f, 14f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6f, 5f)
                horizontalLineTo(4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Speaker_group!!
    }

private var _Speaker_group: ImageVector? = null

