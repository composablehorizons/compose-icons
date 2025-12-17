package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Browse_activity: ImageVector
    get() {
        if (_Browse_activity != null) return _Browse_activity!!
        
        _Browse_activity = ImageVector.Builder(
            name = "browse_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(440f, -420f)
                close()
                moveTo(80f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                quadToRelative(11f, 0f, 21f, 6f)
                reflectiveQuadToRelative(15f, 16f)
                lineToRelative(47f, 93f)
                lineToRelative(123f, -215f)
                quadToRelative(5f, -9f, 14f, -14.5f)
                reflectiveQuadToRelative(20f, -5.5f)
                quadToRelative(11f, 0f, 21f, 5.5f)
                reflectiveQuadToRelative(15f, 16.5f)
                lineToRelative(49f, 98f)
                horizontalLineToRelative(235f)
                verticalLineToRelative(80f)
                horizontalLineTo(620f)
                quadToRelative(-11f, 0f, -21f, -5.5f)
                reflectiveQuadTo(584f, 418f)
                lineToRelative(-26f, -53f)
                lineToRelative(-123f, 215f)
                quadToRelative(-5f, 10f, -15f, 15f)
                reflectiveQuadToRelative(-21f, 5f)
                quadToRelative(-11f, 0f, -20.5f, -6f)
                reflectiveQuadTo(364f, 578f)
                lineToRelative(-69f, -138f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Browse_activity!!
    }

private var _Browse_activity: ImageVector? = null

