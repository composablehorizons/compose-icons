package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Departure_board: ImageVector
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
                moveTo(9.29f, 6f)
                horizontalLineTo(9f)
                curveToRelative(-3.69f, 0f, -5.11f, 0.46f, -5.66f, 0.99f)
                horizontalLineToRelative(5.74f)
                curveToRelative(0.05f, -0.33f, 0.12f, -0.67f, 0.21f, -0.99f)
                close()
                moveTo(3f, 14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.37f, 0.21f, 0.62f, 0.34f, 0.73f)
                lineToRelative(0.29f, 0.27f)
                horizontalLineToRelative(10.74f)
                lineToRelative(0.29f, -0.27f)
                curveToRelative(0.13f, -0.11f, 0.34f, -0.36f, 0.34f, -0.73f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-0.94f, -0.13f, -1.81f, -0.45f, -2.59f, -0.92f)
                horizontalLineTo(3f)
                close()
                moveToRelative(2.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(4.67f, 15f, 5.5f, 15f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(6.33f, 18f, 5.5f, 18f)
                close()
                moveToRelative(8.5f, -1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 1f)
                curveToRelative(-2.39f, 0f, -4.49f, 1.2f, -5.75f, 3.02f)
                curveTo(9.84f, 4.01f, 9.43f, 4f, 9f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.88f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineTo(22f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1f, -1.34f, 1f, -2.22f)
                verticalLineToRelative(-3.08f)
                curveToRelative(3.39f, -0.49f, 6f, -3.39f, 6f, -6.92f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(0.29f)
                curveToRelative(-0.09f, 0.32f, -0.16f, 0.66f, -0.21f, 0.99f)
                horizontalLineTo(3.34f)
                curveTo(3.89f, 6.46f, 5.31f, 6f, 9f, 6f)
                close()
                moveTo(3f, 8.99f)
                horizontalLineToRelative(6.08f)
                curveToRelative(0.16f, 1.11f, 0.57f, 2.13f, 1.18f, 3.01f)
                horizontalLineTo(3f)
                verticalLineTo(8.99f)
                close()
                moveTo(15f, 18f)
                curveToRelative(0f, 0.37f, -0.21f, 0.62f, -0.34f, 0.73f)
                lineToRelative(-0.29f, 0.27f)
                horizontalLineTo(3.63f)
                lineToRelative(-0.29f, -0.27f)
                curveTo(3.21f, 18.62f, 3f, 18.37f, 3f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9.41f)
                curveToRelative(0.78f, 0.47f, 1.65f, 0.79f, 2.59f, 0.92f)
                verticalLineTo(18f)
                close()
                moveToRelative(1f, -5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveToRelative(0.5f, -9f)
                horizontalLineTo(15f)
                verticalLineToRelative(5f)
                lineToRelative(3.62f, 2.16f)
                lineToRelative(0.75f, -1.23f)
                lineToRelative(-2.87f, -1.68f)
                close()
            }
        }.build()
        
        return _Departure_board!!
    }

private var _Departure_board: ImageVector? = null

