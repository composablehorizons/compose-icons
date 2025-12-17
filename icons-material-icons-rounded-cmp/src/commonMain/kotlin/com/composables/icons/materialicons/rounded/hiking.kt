package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hiking: ImageVector
    get() {
        if (_Hiking != null) return _Hiking!!
        
        _Hiking = ImageVector.Builder(
            name = "hiking",
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
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(18.25f, 9f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                lineToRelative(0f, 1.03f)
                curveToRelative(-1.23f, -0.37f, -2.22f, -1.17f, -2.8f, -2.18f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.41f, -0.65f, -1.11f, -1f, -1.84f, -1f)
                curveToRelative(-0.78f, 0f, -1.59f, 0.5f, -1.78f, 1.44f)
                lineTo(7.25f, 21.76f)
                curveTo(7.12f, 22.4f, 7.61f, 23f, 8.27f, 23f)
                curveToRelative(0.49f, 0f, 0.91f, -0.34f, 1.02f, -0.81f)
                lineTo(10.9f, 15f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.64f)
                curveToRelative(0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f)
                lineTo(12.9f, 13.5f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1f, 1.15f, 2.41f, 2.01f, 4f, 2.34f)
                verticalLineToRelative(9.41f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveTo(19f, 22.66f, 19f, 22.25f)
                verticalLineTo(9.75f)
                curveTo(19f, 9.34f, 18.66f, 9f, 18.25f, 9f)
                close()
                moveTo(7.43f, 13.13f)
                lineToRelative(-2.12f, -0.41f)
                curveToRelative(-0.54f, -0.11f, -0.9f, -0.63f, -0.79f, -1.17f)
                lineToRelative(0.76f, -3.93f)
                curveToRelative(0.21f, -1.08f, 1.26f, -1.79f, 2.34f, -1.58f)
                lineToRelative(1.16f, 0.23f)
                lineTo(7.43f, 13.13f)
                close()
            }
        }.build()
        
        return _Hiking!!
    }

private var _Hiking: ImageVector? = null

