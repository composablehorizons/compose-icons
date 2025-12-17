package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Trail_length: ImageVector
    get() {
        if (_Trail_length != null) return _Trail_length!!
        
        _Trail_length = ImageVector.Builder(
            name = "trail_length",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                quadToRelative(-14f, -17f, -22.5f, -37f)
                reflectiveQuadTo(484f, 520f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(124f)
                quadToRelative(5f, -23f, 13.5f, -43f)
                reflectiveQuadToRelative(22.5f, -37f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 680f)
                horizontalLineTo(280f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(40f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Trail_length!!
    }

private var _Trail_length: ImageVector? = null

