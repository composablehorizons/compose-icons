package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Funicular: ImageVector
    get() {
        if (_Funicular != null) return _Funicular!!
        
        _Funicular = ImageVector.Builder(
            name = "funicular",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(89f, 907f)
                quadToRelative(-18f, 5f, -33.5f, -6.5f)
                reflectiveQuadTo(40f, 869f)
                quadToRelative(0f, -13f, 7.5f, -23f)
                reflectiveQuadTo(68f, 832f)
                lineToRelative(172f, -47f)
                verticalLineToRelative(-105f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 640f)
                verticalLineToRelative(-400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(55f)
                lineToRelative(151f, -42f)
                quadToRelative(18f, -5f, 33.5f, 6.5f)
                reflectiveQuadTo(920f, 651f)
                quadToRelative(0f, 13f, -7.5f, 23f)
                reflectiveQuadTo(892f, 688f)
                lineTo(89f, 907f)
                close()
                moveToRelative(271f, -154f)
                lineToRelative(240f, -66f)
                verticalLineToRelative(-87f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                horizontalLineTo(360f)
                verticalLineToRelative(73f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(320f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(520f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-320f, -40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(320f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-80f, 200f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Funicular!!
    }

private var _Funicular: ImageVector? = null

