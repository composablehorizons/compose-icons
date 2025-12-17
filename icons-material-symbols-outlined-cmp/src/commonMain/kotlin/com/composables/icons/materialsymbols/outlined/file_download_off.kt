package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.File_download_off: ImageVector
    get() {
        if (_File_download_off != null) return _File_download_off!!
        
        _File_download_off = ImageVector.Builder(
            name = "file_download_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(686f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(366f)
                lineTo(503f, 617f)
                lineToRelative(-23f, 23f)
                lineToRelative(-200f, -200f)
                lineToRelative(23f, -23f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(617f, 503f)
                lineToRelative(-57f, -57f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 58f)
                lineToRelative(-63f, 63f)
                close()
                moveToRelative(-97f, -97f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(246f)
                close()
                moveToRelative(280f, 280f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(86f)
                close()
            }
        }.build()
        
        return _File_download_off!!
    }

private var _File_download_off: ImageVector? = null

