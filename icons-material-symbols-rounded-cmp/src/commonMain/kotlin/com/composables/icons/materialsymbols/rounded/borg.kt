package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Borg: ImageVector
    get() {
        if (_Borg != null) return _Borg!!
        
        _Borg = ImageVector.Builder(
            name = "borg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-11f, 0f, -21f, -3f)
                reflectiveQuadToRelative(-19f, -8f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(120f, 638f)
                verticalLineToRelative(-316f)
                quadToRelative(0f, -22f, 10.5f, -40.5f)
                reflectiveQuadTo(160f, 252f)
                lineToRelative(280f, -161f)
                quadToRelative(9f, -5f, 19f, -8f)
                reflectiveQuadToRelative(21f, -3f)
                quadToRelative(11f, 0f, 21f, 3f)
                reflectiveQuadToRelative(19f, 8f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29.5f)
                reflectiveQuadTo(840f, 322f)
                verticalLineToRelative(316f)
                quadToRelative(0f, 22f, -10.5f, 40.5f)
                reflectiveQuadTo(800f, 708f)
                lineTo(520f, 869f)
                quadToRelative(-9f, 5f, -19f, 8f)
                reflectiveQuadToRelative(-21f, 3f)
                close()
                moveTo(200f, 520f)
                verticalLineToRelative(118f)
                lineToRelative(240f, 139f)
                verticalLineToRelative(-137f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-137f)
                lineTo(200f, 322f)
                verticalLineToRelative(118f)
                close()
                moveToRelative(200f, 120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(360f, -40f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(137f)
                lineToRelative(240f, -139f)
                verticalLineToRelative(-118f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-118f)
                lineTo(520f, 183f)
                verticalLineToRelative(137f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Borg!!
    }

private var _Borg: ImageVector? = null

