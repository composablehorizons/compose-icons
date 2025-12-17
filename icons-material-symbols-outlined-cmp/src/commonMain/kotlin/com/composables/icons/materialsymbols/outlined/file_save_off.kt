package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.File_save_off: ImageVector
    get() {
        if (_File_save_off != null) return _File_save_off!!
        
        _File_save_off = ImageVector.Builder(
            name = "file_save_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(836f, 724f)
                lineToRelative(-56f, -57f)
                lineToRelative(44f, -44f)
                lineToRelative(56f, 57f)
                lineToRelative(-44f, 44f)
                close()
                moveToRelative(-76f, -77f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(127f)
                close()
                moveTo(560f, 960f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(207f)
                lineTo(240f, 353f)
                verticalLineToRelative(367f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-447f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(880f, 880f)
                verticalLineTo(960f)
                horizontalLineTo(560f)
                close()
                moveToRelative(120f, -520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                lineTo(520f, 80f)
                horizontalLineTo(240f)
                quadToRelative(-11f, 0f, -20f, 2.5f)
                reflectiveQuadToRelative(-18f, 7.5f)
                lineToRelative(71f, 70f)
                horizontalLineToRelative(207f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-265f, 88f)
                close()
                moveToRelative(104f, -122f)
                close()
            }
        }.build()
        
        return _File_save_off!!
    }

private var _File_save_off: ImageVector? = null

