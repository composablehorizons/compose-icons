package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tsv: ImageVector
    get() {
        if (_Tsv != null) return _Tsv!!
        
        _Tsv = ImageVector.Builder(
            name = "tsv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(310f, 570f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(20f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 360f)
                horizontalLineTo(230f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(200f, 390f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(230f, 420f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(280f, 600f)
                close()
                moveToRelative(220f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(540f, 560f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -31.5f)
                reflectiveQuadTo(500f, 454f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(540f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(510f, 360f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 400f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, 11.5f, 30.5f)
                reflectiveQuadTo(420f, 504f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(36f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(380f, 570f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 600f)
                horizontalLineToRelative(90f)
                close()
                moveToRelative(160f, -102f)
                lineToRelative(-34f, -117f)
                quadToRelative(-3f, -9f, -10.5f, -15f)
                reflectiveQuadToRelative(-17.5f, -6f)
                quadToRelative(-14f, 0f, -22.5f, 11.5f)
                reflectiveQuadTo(571f, 397f)
                lineToRelative(53f, 182f)
                quadToRelative(3f, 9f, 10.5f, 15f)
                reflectiveQuadToRelative(17.5f, 6f)
                horizontalLineToRelative(16f)
                quadToRelative(10f, 0f, 17.5f, -6f)
                reflectiveQuadToRelative(10.5f, -15f)
                lineToRelative(53f, -182f)
                quadToRelative(4f, -14f, -4.5f, -25.5f)
                reflectiveQuadTo(722f, 360f)
                quadToRelative(-10f, 0f, -17.5f, 6f)
                reflectiveQuadTo(694f, 381f)
                lineToRelative(-34f, 117f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Tsv!!
    }

private var _Tsv: ImageVector? = null

