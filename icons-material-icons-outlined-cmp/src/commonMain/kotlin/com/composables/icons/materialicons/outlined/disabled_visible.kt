package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Disabled_visible: ImageVector
    get() {
        if (_Disabled_visible != null) return _Disabled_visible!!
        
        _Disabled_visible = ImageVector.Builder(
            name = "disabled_visible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(17f, 15f)
                curveToRelative(1.95f, 0f, 3.76f, 0.98f, 4.75f, 2.5f)
                curveTo(20.76f, 19.02f, 18.95f, 20f, 17f, 20f)
                reflectiveCurveToRelative(-3.76f, -0.98f, -4.75f, -2.5f)
                curveTo(13.24f, 15.98f, 15.05f, 15f, 17f, 15f)
                close()
                moveTo(17f, 13f)
                curveToRelative(-3.18f, 0f, -5.9f, 1.87f, -7f, 4.5f)
                curveToRelative(1.1f, 2.63f, 3.82f, 4.5f, 7f, 4.5f)
                reflectiveCurveToRelative(5.9f, -1.87f, 7f, -4.5f)
                curveTo(22.9f, 14.87f, 20.18f, 13f, 17f, 13f)
                close()
                moveTo(17f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(16.17f, 16f, 17f, 16f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.83f, 19f, 17f, 19f)
                close()
                moveTo(21.99f, 12.34f)
                curveTo(22f, 12.23f, 22f, 12.11f, 22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.17f, 3.93f, 9.43f, 8.96f, 9.95f)
                curveToRelative(-0.93f, -0.73f, -1.72f, -1.64f, -2.32f, -2.68f)
                curveTo(5.9f, 18f, 4f, 15.22f, 4f, 12f)
                curveToRelative(0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f)
                lineToRelative(5.66f, 5.66f)
                curveToRelative(0.56f, -0.4f, 1.17f, -0.73f, 1.82f, -1f)
                lineTo(7.1f, 5.69f)
                curveTo(8.45f, 4.63f, 10.15f, 4f, 12f, 4f)
                curveToRelative(4.24f, 0f, 7.7f, 3.29f, 7.98f, 7.45f)
                curveTo(20.69f, 11.67f, 21.37f, 11.97f, 21.99f, 12.34f)
                close()
            }
        }.build()
        
        return _Disabled_visible!!
    }

private var _Disabled_visible: ImageVector? = null

