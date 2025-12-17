package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folder_managed: ImageVector
    get() {
        if (_Folder_managed != null) return _Folder_managed!!
        
        _Folder_managed = ImageVector.Builder(
            name = "folder_managed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(624f, 796f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -12f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(668f, 540f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(816f, 564f)
                lineToRelative(58f, -18f)
                lineToRelative(40f, 68f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 12f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(772f, 820f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(211f)
                quadToRelative(-35f, -25f, -76f, -38f)
                reflectiveQuadToRelative(-85f, -13f)
                quadToRelative(-118f, 0f, -198.5f, 82.5f)
                reflectiveQuadTo(440f, 679f)
                quadToRelative(0f, 32f, 7f, 62f)
                reflectiveQuadToRelative(21f, 59f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Folder_managed!!
    }

private var _Folder_managed: ImageVector? = null

