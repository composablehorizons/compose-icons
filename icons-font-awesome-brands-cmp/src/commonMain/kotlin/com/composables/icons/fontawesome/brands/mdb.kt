package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Mdb: ImageVector
    get() {
        if (_Mdb != null) return _Mdb!!
        
        _Mdb = ImageVector.Builder(
            name = "mdb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.37f, 160.41f)
                lineTo(7f, 352f)
                horizontalLineToRelative(43.91f)
                lineToRelative(5.59f, -79.83f)
                lineTo(84.43f, 352f)
                horizontalLineToRelative(44.71f)
                lineToRelative(25.54f, -77.43f)
                lineToRelative(4.79f, 77.43f)
                horizontalLineTo(205f)
                lineToRelative(-12.79f, -191.59f)
                horizontalLineTo(146.7f)
                lineTo(106f, 277.74f)
                lineTo(63.67f, 160.41f)
                close()
                moveToRelative(281f, 0f)
                horizontalLineToRelative(-47.9f)
                verticalLineTo(352f)
                horizontalLineToRelative(47.9f)
                reflectiveCurveToRelative(95f, 0.8f, 94.2f, -95.79f)
                curveToRelative(-0.78f, -94.21f, -94.18f, -95.78f, -94.18f, -95.78f)
                close()
                moveToRelative(-1.2f, 146.46f)
                verticalLineTo(204.78f)
                reflectiveCurveToRelative(46f, 4.27f, 46.8f, 50.57f)
                reflectiveCurveToRelative(-46.78f, 51.54f, -46.78f, 51.54f)
                close()
                moveToRelative(238.29f, -74.24f)
                arcToRelative(56.16f, 56.16f, 0f, false, false, 8f, -38.31f)
                curveToRelative(-5.34f, -35.76f, -55.08f, -34.32f, -55.08f, -34.32f)
                horizontalLineToRelative(-51.9f)
                verticalLineToRelative(191.58f)
                horizontalLineTo(482f)
                reflectiveCurveToRelative(87f, 4.79f, 87f, -63.85f)
                curveToRelative(0f, -43.14f, -33.52f, -55.08f, -33.52f, -55.08f)
                close()
                moveToRelative(-51.9f, -31.94f)
                reflectiveCurveToRelative(13.57f, -1.59f, 16f, 9.59f)
                curveToRelative(1.43f, 6.66f, -4f, 12f, -4f, 12f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-21.57f)
                close()
                moveToRelative(-0.1f, 109.46f)
                lineToRelative(0.1f, -24.92f)
                verticalLineTo(267f)
                horizontalLineToRelative(0.08f)
                reflectiveCurveToRelative(41.58f, -4.73f, 41.19f, 22.43f)
                curveToRelative(-0.33f, 25.65f, -41.35f, 20.74f, -41.35f, 20.74f)
                close()
            }
        }.build()
        
        return _Mdb!!
    }

private var _Mdb: ImageVector? = null

