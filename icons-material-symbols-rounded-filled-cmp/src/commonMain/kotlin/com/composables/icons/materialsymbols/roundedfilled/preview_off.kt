package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Preview_off: ImageVector
    get() {
        if (_Preview_off != null) return _Preview_off!!
        
        _Preview_off = ImageVector.Builder(
            name = "preview_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-82f, 0f, -146.5f, -44.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(20f, -48f, 56f, -84f)
                reflectiveQuadToRelative(84f, -56f)
                lineToRelative(47f, 47f)
                quadToRelative(-39f, 11f, -70f, 34.5f)
                reflectiveQuadTo(306f, 520f)
                quadToRelative(26f, 47f, 72f, 73.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(30f, 0f, 58f, -8f)
                reflectiveQuadToRelative(51f, -23f)
                lineToRelative(43f, 43f)
                quadToRelative(-32f, 23f, -70.5f, 35.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(209f, -104f)
                lineToRelative(-43f, -43f)
                quadToRelative(2f, -3f, 4f, -6.5f)
                reflectiveQuadToRelative(4f, -6.5f)
                quadToRelative(-18f, -33f, -47f, -56.5f)
                reflectiveQuadTo(542f, 429f)
                lineToRelative(-69f, -69f)
                quadToRelative(82f, 0f, 150f, 44.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(-6f, 15f, -13.5f, 29f)
                reflectiveQuadTo(689f, 576f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-527f)
                lineToRelative(-37f, -37f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-36f, -36f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(447f)
                lineTo(200f, 313f)
                verticalLineToRelative(447f)
                close()
                moveToRelative(640f, -33f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-327f)
                horizontalLineTo(433f)
                lineTo(233f, 120f)
                horizontalLineToRelative(527f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(527f)
                close()
            }
        }.build()
        
        return _Preview_off!!
    }

private var _Preview_off: ImageVector? = null

