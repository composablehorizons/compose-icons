package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Spo2: ImageVector
    get() {
        if (_Spo2 != null) return _Spo2!!
        
        _Spo2 = ImageVector.Builder(
            name = "spo2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(620f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(580f, 800f)
                horizontalLineTo(480f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(720f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 730f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-90f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 670f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(710f, 640f)
                horizontalLineToRelative(110f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(860f, 680f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(820f, 790f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(860f, 850f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(830f, 880f)
                horizontalLineTo(720f)
                close()
                moveTo(400f, 94f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(12f, 7.5f)
                quadToRelative(78f, 69f, 149.5f, 145f)
                reflectiveQuadTo(690f, 422f)
                quadToRelative(9f, 20f, -4f, 39f)
                reflectiveQuadToRelative(-36f, 19f)
                horizontalLineTo(440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 560f)
                verticalLineToRelative(268f)
                quadToRelative(0f, 17f, -13f, 29.5f)
                reflectiveQuadTo(317f, 870f)
                quadToRelative(-118f, 0f, -177.5f, -94.5f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -140f, 93.5f, -247f)
                reflectiveQuadTo(373f, 104f)
                quadToRelative(5f, -5f, 12f, -7.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                close()
            }
        }.build()
        
        return _Spo2!!
    }

private var _Spo2: ImageVector? = null

