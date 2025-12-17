package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CarFront: ImageVector
    get() {
        if (_CarFront != null) return _CarFront!!
        
        _CarFront = ImageVector.Builder(
            name = "car-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveTo(6f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                close()
                moveTo(4.862f, 4.276f)
                lineTo(3.906f, 6.19f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, 0.497f, 0.731f)
                curveToRelative(0.91f, -0.073f, 2.35f, -0.17f, 3.597f, -0.17f)
                reflectiveCurveToRelative(2.688f, 0.097f, 3.597f, 0.17f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, 0.497f, -0.731f)
                lineToRelative(-0.956f, -1.913f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.691f, 4f)
                horizontalLineTo(5.309f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.447f, 0.276f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.52f, 3.515f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4.82f, 2f)
                horizontalLineToRelative(6.362f)
                curveToRelative(1f, 0f, 1.904f, 0.596f, 2.298f, 1.515f)
                lineToRelative(0.792f, 1.848f)
                curveToRelative(0.075f, 0.175f, 0.21f, 0.319f, 0.38f, 0.404f)
                curveToRelative(0.5f, 0.25f, 0.855f, 0.715f, 0.965f, 1.262f)
                lineToRelative(0.335f, 1.679f)
                quadToRelative(0.05f, 0.242f, 0.049f, 0.49f)
                verticalLineToRelative(0.413f)
                curveToRelative(0f, 0.814f, -0.39f, 1.543f, -1f, 1.997f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.338f)
                curveToRelative(-1.292f, 0.048f, -2.745f, 0.088f, -4f, 0.088f)
                reflectiveCurveToRelative(-2.708f, -0.04f, -4f, -0.088f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.892f)
                curveToRelative(-0.61f, -0.454f, -1f, -1.183f, -1f, -1.997f)
                verticalLineToRelative(-0.413f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0.049f, -0.49f)
                lineToRelative(0.335f, -1.68f)
                curveToRelative(0.11f, -0.546f, 0.465f, -1.012f, 0.964f, -1.261f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.381f, -0.404f)
                lineToRelative(0.792f, -1.848f)
                close()
                moveTo(4.82f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.379f, 0.91f)
                lineToRelative(-0.792f, 1.847f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.853f, 0.904f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.43f, 0.564f)
                lineTo(1.03f, 8.904f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.03f, 0.294f)
                verticalLineToRelative(0.413f)
                curveToRelative(0f, 0.796f, 0.62f, 1.448f, 1.408f, 1.484f)
                curveToRelative(1.555f, 0.07f, 3.786f, 0.155f, 5.592f, 0.155f)
                reflectiveCurveToRelative(4.037f, -0.084f, 5.592f, -0.155f)
                arcTo(1.48f, 1.48f, 0f, false, false, 15f, 9.611f)
                verticalLineToRelative(-0.413f)
                quadToRelative(0f, -0.148f, -0.03f, -0.294f)
                lineToRelative(-0.335f, -1.68f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.43f, -0.563f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.853f, -0.904f)
                lineToRelative(-0.792f, -1.848f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.18f, 3f)
                close()
            }
        }.build()
        
        return _CarFront!!
    }

private var _CarFront: ImageVector? = null

