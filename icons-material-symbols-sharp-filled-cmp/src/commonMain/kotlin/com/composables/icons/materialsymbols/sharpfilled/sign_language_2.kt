package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sign_language_2: ImageVector
    get() {
        if (_Sign_language_2 != null) return _Sign_language_2!!
        
        _Sign_language_2 = ImageVector.Builder(
            name = "sign_language_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(47f)
                quadToRelative(13f, -35f, 45.5f, -57.5f)
                reflectiveQuadTo(406f, 400f)
                horizontalLineToRelative(54f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 560f)
                horizontalLineToRelative(50f)
                lineToRelative(35f, 60f)
                lineToRelative(-101f, 180f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, -40f)
                verticalLineToRelative(-165f)
                quadToRelative(21f, -5f, 43.5f, -18.5f)
                reflectiveQuadTo(680f, 546f)
                verticalLineToRelative(214f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-47f)
                quadToRelative(-13f, 35f, -45.5f, 57.5f)
                reflectiveQuadTo(554f, 560f)
                horizontalLineToRelative(-54f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 400f)
                horizontalLineToRelative(-50f)
                lineToRelative(-35f, -60f)
                lineToRelative(102f, -180f)
                horizontalLineToRelative(223f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 414f)
                verticalLineToRelative(-214f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(165f)
                quadToRelative(-21f, 5f, -43.5f, 18.5f)
                reflectiveQuadTo(280f, 414f)
                close()
            }
        }.build()
        
        return _Sign_language_2!!
    }

private var _Sign_language_2: ImageVector? = null

