package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TaxiFront: ImageVector
    get() {
        if (_TaxiFront != null) return _TaxiFront!!
        
        _TaxiFront = ImageVector.Builder(
            name = "taxi-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.862f, 5.276f)
                lineTo(3.906f, 7.19f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, 0.497f, 0.731f)
                curveToRelative(0.91f, -0.073f, 2.35f, -0.17f, 3.597f, -0.17f)
                reflectiveCurveToRelative(2.688f, 0.097f, 3.597f, 0.17f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, 0.497f, -0.731f)
                lineToRelative(-0.956f, -1.913f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.691f, 5f)
                horizontalLineTo(5.309f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.447f, 0.276f)
                moveTo(4f, 10f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(-9f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.181f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2.52f, 4.515f)
                lineToRelative(-0.792f, 1.848f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.38f, 0.404f)
                curveToRelative(-0.5f, 0.25f, -0.855f, 0.715f, -0.965f, 1.262f)
                lineTo(0.05f, 9.708f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.049f, 0.49f)
                verticalLineToRelative(0.413f)
                curveToRelative(0f, 0.814f, 0.39f, 1.543f, 1f, 1.997f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.338f)
                curveToRelative(1.292f, 0.048f, 2.745f, 0.088f, 4f, 0.088f)
                reflectiveCurveToRelative(2.708f, -0.04f, 4f, -0.088f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.892f)
                curveToRelative(0.61f, -0.454f, 1f, -1.183f, 1f, -1.997f)
                verticalLineToRelative(-0.413f)
                quadToRelative(0f, -0.248f, -0.049f, -0.49f)
                lineToRelative(-0.335f, -1.68f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.964f, -1.261f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.381f, -0.404f)
                lineToRelative(-0.792f, -1.848f)
                arcTo(2.5f, 2.5f, 0f, false, false, 11.181f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveTo(4.819f, 4f)
                horizontalLineToRelative(6.362f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.379f, 0.91f)
                lineToRelative(0.792f, 1.847f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.853f, 0.904f)
                curveToRelative(0.222f, 0.112f, 0.381f, 0.32f, 0.43f, 0.564f)
                lineToRelative(0.336f, 1.679f)
                quadToRelative(0.03f, 0.146f, 0.029f, 0.294f)
                verticalLineToRelative(0.413f)
                arcToRelative(1.48f, 1.48f, 0f, false, true, -1.408f, 1.484f)
                curveToRelative(-1.555f, 0.07f, -3.786f, 0.155f, -5.592f, 0.155f)
                reflectiveCurveToRelative(-4.037f, -0.084f, -5.592f, -0.155f)
                arcTo(1.48f, 1.48f, 0f, false, true, 1f, 10.611f)
                verticalLineToRelative(-0.413f)
                quadToRelative(0f, -0.148f, 0.03f, -0.294f)
                lineToRelative(0.335f, -1.68f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 0.43f, -0.563f)
                curveToRelative(0.383f, -0.19f, 0.685f, -0.511f, 0.853f, -0.904f)
                lineToRelative(0.792f, -1.848f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.82f, 4f)
                close()
            }
        }.build()
        
        return _TaxiFront!!
    }

private var _TaxiFront: ImageVector? = null

