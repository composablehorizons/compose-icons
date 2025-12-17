package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Megaport: ImageVector
    get() {
        if (_Megaport != null) return _Megaport!!
        
        _Megaport = ImageVector.Builder(
            name = "megaport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(214.5f, 209.6f)
                verticalLineToRelative(66.2f)
                lineToRelative(33.5f, 33.5f)
                lineToRelative(33.3f, -33.3f)
                verticalLineToRelative(-66.4f)
                lineToRelative(-33.4f, -33.4f)
                close()
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(145.1f, 414.4f)
                lineTo(367f, 441.6f)
                lineToRelative(-26f, -19.2f)
                verticalLineToRelative(-65.5f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.4f, 33.4f)
                verticalLineToRelative(65.5f)
                lineTo(248f, 441.6f)
                lineToRelative(-26.1f, -19.2f)
                verticalLineToRelative(-65.5f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.5f, 33.4f)
                verticalLineToRelative(65.5f)
                lineToRelative(-26.1f, 19.2f)
                lineToRelative(-26.1f, -19.2f)
                verticalLineToRelative(-87f)
                lineToRelative(59.5f, -59.5f)
                verticalLineTo(188f)
                lineToRelative(59.5f, -59.5f)
                verticalLineTo(52.9f)
                lineToRelative(26.1f, -19.2f)
                lineTo(274f, 52.9f)
                verticalLineToRelative(75.6f)
                lineToRelative(59.5f, 59.5f)
                verticalLineToRelative(87.6f)
                lineToRelative(59.7f, 59.7f)
                verticalLineToRelative(87.1f)
                close()
            }
        }.build()
        
        return _Megaport!!
    }

private var _Megaport: ImageVector? = null

