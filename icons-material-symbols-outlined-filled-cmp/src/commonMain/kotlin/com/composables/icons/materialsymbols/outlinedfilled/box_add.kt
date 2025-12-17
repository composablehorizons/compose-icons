package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Box_add: ImageVector
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(196f)
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
                horizontalLineTo(200f)
                close()
                moveToRelative(520f, 0f)
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

