package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Inactive_order: ImageVector
    get() {
        if (_Inactive_order != null) return _Inactive_order!!
        
        _Inactive_order = ImageVector.Builder(
            name = "inactive_order",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(690f, 660f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(60f, 0f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                close()
                moveToRelative(-70f, -300f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 360f)
                horizontalLineToRelative(400f)
                close()
                moveToRelative(40f, 560f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(120f, 875f)
                verticalLineToRelative(-675f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 17f, -14f, 27.5f)
                reflectiveQuadToRelative(-31f, 5.5f)
                quadToRelative(-28f, -7f, -57f, -10f)
                reflectiveQuadToRelative(-58f, -3f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                horizontalLineToRelative(244f)
                quadToRelative(-17f, 17f, -31.5f, 37f)
                reflectiveQuadTo(467f, 600f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                horizontalLineToRelative(163f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 26f, 5f, 51f)
                reflectiveQuadToRelative(13f, 50f)
                quadToRelative(5f, 11f, -4f, 17.5f)
                reflectiveQuadToRelative(-17f, -1.5f)
                lineToRelative(-3f, -3f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-32f, -32f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-32f, -32f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-32f, 32f)
                lineToRelative(-14f, 9f)
                close()
            }
        }.build()
        
        return _Inactive_order!!
    }

private var _Inactive_order: ImageVector? = null

