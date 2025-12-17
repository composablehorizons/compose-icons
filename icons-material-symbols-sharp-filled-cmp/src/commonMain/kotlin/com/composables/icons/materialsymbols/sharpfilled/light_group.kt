package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Light_group: ImageVector
    get() {
        if (_Light_group != null) return _Light_group!!
        
        _Light_group = ImageVector.Builder(
            name = "light_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, -40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 760f)
                horizontalLineTo(440f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -90f, 57f, -156f)
                reflectiveQuadToRelative(143f, -80f)
                verticalLineToRelative(-404f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(404f)
                quadToRelative(87f, 14f, 143.5f, 80f)
                reflectiveQuadTo(920f, 720f)
                verticalLineToRelative(40f)
                horizontalLineTo(760f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                close()
                moveToRelative(-440f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(29f)
                lineToRelative(96f, -360f)
                horizontalLineToRelative(311f)
                lineToRelative(96f, 360f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Light_group!!
    }

private var _Light_group: ImageVector? = null

