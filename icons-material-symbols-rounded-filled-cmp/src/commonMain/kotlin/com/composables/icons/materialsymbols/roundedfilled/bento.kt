package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bento: ImageVector
    get() {
        if (_Bento != null) return _Bento!!
        
        _Bento = ImageVector.Builder(
            name = "bento",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 440f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                close()
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -220f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(320f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(260f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(320f, 540f)
                close()
                moveToRelative(320f, 220f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Bento!!
    }

private var _Bento: ImageVector? = null

