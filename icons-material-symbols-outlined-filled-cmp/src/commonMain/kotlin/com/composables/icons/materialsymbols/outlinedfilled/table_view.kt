package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Table_view: ImageVector
    get() {
        if (_Table_view != null) return _Table_view!!
        
        _Table_view = ImageVector.Builder(
            name = "table_view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 360f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(360f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(360f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-480f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Table_view!!
    }

private var _Table_view: ImageVector? = null

