package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Box_add: ImageVector
    get() {
        if (_Box_add != null) return _Box_add!!
        
        _Box_add = ImageVector.Builder(
            name = "box_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-608f)
                lineToRelative(92f, -112f)
                horizontalLineToRelative(536f)
                lineToRelative(92f, 112f)
                verticalLineToRelative(225f)
                quadToRelative(-19f, -7f, -39f, -11.5f)
                reflectiveQuadToRelative(-41f, -4.5f)
                quadToRelative(-33f, 0f, -63.5f, 7.5f)
                reflectiveQuadTo(640f, 472f)
                verticalLineToRelative(-152f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                lineToRelative(160f, -80f)
                lineToRelative(58f, 29f)
                quadToRelative(-8f, 21f, -13f, 43.5f)
                reflectiveQuadToRelative(-5f, 46.5f)
                quadToRelative(0f, 45f, 16f, 86.5f)
                reflectiveQuadToRelative(46f, 74.5f)
                horizontalLineTo(120f)
                close()
                moveToRelative(600f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(216f, 240f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
            }
        }.build()
        
        return _Box_add!!
    }

private var _Box_add: ImageVector? = null

