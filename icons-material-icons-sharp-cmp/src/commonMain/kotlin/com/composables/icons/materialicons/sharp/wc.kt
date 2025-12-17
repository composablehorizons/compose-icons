package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wc: ImageVector
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
                moveTo(5.5f, 22f)
                verticalLineToRelative(-7.5f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(22f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(18f, 22f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                lineToRelative(-3f, -9f)
                horizontalLineToRelative(-3f)
                lineToRelative(-3f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
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

