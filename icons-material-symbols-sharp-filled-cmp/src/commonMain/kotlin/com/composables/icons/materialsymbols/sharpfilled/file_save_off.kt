package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_save_off: ImageVector
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
                moveToRelative(0f, -207f)
                horizontalLineTo(553f)
                lineTo(273f, 160f)
                lineToRelative(-81f, -80f)
                horizontalLineToRelative(328f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                close()
                moveTo(480f, 593f)
                lineTo(767f, 880f)
                horizontalLineTo(560f)
                verticalLineTo(960f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                lineTo(84f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(132f, 133f)
                verticalLineToRelative(527f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-207f)
                close()
                moveToRelative(200f, -233f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _File_save_off!!
    }

private var _File_save_off: ImageVector? = null

