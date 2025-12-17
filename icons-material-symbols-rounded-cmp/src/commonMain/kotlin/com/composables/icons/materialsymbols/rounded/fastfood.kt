package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fastfood: ImageVector
    get() {
        if (_Fastfood != null) return _Fastfood!!
        
        _Fastfood = ImageVector.Builder(
            name = "fastfood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(533f, 520f)
                quadToRelative(-32f, -45f, -84.5f, -62.5f)
                reflectiveQuadTo(340f, 440f)
                quadToRelative(-56f, 0f, -108.5f, 17.5f)
                reflectiveQuadTo(147f, 520f)
                horizontalLineToRelative(386f)
                close()
                moveTo(340f, 360f)
                quadToRelative(46f, 0f, 93.5f, 11.5f)
                reflectiveQuadToRelative(88f, 35.5f)
                quadToRelative(40.5f, 24f, 69.5f, 60f)
                reflectiveQuadToRelative(39f, 85f)
                quadToRelative(4f, 19f, -8f, 33.5f)
                reflectiveQuadTo(591f, 600f)
                horizontalLineTo(89f)
                quadToRelative(-19f, 0f, -31f, -14.5f)
                reflectiveQuadTo(50f, 552f)
                quadToRelative(10f, -49f, 39.5f, -85f)
                reflectiveQuadToRelative(70f, -60f)
                quadToRelative(40.5f, -24f, 87.5f, -35.5f)
                reflectiveQuadToRelative(93f, -11.5f)
                close()
                moveTo(80f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 680f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 760f)
                horizontalLineTo(80f)
                close()
                moveTo(788f, 920f)
                horizontalLineToRelative(-28f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineToRelative(16f)
                lineToRelative(56f, -560f)
                horizontalLineTo(488f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(448f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(488f, 200f)
                horizontalLineToRelative(152f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(156f)
                quadToRelative(18f, 0f, 30f, 13f)
                reflectiveQuadToRelative(10f, 31f)
                lineTo(854f, 862f)
                quadToRelative(-3f, 25f, -22f, 41.5f)
                reflectiveQuadTo(788f, 920f)
                close()
                moveToRelative(-68f, -80f)
                horizontalLineToRelative(56f)
                horizontalLineToRelative(-56f)
                close()
                moveTo(80f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 840f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(260f, -400f)
                close()
            }
        }.build()
        
        return _Fastfood!!
    }

private var _Fastfood: ImageVector? = null

