package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Folder_copy: ImageVector
    get() {
        if (_Folder_copy != null) return _Folder_copy!!
        
        _Folder_copy = ImageVector.Builder(
            name = "folder_copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(200f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(527f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Folder_copy!!
    }

private var _Folder_copy: ImageVector? = null

