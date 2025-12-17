package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Speaker_group: ImageVector
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
                moveTo(14f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.89f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveToRelative(0f, 13.5f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14f, 15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 11.5f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 16.5f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Speaker_group!!
    }

private var _Speaker_group: ImageVector? = null

