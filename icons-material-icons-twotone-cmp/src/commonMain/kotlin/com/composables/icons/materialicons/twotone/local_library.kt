package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_library: ImageVector
    get() {
        if (_Local_library != null) return _Local_library!!
        
        _Local_library = ImageVector.Builder(
            name = "local_library",
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
                moveTo(19f, 17.13f)
                verticalLineToRelative(-6.95f)
                curveToRelative(-2.1f, 0.38f, -4.05f, 1.35f, -5.64f, 2.83f)
                lineTo(12f, 14.28f)
                lineToRelative(-1.36f, -1.27f)
                curveTo(9.05f, 11.53f, 7.1f, 10.56f, 5f, 10.18f)
                verticalLineToRelative(6.95f)
                curveToRelative(2.53f, 0.34f, 4.94f, 1.3f, 7f, 2.83f)
                curveToRelative(2.07f, -1.52f, 4.47f, -2.49f, 7f, -2.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 5f)
                arcTo(2f, 2f, 0f, false, true, 12f, 7f)
                arcTo(2f, 2f, 0f, false, true, 10f, 5f)
                arcTo(2f, 2f, 0f, false, true, 14f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(8f, 2.79f, 8f, 5f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveToRelative(-6f, 0f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(3f, 19f)
                curveToRelative(3.48f, 0f, 6.64f, 1.35f, 9f, 3.55f)
                curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9f, -3.55f)
                verticalLineTo(8f)
                curveToRelative(-3.48f, 0f, -6.64f, 1.35f, -9f, 3.55f)
                curveTo(9.64f, 9.35f, 6.48f, 8f, 3f, 8f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(2f, -8.82f)
                curveToRelative(2.1f, 0.38f, 4.05f, 1.35f, 5.64f, 2.83f)
                lineTo(12f, 14.28f)
                lineToRelative(1.36f, -1.27f)
                curveToRelative(1.59f, -1.48f, 3.54f, -2.45f, 5.64f, -2.83f)
                verticalLineToRelative(6.95f)
                curveToRelative(-2.53f, 0.34f, -4.93f, 1.3f, -7f, 2.82f)
                curveToRelative(-2.06f, -1.52f, -4.47f, -2.49f, -7f, -2.83f)
                verticalLineToRelative(-6.94f)
                close()
            }
        }.build()
        
        return _Local_library!!
    }

private var _Local_library: ImageVector? = null

