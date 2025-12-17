package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Router_off: ImageVector
    get() {
        if (_Router_off != null) return _Router_off!!
        
        _Router_off = ImageVector.Builder(
            name = "router_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(570f, 330f)
                lineToRelative(-58f, -58f)
                quadToRelative(26f, -24f, 58f, -38f)
                reflectiveQuadToRelative(70f, -14f)
                quadToRelative(38f, 0f, 70f, 14f)
                reflectiveQuadToRelative(58f, 38f)
                lineToRelative(-58f, 58f)
                quadToRelative(-14f, -14f, -31.5f, -22f)
                reflectiveQuadToRelative(-38.5f, -8f)
                quadToRelative(-21f, 0f, -38.5f, 8f)
                reflectiveQuadTo(570f, 330f)
                close()
                moveTo(470f, 230f)
                lineToRelative(-56f, -56f)
                quadToRelative(44f, -44f, 102f, -69f)
                reflectiveQuadToRelative(124f, -25f)
                quadToRelative(66f, 0f, 124f, 25f)
                reflectiveQuadToRelative(102f, 69f)
                lineToRelative(-56f, 56f)
                quadToRelative(-33f, -33f, -76.5f, -51.5f)
                reflectiveQuadTo(640f, 160f)
                quadToRelative(-50f, 0f, -93.5f, 18.5f)
                reflectiveQuadTo(470f, 230f)
                close()
                moveToRelative(370f, 496f)
                lineTo(600f, 486f)
                verticalLineToRelative(-126f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(126f)
                close()
                moveTo(791f, 905f)
                lineToRelative(-65f, -65f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 520f)
                horizontalLineToRelative(206f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(280f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 720f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(10f, 0f, 18f, -4f)
                reflectiveQuadToRelative(13f, -11f)
                lineToRelative(-56f, -56f)
                quadToRelative(-7f, 5f, -11f, 13f)
                reflectiveQuadToRelative(-4f, 18f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 720f)
                close()
            }
        }.build()
        
        return _Router_off!!
    }

private var _Router_off: ImageVector? = null

