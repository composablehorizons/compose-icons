package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wc: ImageVector
    get() {
        if (_Wc != null) return _Wc!!
        
        _Wc = ImageVector.Builder(
            name = "wc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0.01f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 21f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.5f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(18f, 21f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.68f, 0f, 1.16f, -0.67f, 0.95f, -1.32f)
                lineToRelative(-2.1f, -6.31f)
                curveTo(18.18f, 7.55f, 17.42f, 7f, 16.56f, 7f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.86f, 0f, -1.63f, 0.55f, -1.9f, 1.37f)
                lineToRelative(-2.1f, 6.31f)
                curveToRelative(-0.22f, 0.65f, 0.26f, 1.32f, 0.95f, 1.32f)
                horizontalLineTo(15f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(7.5f, 6f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                reflectiveCurveToRelative(-0.89f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.89f, -2f, 2f)
                reflectiveCurveToRelative(0.89f, 2f, 2f, 2f)
                close()
                moveToRelative(9f, 0f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                reflectiveCurveToRelative(-0.89f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.89f, -2f, 2f)
                reflectiveCurveToRelative(0.89f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Wc!!
    }

private var _Wc: ImageVector? = null

