package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tv_guide: ImageVector
    get() {
        if (_Tv_guide != null) return _Tv_guide!!
        
        _Tv_guide = ImageVector.Builder(
            name = "tv_guide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(120f, -440f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(70f)
                lineToRelative(81f, 216f)
                quadToRelative(4f, 11f, 13.5f, 17.5f)
                reflectiveQuadTo(586f, 640f)
                horizontalLineToRelative(28f)
                quadToRelative(12f, 0f, 21.5f, -6.5f)
                reflectiveQuadTo(649f, 616f)
                lineToRelative(88f, -234f)
                quadToRelative(8f, -23f, -5.5f, -42.5f)
                reflectiveQuadTo(694f, 320f)
                quadToRelative(-15f, 0f, -27.5f, 9f)
                reflectiveQuadTo(649f, 352f)
                lineToRelative(-49f, 148f)
                lineToRelative(-51f, -153f)
                quadToRelative(-4f, -12f, -14.5f, -19.5f)
                reflectiveQuadTo(511f, 320f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 400f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Tv_guide!!
    }

private var _Tv_guide: ImageVector? = null

