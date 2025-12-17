package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Local_pizza: ImageVector
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
                curveTo(8.43f, 2f, 5.23f, 3.54f, 3.01f, 6f)
                lineTo(12f, 22f)
                lineToRelative(8.99f, -16f)
                curveTo(18.78f, 3.55f, 15.57f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 15.92f)
                lineTo(5.51f, 6.36f)
                curveTo(7.32f, 4.85f, 9.62f, 4f, 12f, 4f)
                reflectiveCurveToRelative(4.68f, 0.85f, 6.49f, 2.36f)
                lineTo(12f, 17.92f)
                close()
                moveTo(9f, 5.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(8.17f, 8.5f, 9f, 8.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(9.82f, 5.5f, 9f, 5.5f)
                close()
                moveToRelative(1.5f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.68f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Local_pizza!!
    }

private var _Local_pizza: ImageVector? = null

