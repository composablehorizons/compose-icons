package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Euro: ImageVector
    get() {
        if (_Euro != null) return _Euro!!
        
        _Euro = ImageVector.Builder(
            name = "euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                quadToRelative(-118f, 0f, -210f, -67f)
                reflectiveQuadTo(260f, 600f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(122f)
                quadToRelative(-3f, -24f, -2.5f, -44.5f)
                reflectiveQuadTo(242f, 440f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                quadToRelative(38f, -106f, 130f, -173f)
                reflectiveQuadToRelative(210f, -67f)
                quadToRelative(69f, 0f, 130.5f, 24.5f)
                reflectiveQuadTo(840f, 212f)
                lineToRelative(-57f, 56f)
                quadToRelative(-37f, -32f, -83.5f, -50f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(-85f, 0f, -152f, 44.5f)
                reflectiveQuadTo(347f, 360f)
                horizontalLineToRelative(253f)
                verticalLineToRelative(80f)
                horizontalLineTo(323f)
                quadToRelative(-4f, 27f, -3f, 47.5f)
                reflectiveQuadToRelative(3f, 32.5f)
                horizontalLineToRelative(277f)
                verticalLineToRelative(80f)
                horizontalLineTo(347f)
                quadToRelative(34f, 71f, 101f, 115.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(53f, 0f, 99.5f, -18f)
                reflectiveQuadToRelative(83.5f, -50f)
                lineToRelative(57f, 56f)
                quadToRelative(-48f, 43f, -109.5f, 67.5f)
                reflectiveQuadTo(600f, 840f)
                close()
            }
        }.build()
        
        return _Euro!!
    }

private var _Euro: ImageVector? = null

