package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Contact_page: ImageVector
    get() {
        if (_Contact_page != null) return _Contact_page!!
        
        _Contact_page = ImageVector.Builder(
            name = "contact_page",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(320f, 720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -24f, -13f, -44f)
                reflectiveQuadToRelative(-36f, -30f)
                quadToRelative(-26f, -11f, -54f, -17f)
                reflectiveQuadToRelative(-57f, -6f)
                quadToRelative(-29f, 0f, -57f, 6f)
                reflectiveQuadToRelative(-54f, 17f)
                quadToRelative(-23f, 10f, -36f, 30f)
                reflectiveQuadToRelative(-13f, 44f)
                verticalLineToRelative(23f)
                close()
                moveTo(800f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Contact_page!!
    }

private var _Contact_page: ImageVector? = null

