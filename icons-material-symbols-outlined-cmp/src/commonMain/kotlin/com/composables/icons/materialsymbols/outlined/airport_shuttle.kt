package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Airport_shuttle: ImageVector
    get() {
        if (_Airport_shuttle != null) return _Airport_shuttle!!
        
        _Airport_shuttle = ImageVector.Builder(
            name = "airport_shuttle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(40f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(560f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(360f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(360f, -360f)
                horizontalLineToRelative(160f)
                lineTo(640f, 280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(120f, 290f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(290f, 640f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(240f, 590f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(190f, 640f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(240f, 690f)
                close()
                moveToRelative(480f, 0f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(770f, 640f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(720f, 590f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(670f, 640f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(720f, 690f)
                close()
                moveTo(120f, 560f)
                horizontalLineToRelative(32f)
                quadToRelative(17f, -18f, 39f, -29f)
                reflectiveQuadToRelative(49f, -11f)
                quadToRelative(27f, 0f, 49f, 11f)
                reflectiveQuadToRelative(39f, 29f)
                horizontalLineToRelative(304f)
                quadToRelative(17f, -18f, 39f, -29f)
                reflectiveQuadToRelative(49f, -11f)
                quadToRelative(27f, 0f, 49f, 11f)
                reflectiveQuadToRelative(39f, 29f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(720f, -80f)
                horizontalLineTo(120f)
                horizontalLineToRelative(720f)
                close()
            }
        }.build()
        
        return _Airport_shuttle!!
    }

private var _Airport_shuttle: ImageVector? = null

