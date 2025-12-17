package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Acute: ImageVector
    get() {
        if (_Acute != null) return _Acute!!
        
        _Acute = ImageVector.Builder(
            name = "acute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -133f, 93f, -226.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(133f, 0f, 226.5f, 93.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 134f, -93.5f, 227f)
                reflectiveQuadTo(600f, 800f)
                close()
                moveToRelative(40f, -336f)
                verticalLineToRelative(-104f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 360f)
                verticalLineToRelative(121f)
                quadToRelative(0f, 8f, 3.5f, 15.5f)
                reflectiveQuadTo(572f, 509f)
                lineToRelative(91f, 91f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(720f, 543f)
                lineToRelative(-80f, -79f)
                close()
                moveTo(120f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 280f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 520f)
                horizontalLineTo(80f)
                close()
                moveToRelative(40f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 600f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Acute!!
    }

private var _Acute: ImageVector? = null

