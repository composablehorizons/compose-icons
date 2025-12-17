package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Translate_indic: ImageVector
    get() {
        if (_Translate_indic != null) return _Translate_indic!!
        
        _Translate_indic = ImageVector.Builder(
            name = "translate_indic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476f, 880f)
                lineToRelative(182f, -480f)
                horizontalLineToRelative(84f)
                lineTo(924f, 880f)
                horizontalLineToRelative(-84f)
                lineToRelative(-43f, -122f)
                horizontalLineTo(603f)
                lineTo(560f, 880f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(152f, -192f)
                horizontalLineToRelative(144f)
                lineToRelative(-72f, -204f)
                lineToRelative(-72f, 204f)
                close()
                moveToRelative(-374f, -48f)
                quadToRelative(-66f, 0f, -123.5f, -38.5f)
                reflectiveQuadTo(44f, 498f)
                lineToRelative(72f, -36f)
                quadToRelative(21f, 42f, 58f, 70f)
                reflectiveQuadToRelative(79f, 28f)
                quadToRelative(38f, 0f, 62.5f, -23.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(260f, 400f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, -17f, -42.5f)
                reflectiveQuadTo(261f, 200f)
                quadToRelative(-23f, 0f, -41f, 15f)
                reflectiveQuadToRelative(-32f, 33f)
                lineToRelative(-63f, -49f)
                quadToRelative(26f, -32f, 60f, -55.5f)
                reflectiveQuadToRelative(77f, -23.5f)
                quadToRelative(57f, 0f, 97.5f, 40.5f)
                reflectiveQuadTo(400f, 259f)
                quadToRelative(0f, 27f, -10f, 52.5f)
                reflectiveQuadTo(361f, 357f)
                quadToRelative(10f, 10f, 18.5f, 20.5f)
                reflectiveQuadTo(396f, 400f)
                horizontalLineToRelative(124f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(116f)
                lineToRelative(-61f, 164f)
                horizontalLineTo(420f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 63f, -46f, 109.5f)
                reflectiveQuadTo(254f, 640f)
                close()
            }
        }.build()
        
        return _Translate_indic!!
    }

private var _Translate_indic: ImageVector? = null

