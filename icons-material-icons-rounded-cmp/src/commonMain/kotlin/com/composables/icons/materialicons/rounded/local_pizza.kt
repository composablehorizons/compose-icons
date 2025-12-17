package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_pizza: ImageVector
    get() {
        if (_Local_pizza != null) return _Local_pizza!!
        
        _Local_pizza = ImageVector.Builder(
            name = "local_pizza",
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
                moveTo(12f, 2f)
                curveTo(9.01f, 2f, 6.28f, 3.08f, 4.17f, 4.88f)
                curveToRelative(-0.71f, 0.61f, -0.86f, 1.65f, -0.4f, 2.46f)
                lineToRelative(7.36f, 13.11f)
                curveToRelative(0.38f, 0.68f, 1.36f, 0.68f, 1.74f, 0f)
                lineToRelative(7.36f, -13.11f)
                curveToRelative(0.46f, -0.81f, 0.31f, -1.86f, -0.4f, -2.46f)
                curveTo(17.73f, 3.09f, 14.99f, 2f, 12f, 2f)
                close()
                moveTo(7f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveToRelative(5f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Local_pizza!!
    }

private var _Local_pizza: ImageVector? = null

