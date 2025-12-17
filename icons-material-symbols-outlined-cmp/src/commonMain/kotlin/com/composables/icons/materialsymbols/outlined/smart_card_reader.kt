package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Smart_card_reader: ImageVector
    get() {
        if (_Smart_card_reader != null) return _Smart_card_reader!!
        
        _Smart_card_reader = ImageVector.Builder(
            name = "smart_card_reader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 680f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 760f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(40f, -180f)
                verticalLineToRelative(-460f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-460f)
                horizontalLineTo(280f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -60f)
                horizontalLineToRelative(23f)
                quadToRelative(44f, 0f, 70.5f, -44f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -72f, -26.5f, -116f)
                reflectiveQuadTo(343f, 240f)
                horizontalLineToRelative(-23f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(240f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 480f)
                close()
                moveToRelative(-80f, 320f)
                close()
                moveToRelative(0f, -410f)
                close()
            }
        }.build()
        
        return _Smart_card_reader!!
    }

private var _Smart_card_reader: ImageVector? = null

