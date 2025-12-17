package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Universal_currency_alt: ImageVector
    get() {
        if (_Universal_currency_alt != null) return _Universal_currency_alt!!
        
        _Universal_currency_alt = ImageVector.Builder(
            name = "universal_currency_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(540f, -100f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(600f, 610f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 640f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 480f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(700f, 510f)
                verticalLineToRelative(70f)
                close()
                moveToRelative(-220f, 20f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(260f, 380f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 350f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 320f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 360f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 480f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(260f, 450f)
                verticalLineToRelative(-70f)
                close()
                moveTo(160f, 680f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Universal_currency_alt!!
    }

private var _Universal_currency_alt: ImageVector? = null

