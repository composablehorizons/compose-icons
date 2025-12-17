package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Local_activity: ImageVector
    get() {
        if (_Local_activity != null) return _Local_activity!!
        
        _Local_activity = ImageVector.Builder(
            name = "local_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 640f)
                lineToRelative(112f, -84f)
                lineToRelative(110f, 84f)
                lineToRelative(-42f, -136f)
                lineToRelative(112f, -88f)
                horizontalLineTo(524f)
                lineToRelative(-44f, -136f)
                lineToRelative(-44f, 136f)
                horizontalLineTo(300f)
                lineToRelative(110f, 88f)
                lineToRelative(-42f, 136f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -11f, 7f, -19f)
                reflectiveQuadToRelative(18f, -10f)
                quadToRelative(24f, -8f, 39.5f, -29f)
                reflectiveQuadToRelative(15.5f, -47f)
                quadToRelative(0f, -26f, -15.5f, -47f)
                reflectiveQuadTo(105f, 404f)
                quadToRelative(-11f, -2f, -18f, -10f)
                reflectiveQuadToRelative(-7f, -19f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(135f)
                quadToRelative(0f, 11f, -7f, 19f)
                reflectiveQuadToRelative(-18f, 10f)
                quadToRelative(-24f, 8f, -39.5f, 29f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 26f, 15.5f, 47f)
                reflectiveQuadToRelative(39.5f, 29f)
                quadToRelative(11f, 2f, 18f, 10f)
                reflectiveQuadToRelative(7f, 19f)
                verticalLineToRelative(135f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-102f)
                quadToRelative(-37f, -22f, -58.5f, -58.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -43f, 21.5f, -79.5f)
                reflectiveQuadTo(800f, 342f)
                verticalLineToRelative(-102f)
                horizontalLineTo(160f)
                verticalLineToRelative(102f)
                quadToRelative(37f, 22f, 58.5f, 58.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 43f, -21.5f, 79.5f)
                reflectiveQuadTo(160f, 618f)
                verticalLineToRelative(102f)
                close()
                moveToRelative(320f, -240f)
                close()
            }
        }.build()
        
        return _Local_activity!!
    }

private var _Local_activity: ImageVector? = null

