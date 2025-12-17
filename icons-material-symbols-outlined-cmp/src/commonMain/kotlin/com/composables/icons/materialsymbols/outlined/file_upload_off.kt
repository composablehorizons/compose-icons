package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.File_upload_off: ImageVector
    get() {
        if (_File_upload_off != null) return _File_upload_off!!
        
        _File_upload_off = ImageVector.Builder(
            name = "file_upload_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-56f, 58f)
                lineToRelative(-104f, -104f)
                verticalLineToRelative(92f)
                lineToRelative(-80f, -80f)
                lineToRelative(-63f, -63f)
                lineToRelative(103f, -103f)
                close()
                moveToRelative(-40f, 480f)
                verticalLineToRelative(-200f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(791f, 905f)
                lineTo(686f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(366f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(9f, -219f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(86f)
                close()
            }
        }.build()
        
        return _File_upload_off!!
    }

private var _File_upload_off: ImageVector? = null

