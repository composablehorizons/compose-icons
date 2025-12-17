package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Local_gas_station: ImageVector
    get() {
        if (_Local_gas_station != null) return _Local_gas_station!!
        
        _Local_gas_station = ImageVector.Builder(
            name = "local_gas_station",
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
                moveTo(19.77f, 7.23f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-3.72f, -3.72f)
                lineTo(15f, 4.56f)
                lineToRelative(2.11f, 2.11f)
                curveToRelative(-1.05f, 0.4f, -1.76f, 1.47f, -1.58f, 2.71f)
                curveToRelative(0.16f, 1.1f, 1.1f, 1.99f, 2.2f, 2.11f)
                curveToRelative(0.47f, 0.05f, 0.88f, -0.03f, 1.27f, -0.2f)
                verticalLineToRelative(8.21f)
                horizontalLineToRelative(-2f)
                verticalLineTo(12f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.49f)
                horizontalLineToRelative(5f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f)
                close()
                moveTo(12f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(6f, 0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Local_gas_station!!
    }

private var _Local_gas_station: ImageVector? = null

