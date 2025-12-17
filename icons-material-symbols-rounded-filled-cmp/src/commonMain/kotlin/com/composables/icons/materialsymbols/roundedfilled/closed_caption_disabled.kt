package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Closed_caption_disabled: ImageVector
    get() {
        if (_Closed_caption_disabled != null) return _Closed_caption_disabled!!
        
        _Closed_caption_disabled = ImageVector.Builder(
            name = "closed_caption_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineTo(687f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-487f)
                lineToRelative(-65f, -65f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(280f, 600f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-127f)
                lineToRelative(-45f, -45f)
                verticalLineToRelative(1f)
                quadToRelative(-7f, 5f, -11f, 13f)
                reflectiveQuadToRelative(-4f, 18f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                close()
                moveToRelative(560f, -360f)
                verticalLineToRelative(388f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(772f, 657f)
                lineToRelative(-66f, -66f)
                quadToRelative(7f, -5f, 10.5f, -13.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                horizontalLineToRelative(-5f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-45f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(5f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                horizontalLineToRelative(20f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(5f)
                lineTo(343f, 228f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(372f, 160f)
                horizontalLineToRelative(388f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

