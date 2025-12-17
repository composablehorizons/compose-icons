package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Subway: ImageVector
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
                moveTo(9.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 8.5f, 17f)
                arcTo(1f, 1f, 0f, false, true, 7.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 9.5f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 15.5f, 17f)
                arcTo(1f, 1f, 0f, false, true, 14.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 16.5f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.01f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(17.8f, 2.8f)
                curveTo(16f, 2.09f, 13.86f, 2f, 12f, 2f)
                reflectiveCurveToRelative(-4f, 0.09f, -5.8f, 0.8f)
                curveTo(3.53f, 3.84f, 2f, 6.05f, 2f, 8.86f)
                verticalLineTo(22f)
                horizontalLineToRelative(20f)
                verticalLineTo(8.86f)
                curveToRelative(0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f)
                close()
                moveToRelative(0.2f, 12.7f)
                curveToRelative(0f, 1.54f, -1.16f, 2.79f, -2.65f, 2.96f)
                lineToRelative(1.15f, 1.16f)
                verticalLineTo(20f)
                horizontalLineToRelative(-1.67f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-2.66f)
                lineTo(9.17f, 20f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-0.38f)
                lineToRelative(1.15f, -1.16f)
                curveTo(7.16f, 18.29f, 6f, 17.04f, 6f, 15.5f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.63f, 3f, -3f, 6f, -3f)
                reflectiveCurveToRelative(6f, 0.37f, 6f, 3f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.build()
        
        return _Subway!!
    }

private var _Subway: ImageVector? = null

