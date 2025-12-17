package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Departure_board: ImageVector
    get() {
        if (_Departure_board != null) return _Departure_board!!
        
        _Departure_board = ImageVector.Builder(
            name = "departure_board",
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
                moveTo(17.34f, 1.13f)
                curveToRelative(-2.94f, -0.55f, -5.63f, 0.75f, -7.12f, 2.92f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f)
                curveTo(9.84f, 4f, 9.42f, 4f, 9f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.88f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineToRelative(1.28f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(5f, 22.33f, 5f, 21.5f)
                verticalLineTo(21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.28f)
                curveToRelative(0.61f, -0.55f, 1f, -1.34f, 1f, -2.22f)
                verticalLineToRelative(-3.08f)
                curveToRelative(3.72f, -0.54f, 6.5f, -3.98f, 5.92f, -7.97f)
                curveToRelative(-0.42f, -2.9f, -2.7f, -5.29f, -5.58f, -5.82f)
                close()
                moveTo(4.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(3.67f, 16f, 4.5f, 16f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(5.33f, 19f, 4.5f, 19f)
                close()
                moveTo(3f, 13f)
                verticalLineTo(8f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.96f, 0.81f, 3.73f, 2.11f, 5f)
                horizontalLineTo(3f)
                close()
                moveToRelative(10.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(2.5f, -6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveToRelative(-0.25f, -9f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(3.68f)
                curveToRelative(0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f)
                lineToRelative(2.52f, 1.51f)
                curveToRelative(0.34f, 0.2f, 0.78f, 0.09f, 0.98f, -0.24f)
                curveToRelative(0.21f, -0.34f, 0.1f, -0.79f, -0.25f, -0.99f)
                lineTo(16.5f, 8.25f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Departure_board!!
    }

private var _Departure_board: ImageVector? = null

