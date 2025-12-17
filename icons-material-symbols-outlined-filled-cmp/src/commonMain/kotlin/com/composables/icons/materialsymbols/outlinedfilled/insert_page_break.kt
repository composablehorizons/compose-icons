package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Insert_page_break: ImageVector
    get() {
        if (_Insert_page_break != null) return _Insert_page_break!!
        
        _Insert_page_break = ImageVector.Builder(
            name = "insert_page_break",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, -520f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                verticalLineToRelative(200f)
                close()
                moveTo(360f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-640f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -160f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Insert_page_break!!
    }

private var _Insert_page_break: ImageVector? = null

