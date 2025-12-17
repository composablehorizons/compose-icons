package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Contact_page: ImageVector
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
                quadToRelative(-26f, -11f, -53.5f, -17f)
                reflectiveQuadToRelative(-57.5f, -6f)
                quadToRelative(-30f, 0f, -57.5f, 6f)
                reflectiveQuadTo(369f, 623f)
                quadToRelative(-23f, 10f, -36f, 30f)
                reflectiveQuadToRelative(-13f, 44f)
                verticalLineToRelative(23f)
                close()
                moveTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-446f)
                lineTo(526f, 160f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(-480f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Contact_page!!
    }

private var _Contact_page: ImageVector? = null

