package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.File_save_off: ImageVector
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
                moveTo(560f, 960f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(207f)
                lineTo(480f, 593f)
                verticalLineToRelative(207f)
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
                moveToRelative(276f, -236f)
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
                moveTo(553f, 440f)
                lineTo(202f, 90f)
                quadToRelative(9f, -5f, 18f, -7.5f)
                reflectiveQuadToRelative(20f, -2.5f)
                horizontalLineToRelative(280f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                horizontalLineTo(553f)
                close()
                moveToRelative(-73f, -80f)
                horizontalLineToRelative(200f)
                lineTo(480f, 160f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _File_save_off!!
    }

private var _File_save_off: ImageVector? = null

