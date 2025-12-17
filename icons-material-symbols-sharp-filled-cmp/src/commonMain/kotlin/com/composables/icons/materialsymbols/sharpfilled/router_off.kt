package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Router_off: ImageVector
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
                horizontalLineToRelative(160f)
                verticalLineToRelative(206f)
                close()
                moveTo(791f, 905f)
                lineToRelative(-65f, -65f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(286f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-6f)
                lineToRelative(-74f, -74f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Router_off!!
    }

private var _Router_off: ImageVector? = null

