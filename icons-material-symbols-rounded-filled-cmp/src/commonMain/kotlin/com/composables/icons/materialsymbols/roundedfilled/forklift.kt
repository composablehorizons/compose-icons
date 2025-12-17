package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Forklift: ImageVector
    get() {
        if (_Forklift != null) return _Forklift!!
        
        _Forklift = ImageVector.Builder(
            name = "forklift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -26f, 10f, -49.5f)
                reflectiveQuadTo(80f, 630f)
                verticalLineToRelative(-150f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(227f)
                quadToRelative(24f, 0f, 44f, 13f)
                reflectiveQuadToRelative(30f, 36f)
                lineToRelative(167f, 394f)
                quadToRelative(6f, 14f, 9f, 28f)
                reflectiveQuadToRelative(3f, 29f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-41f, 0f, -75.5f, -21.5f)
                reflectiveQuadTo(413f, 760f)
                horizontalLineTo(273f)
                quadToRelative(-13f, 36f, -44f, 58f)
                reflectiveQuadToRelative(-69f, 22f)
                close()
                moveToRelative(720f, -40f)
                horizontalLineTo(760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 800f)
                close()
                moveToRelative(-720f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(380f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 700f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 640f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(540f, 760f)
                close()
                moveTo(357f, 560f)
                horizontalLineToRelative(189f)
                lineTo(427f, 280f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                lineToRelative(117f, 120f)
                close()
            }
        }.build()
        
        return _Forklift!!
    }

private var _Forklift: ImageVector? = null

