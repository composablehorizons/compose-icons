package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pinch_zoom_out: ImageVector
    get() {
        if (_Pinch_zoom_out != null) return _Pinch_zoom_out!!
        
        _Pinch_zoom_out = ImageVector.Builder(
            name = "pinch_zoom_out",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(142f, 420f)
                horizontalLineToRelative(68f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(240f, 450f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(210f, 480f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 440f)
                verticalLineToRelative(-130f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(70f, 280f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(100f, 310f)
                verticalLineToRelative(68f)
                lineToRelative(98f, -98f)
                quadToRelative(9f, -9f, 21f, -9f)
                reflectiveQuadToRelative(21f, 9f)
                quadToRelative(9f, 9f, 9f, 21f)
                reflectiveQuadToRelative(-9f, 21f)
                lineToRelative(-98f, 98f)
                close()
                moveToRelative(278f, -278f)
                lineToRelative(-98f, 98f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                lineToRelative(98f, -98f)
                horizontalLineToRelative(-68f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(280f, 70f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(310f, 40f)
                horizontalLineToRelative(130f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 80f)
                verticalLineToRelative(130f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(450f, 240f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(420f, 210f)
                verticalLineToRelative(-68f)
                close()
                moveTo(593f, 920f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(332f, 708f)
                quadToRelative(-12f, -12f, -11f, -29.5f)
                reflectiveQuadToRelative(13f, -29.5f)
                quadToRelative(16f, -16f, 37.5f, -21.5f)
                reflectiveQuadToRelative(42.5f, 0.5f)
                lineToRelative(66f, 19f)
                verticalLineToRelative(-327f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 920f)
                horizontalLineTo(593f)
                close()
            }
        }.build()
        
        return _Pinch_zoom_out!!
    }

private var _Pinch_zoom_out: ImageVector? = null

