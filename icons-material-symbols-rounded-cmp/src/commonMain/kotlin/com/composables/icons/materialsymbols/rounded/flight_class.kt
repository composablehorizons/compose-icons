package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flight_class: ImageVector
    get() {
        if (_Flight_class != null) return _Flight_class!!
        
        _Flight_class = ImageVector.Builder(
            name = "flight_class",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 520f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(480f, 440f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(560f, 160f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 520f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveTo(380f, 720f)
                quadToRelative(-27f, 0f, -48f, -15.5f)
                reflectiveQuadTo(303f, 663f)
                lineTo(203f, 331f)
                quadToRelative(-2f, -5f, -2.5f, -11f)
                reflectiveQuadToRelative(-0.5f, -12f)
                verticalLineToRelative(-108f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(120f)
                lineToRelative(100f, 320f)
                horizontalLineToRelative(300f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 720f)
                horizontalLineTo(380f)
                close()
                moveToRelative(-20f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 760f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(360f)
                close()
                moveToRelative(200f, -600f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Flight_class!!
    }

private var _Flight_class: ImageVector? = null

