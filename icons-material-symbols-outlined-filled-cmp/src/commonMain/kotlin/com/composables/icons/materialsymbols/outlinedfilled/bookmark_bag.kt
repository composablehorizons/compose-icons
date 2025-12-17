package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bookmark_bag: ImageVector
    get() {
        if (_Bookmark_bag != null) return _Bookmark_bag!!
        
        _Bookmark_bag = ImageVector.Builder(
            name = "bookmark_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(430f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(460f, 570f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(530f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(560f, 570f)
                verticalLineToRelative(-10f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 320f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(500f, 240f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(420f, 280f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-20f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 360f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(430f, 600f)
                close()
                moveToRelative(30f, -280f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(640f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
            }
        }.build()
        
        return _Bookmark_bag!!
    }

private var _Bookmark_bag: ImageVector? = null

