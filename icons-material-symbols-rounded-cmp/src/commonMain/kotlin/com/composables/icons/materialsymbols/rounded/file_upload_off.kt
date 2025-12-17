package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.File_upload_off: ImageVector
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
                moveTo(520f, 314f)
                verticalLineToRelative(92f)
                lineToRelative(-80f, -80f)
                lineToRelative(-63f, -63f)
                lineToRelative(75f, -75f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(144f, 144f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(652f, 388f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(595f, 389f)
                lineToRelative(-75f, -75f)
                close()
                moveToRelative(-80f, 126f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 600f)
                verticalLineToRelative(-160f)
                close()
                moveToRelative(246f, 360f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(366f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-77f, -76f)
                close()
                moveToRelative(114f, -114f)
                lineToRelative(-71f, -71f)
                quadToRelative(5f, -6f, 12.5f, -10.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(46f)
                close()
            }
        }.build()
        
        return _File_upload_off!!
    }

private var _File_upload_off: ImageVector? = null

