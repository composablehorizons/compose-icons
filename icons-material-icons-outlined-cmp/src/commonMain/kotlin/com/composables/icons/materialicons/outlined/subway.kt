package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Subway: ImageVector
    get() {
        if (_Subway != null) return _Subway!!
        
        _Subway = ImageVector.Builder(
            name = "subway",
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
                moveTo(17.8f, 2.8f)
                curveTo(16f, 2.09f, 13.86f, 2f, 12f, 2f)
                reflectiveCurveToRelative(-4f, 0.09f, -5.8f, 0.8f)
                curveTo(3.53f, 3.84f, 2f, 6.05f, 2f, 8.86f)
                verticalLineTo(22f)
                horizontalLineToRelative(20f)
                verticalLineTo(8.86f)
                curveToRelative(0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f)
                close()
                moveTo(9.17f, 20f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(2.66f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineTo(9.17f)
                close()
                moveToRelative(-2.16f, -6f)
                verticalLineTo(9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10f)
                close()
                moveToRelative(9.49f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveToRelative(-8f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(20f, 20f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-0.38f)
                lineToRelative(-1.15f, -1.16f)
                curveToRelative(1.49f, -0.17f, 2.65f, -1.42f, 2.65f, -2.96f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.63f, -3f, -3f, -6f, -3f)
                reflectiveCurveToRelative(-6f, 0.37f, -6f, 3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.54f, 1.16f, 2.79f, 2.65f, 2.96f)
                lineTo(7.5f, 19.62f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(8.86f)
                curveToRelative(0f, -2f, 1.01f, -3.45f, 2.93f, -4.2f)
                curveTo(8.41f, 4.08f, 10.32f, 4f, 12f, 4f)
                reflectiveCurveToRelative(3.59f, 0.08f, 5.07f, 0.66f)
                curveToRelative(1.92f, 0.75f, 2.93f, 2.2f, 2.93f, 4.2f)
                verticalLineTo(20f)
                close()
            }
        }.build()
        
        return _Subway!!
    }

private var _Subway: ImageVector? = null

