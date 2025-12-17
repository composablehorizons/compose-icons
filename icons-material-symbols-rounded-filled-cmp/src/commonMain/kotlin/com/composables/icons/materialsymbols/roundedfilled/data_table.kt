package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Data_table: ImageVector
    get() {
        if (_Data_table != null) return _Data_table!!
        
        _Data_table = ImageVector.Builder(
            name = "data_table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(780f, 160f)
                horizontalLineTo(180f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(120f, 220f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-160f)
                horizontalLineTo(120f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(60f, 240f)
                horizontalLineToRelative(600f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(840f, 740f)
                verticalLineToRelative(-100f)
                horizontalLineTo(120f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(180f, 800f)
                close()
                moveToRelative(20f, -520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 280f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 520f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 760f)
                close()
            }
        }.build()
        
        return _Data_table!!
    }

private var _Data_table: ImageVector? = null

