package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Edit_document: ImageVector
    get() {
        if (_Edit_document != null) return _Edit_document!!
        
        _Edit_document = ImageVector.Builder(
            name = "edit_document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(903f, 660f)
                lineTo(683f, 880f)
                horizontalLineTo(560f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(620f, 820f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                verticalLineToRelative(38f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, -400f)
                close()
                moveToRelative(241f, 199f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                lineToRelative(-18f, -19f)
                close()
            }
        }.build()
        
        return _Edit_document!!
    }

private var _Edit_document: ImageVector? = null

