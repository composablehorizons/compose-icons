package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Co2: ImageVector
    get() {
        if (_Co2 != null) return _Co2!!
        
        _Co2 = ImageVector.Builder(
            name = "co2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 600f)
                horizontalLineTo(440f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(220f, 150f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 580f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-91f)
                quadToRelative(-12f, 0f, -20.5f, -8.5f)
                reflectiveQuadTo(680f, 510f)
                quadToRelative(0f, -12f, 8.5f, -21f)
                reflectiveQuadToRelative(21.5f, -9f)
                horizontalLineToRelative(110f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(860f, 520f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(820f, 620f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(90f)
                quadToRelative(12f, 0f, 21f, 9f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(0f, 13f, -9f, 21.5f)
                reflectiveQuadToRelative(-21f, 8.5f)
                horizontalLineTo(710f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 690f)
                close()
                moveToRelative(-520f, -90f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(21f)
                quadToRelative(0f, 12f, -9f, 20.5f)
                reflectiveQuadToRelative(-21f, 8.5f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(260f, 420f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -12f, 8.5f, -21f)
                reflectiveQuadToRelative(21.5f, -9f)
                quadToRelative(12f, 0f, 21f, 9f)
                reflectiveQuadToRelative(9f, 21f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Co2!!
    }

private var _Co2: ImageVector? = null

