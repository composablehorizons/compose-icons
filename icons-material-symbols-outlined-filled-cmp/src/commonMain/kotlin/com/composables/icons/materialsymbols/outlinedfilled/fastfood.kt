package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Fastfood: ImageVector
    get() {
        if (_Fastfood != null) return _Fastfood!!
        
        _Fastfood = ImageVector.Builder(
            name = "fastfood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 600f)
                quadToRelative(0f, -109f, 91f, -174.5f)
                reflectiveQuadTo(340f, 360f)
                quadToRelative(118f, 0f, 209f, 65.5f)
                reflectiveQuadTo(640f, 600f)
                horizontalLineTo(40f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveTo(80f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 880f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -114f, -78f, -197f)
                reflectiveQuadTo(451f, 292f)
                lineToRelative(-11f, -92f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(200f)
                lineToRelative(-65f, 648f)
                quadToRelative(-3f, 31f, -25.5f, 51.5f)
                reflectiveQuadTo(776f, 920f)
                horizontalLineToRelative(-56f)
                close()
            }
        }.build()
        
        return _Fastfood!!
    }

private var _Fastfood: ImageVector? = null

