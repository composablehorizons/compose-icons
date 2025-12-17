package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sheets_rtl: ImageVector
    get() {
        if (_Sheets_rtl != null) return _Sheets_rtl!!
        
        _Sheets_rtl = ImageVector.Builder(
            name = "sheets_rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 460f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 40f)
                horizontalLineToRelative(520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(800f, 100f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 520f)
                horizontalLineTo(220f)
                close()
                moveToRelative(20f, -280f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-80f, 200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveTo(280f, 880f)
                lineTo(120f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(527f)
                verticalLineToRelative(80f)
                horizontalLineTo(273f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Sheets_rtl!!
    }

private var _Sheets_rtl: ImageVector? = null

