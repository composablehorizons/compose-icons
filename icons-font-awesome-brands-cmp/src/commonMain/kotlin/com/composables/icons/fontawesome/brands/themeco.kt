package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Themeco: ImageVector
    get() {
        if (_Themeco != null) return _Themeco!!
        
        _Themeco = ImageVector.Builder(
            name = "themeco",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(202.9f, 8.43f)
                curveToRelative(9.9f, -5.73f, 26f, -5.82f, 35.95f, -0.21f)
                lineTo(430f, 115.85f)
                curveToRelative(10f, 5.6f, 18f, 19.44f, 18f, 30.86f)
                verticalLineTo(364f)
                curveToRelative(0f, 11.44f, -8.06f, 25.29f, -18f, 31f)
                lineTo(238.81f, 503.74f)
                curveToRelative(-9.93f, 5.66f, -26f, 5.57f, -35.85f, -0.21f)
                lineTo(17.86f, 395.12f)
                curveTo(8f, 389.34f, 0f, 375.38f, 0f, 364f)
                verticalLineTo(146.71f)
                curveToRelative(0f, -11.44f, 8f, -25.36f, 17.91f, -31.08f)
                close()
                moveToRelative(-77.4f, 199.83f)
                curveToRelative(-15.94f, 0f, -31.89f, 0.14f, -47.83f, 0.14f)
                verticalLineToRelative(101.45f)
                horizontalLineTo(96.8f)
                verticalLineTo(280f)
                horizontalLineToRelative(28.7f)
                curveToRelative(49.71f, 0f, 49.56f, -71.74f, 0f, -71.74f)
                close()
                moveToRelative(140.14f, 100.29f)
                lineToRelative(-30.73f, -34.64f)
                curveToRelative(37f, -7.51f, 34.8f, -65.23f, -10.87f, -65.51f)
                curveToRelative(-16.09f, 0f, -32.17f, -0.14f, -48.26f, -0.14f)
                verticalLineToRelative(101.59f)
                horizontalLineToRelative(19.13f)
                verticalLineToRelative(-33.91f)
                horizontalLineToRelative(18.41f)
                lineToRelative(29.56f, 33.91f)
                horizontalLineToRelative(22.76f)
                close()
                moveToRelative(-41.59f, -82.32f)
                curveToRelative(23.34f, 0f, 23.26f, 32.46f, 0f, 32.46f)
                horizontalLineToRelative(-29.13f)
                verticalLineToRelative(-32.46f)
                close()
                moveToRelative(-95.56f, -1.6f)
                curveToRelative(21.18f, 0f, 21.11f, 38.85f, 0f, 38.85f)
                horizontalLineTo(96.18f)
                verticalLineToRelative(-38.84f)
                close()
                moveToRelative(192.65f, -18.25f)
                curveToRelative(-68.46f, 0f, -71f, 105.8f, 0f, 105.8f)
                curveToRelative(69.48f, -0.01f, 69.41f, -105.8f, 0f, -105.8f)
                close()
                moveToRelative(0f, 17.39f)
                curveToRelative(44.12f, 0f, 44.8f, 70.86f, 0f, 70.86f)
                reflectiveCurveToRelative(-44.43f, -70.86f, 0f, -70.86f)
                close()
            }
        }.build()
        
        return _Themeco!!
    }

private var _Themeco: ImageVector? = null

