package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Folder_delete: ImageVector
    get() {
        if (_Folder_delete != null) return _Folder_delete!!
        
        _Folder_delete = ImageVector.Builder(
            name = "folder_delete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 680f)
                horizontalLineToRelative(80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 620f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineTo(660f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 680f)
                close()
                moveToRelative(0f, -220f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Folder_delete!!
    }

private var _Folder_delete: ImageVector? = null

