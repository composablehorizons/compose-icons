package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FirstOrderAlt: ImageVector
    get() {
        if (_FirstOrderAlt != null) return _FirstOrderAlt!!
        
        _FirstOrderAlt = ImageVector.Builder(
            name = "first-order-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 488.21f)
                curveTo(115.34f, 496.21f, 7.79f, 388.66f, 7.79f, 256f)
                reflectiveCurveTo(115.34f, 15.79f, 248f, 15.79f)
                reflectiveCurveTo(488.21f, 123.34f, 488.21f, 256f)
                reflectiveCurveTo(380.66f, 496.21f, 248f, 496.21f)
                close()
                moveToRelative(0f, -459.92f)
                curveTo(126.66f, 36.29f, 28.29f, 134.66f, 28.29f, 256f)
                reflectiveCurveTo(126.66f, 475.71f, 248f, 475.71f)
                reflectiveCurveTo(467.71f, 377.34f, 467.71f, 256f)
                reflectiveCurveTo(369.34f, 36.29f, 248f, 36.29f)
                close()
                moveToRelative(0f, 431.22f)
                curveToRelative(-116.81f, 0f, -211.51f, -94.69f, -211.51f, -211.51f)
                reflectiveCurveTo(131.19f, 44.49f, 248f, 44.49f)
                reflectiveCurveTo(459.51f, 139.19f, 459.51f, 256f)
                reflectiveCurveTo(364.81f, 467.51f, 248f, 467.51f)
                close()
                moveToRelative(186.23f, -162.98f)
                arcToRelative(191.613f, 191.613f, 0f, false, true, -20.13f, 48.69f)
                lineToRelative(-74.13f, -35.88f)
                lineToRelative(61.48f, 54.82f)
                arcToRelative(193.515f, 193.515f, 0f, false, true, -37.2f, 37.29f)
                lineToRelative(-54.8f, -61.57f)
                lineToRelative(35.88f, 74.27f)
                arcToRelative(190.944f, 190.944f, 0f, false, true, -48.63f, 20.23f)
                lineToRelative(-27.29f, -78.47f)
                lineToRelative(4.79f, 82.93f)
                curveToRelative(-8.61f, 1.18f, -17.4f, 1.8f, -26.33f, 1.8f)
                reflectiveCurveToRelative(-17.72f, -0.62f, -26.33f, -1.8f)
                lineToRelative(4.76f, -82.46f)
                lineToRelative(-27.15f, 78.03f)
                arcToRelative(191.365f, 191.365f, 0f, false, true, -48.65f, -20.2f)
                lineToRelative(35.93f, -74.34f)
                lineToRelative(-54.87f, 61.64f)
                arcToRelative(193.85f, 193.85f, 0f, false, true, -37.22f, -37.28f)
                lineToRelative(61.59f, -54.9f)
                lineToRelative(-74.26f, 35.93f)
                arcToRelative(191.638f, 191.638f, 0f, false, true, -20.14f, -48.69f)
                lineToRelative(77.84f, -27.11f)
                lineToRelative(-82.23f, 4.76f)
                curveToRelative(-1.16f, -8.57f, -1.78f, -17.32f, -1.78f, -26.21f)
                curveToRelative(0f, -9f, 0.63f, -17.84f, 1.82f, -26.51f)
                lineToRelative(82.38f, 4.77f)
                lineToRelative(-77.94f, -27.16f)
                arcToRelative(191.726f, 191.726f, 0f, false, true, 20.23f, -48.67f)
                lineToRelative(74.22f, 35.92f)
                lineToRelative(-61.52f, -54.86f)
                arcToRelative(193.85f, 193.85f, 0f, false, true, 37.28f, -37.22f)
                lineToRelative(54.76f, 61.53f)
                lineToRelative(-35.83f, -74.17f)
                arcToRelative(191.49f, 191.49f, 0f, false, true, 48.65f, -20.13f)
                lineToRelative(26.87f, 77.25f)
                lineToRelative(-4.71f, -81.61f)
                curveToRelative(8.61f, -1.18f, 17.39f, -1.8f, 26.32f, -1.8f)
                reflectiveCurveToRelative(17.71f, 0.62f, 26.32f, 1.8f)
                lineToRelative(-4.74f, 82.16f)
                lineToRelative(27.05f, -77.76f)
                curveToRelative(17.27f, 4.5f, 33.6f, 11.35f, 48.63f, 20.17f)
                lineToRelative(-35.82f, 74.12f)
                lineToRelative(54.72f, -61.47f)
                arcToRelative(193.13f, 193.13f, 0f, false, true, 37.24f, 37.23f)
                lineToRelative(-61.45f, 54.77f)
                lineToRelative(74.12f, -35.86f)
                arcToRelative(191.515f, 191.515f, 0f, false, true, 20.2f, 48.65f)
                lineToRelative(-77.81f, 27.1f)
                lineToRelative(82.24f, -4.75f)
                curveToRelative(1.19f, 8.66f, 1.82f, 17.5f, 1.82f, 26.49f)
                curveToRelative(0f, 8.88f, -0.61f, 17.63f, -1.78f, 26.19f)
                lineToRelative(-82.12f, -4.75f)
                lineToRelative(77.72f, 27.09f)
                close()
            }
        }.build()
        
        return _FirstOrderAlt!!
    }

private var _FirstOrderAlt: ImageVector? = null

