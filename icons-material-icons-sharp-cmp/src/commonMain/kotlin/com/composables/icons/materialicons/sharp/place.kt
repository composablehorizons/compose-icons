package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Place: ImageVector
    get() {
        if (_Place != null) return _Place!!
        
        _Place = ImageVector.Builder(
            name = "place",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(0f, -10f)
                curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                close()
            }
        }.build()
        
        return _Place!!
    }

private var _Place: ImageVector? = null

