package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_car_wash: ImageVector
    get() {
        if (_Local_car_wash != null) return _Local_car_wash!!
        
        _Local_car_wash = ImageVector.Builder(
            name = "local_car_wash",
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
                moveTo(17f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.66f, -0.66f, -1.64f, -1.11f, -2.22f)
                curveToRelative(-0.2f, -0.26f, -0.59f, -0.26f, -0.79f, 0f)
                curveToRelative(-0.44f, 0.58f, -1.1f, 1.56f, -1.1f, 2.22f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveToRelative(-5f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.66f, -0.66f, -1.64f, -1.11f, -2.22f)
                curveToRelative(-0.2f, -0.26f, -0.59f, -0.26f, -0.79f, 0f)
                curveToRelative(-0.44f, 0.58f, -1.1f, 1.56f, -1.1f, 2.22f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(7f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.66f, -0.66f, -1.64f, -1.11f, -2.22f)
                curveToRelative(-0.2f, -0.26f, -0.59f, -0.26f, -0.79f, 0f)
                curveToRelative(-0.44f, 0.58f, -1.1f, 1.56f, -1.1f, 2.22f)
                curveTo(5.5f, 4.33f, 6.17f, 5f, 7f, 5f)
                close()
                moveToRelative(11.92f, 3.01f)
                curveTo(18.72f, 7.42f, 18.16f, 7f, 17.5f, 7f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.66f, 0f, -1.21f, 0.42f, -1.42f, 1.01f)
                lineToRelative(-1.97f, 5.67f)
                curveToRelative(-0.07f, 0.21f, -0.11f, 0.43f, -0.11f, 0.66f)
                verticalLineToRelative(7.16f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(6f, 22.33f, 6f, 21.5f)
                verticalLineTo(21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                lineToRelative(-1.97f, -5.67f)
                close()
                moveTo(6.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(5.67f, 15f, 6.5f, 15f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(7.33f, 18f, 6.5f, 18f)
                close()
                moveToRelative(11f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5f, 13f)
                lineToRelative(1.27f, -3.82f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.68f, 0.95f, -0.68f)
                horizontalLineToRelative(9.56f)
                curveToRelative(0.43f, 0f, 0.81f, 0.28f, 0.95f, 0.68f)
                lineTo(19f, 13f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Local_car_wash!!
    }

private var _Local_car_wash: ImageVector? = null

