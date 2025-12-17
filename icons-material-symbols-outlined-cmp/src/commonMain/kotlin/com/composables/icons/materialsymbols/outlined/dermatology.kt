package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Dermatology: ImageVector
    get() {
        if (_Dermatology != null) return _Dermatology!!
        
        _Dermatology = ImageVector.Builder(
            name = "dermatology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-280f)
                horizontalLineTo(680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineTo(160f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(320f, -240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -109f, 25f, -215f)
                reflectiveQuadToRelative(109f, -175f)
                quadToRelative(13f, -11f, 29f, -9.5f)
                reflectiveQuadToRelative(27f, 14.5f)
                quadToRelative(11f, 13f, 9.5f, 29f)
                reflectiveQuadTo(625f, 151f)
                quadToRelative(-70f, 59f, -87.5f, 148f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(230f, 620f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(260f, 590f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(230f, 560f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(200f, 590f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 620f)
                close()
                moveToRelative(40f, 100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(300f, 690f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(270f, 660f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 690f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 720f)
                close()
                moveToRelative(460f, -100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 590f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 560f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(700f, 590f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(730f, 620f)
                close()
                moveTo(160f, 760f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Dermatology!!
    }

private var _Dermatology: ImageVector? = null

