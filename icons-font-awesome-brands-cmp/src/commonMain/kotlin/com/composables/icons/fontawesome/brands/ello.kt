package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Ello: ImageVector
    get() {
        if (_Ello != null) return _Ello!!
        
        _Ello = ImageVector.Builder(
            name = "ello",
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
                moveToRelative(143.84f, 285.2f)
                curveTo(375.31f, 358.51f, 315.79f, 404.8f, 248f, 404.8f)
                reflectiveCurveToRelative(-127.31f, -46.29f, -143.84f, -111.6f)
                curveToRelative(-1.65f, -7.44f, 2.48f, -15.71f, 9.92f, -17.36f)
                curveToRelative(7.44f, -1.65f, 15.71f, 2.48f, 17.36f, 9.92f)
                curveToRelative(14.05f, 52.91f, 62f, 90.11f, 116.56f, 90.11f)
                reflectiveCurveToRelative(102.51f, -37.2f, 116.56f, -90.11f)
                curveToRelative(1.65f, -7.44f, 9.92f, -12.4f, 17.36f, -9.92f)
                curveToRelative(7.44f, 1.65f, 12.4f, 9.92f, 9.92f, 17.36f)
                close()
            }
        }.build()
        
        return _Ello!!
    }

private var _Ello: ImageVector? = null

