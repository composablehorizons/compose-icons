package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Control_point_duplicate: ImageVector
    get() {
        if (_Control_point_duplicate != null) return _Control_point_duplicate!!
        
        _Control_point_duplicate = ImageVector.Builder(
            name = "control_point_duplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
                moveTo(240f, 820f)
                quadTo(131f, 782f, 65.5f, 688.5f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -115f, 65.5f, -208.5f)
                reflectiveQuadTo(240f, 140f)
                verticalLineToRelative(88f)
                quadToRelative(-74f, 35f, -117f, 103f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, 81f, 43f, 149f)
                reflectiveQuadToRelative(117f, 103f)
                verticalLineToRelative(88f)
                close()
                moveToRelative(360f, 20f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(600f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(960f, 480f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(600f, 840f)
                close()
            }
        }.build()
        
        return _Control_point_duplicate!!
    }

private var _Control_point_duplicate: ImageVector? = null

