package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Other_admission: ImageVector
    get() {
        if (_Other_admission != null) return _Other_admission!!
        
        _Other_admission = ImageVector.Builder(
            name = "other_admission",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 750f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(110f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(110f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(187f, 480f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(348f)
                quadToRelative(-29f, -14f, -58.5f, -21f)
                reflectiveQuadToRelative(-61.5f, -7f)
                quadToRelative(-11f, 0f, -20.5f, 0.5f)
                reflectiveQuadTo(680f, 443f)
                verticalLineToRelative(-3f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(245f)
                quadToRelative(-18f, 17f, -32.5f, 37f)
                reflectiveQuadTo(467f, 600f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(163f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 33f, 6f, 61.5f)
                reflectiveQuadToRelative(21f, 58.5f)
                close()
            }
        }.build()
        
        return _Other_admission!!
    }

private var _Other_admission: ImageVector? = null

