package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flight_class: ImageVector
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
                moveTo(380f, 720f)
                quadToRelative(-27f, 0f, -48f, -15.5f)
                reflectiveQuadTo(303f, 663f)
                lineTo(200f, 320f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                lineToRelative(100f, 320f)
                horizontalLineToRelative(340f)
                verticalLineToRelative(80f)
                horizontalLineTo(380f)
                close()
                moveToRelative(-60f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Flight_class!!
    }

private var _Flight_class: ImageVector? = null

