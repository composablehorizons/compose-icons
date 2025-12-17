package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Css: ImageVector
    get() {
        if (_Css != null) return _Css!!
        
        _Css = ImageVector.Builder(
            name = "css",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 540f)
                verticalLineToRelative(-40f)
                horizontalLineTo(420f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(380f, 460f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(420f, 360f)
                horizontalLineToRelative(130f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(580f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(550f, 420f)
                horizontalLineTo(440f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 500f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 600f)
                horizontalLineTo(410f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(380f, 570f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(410f, 540f)
                horizontalLineToRelative(110f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-40f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 460f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineToRelative(130f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(840f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(810f, 420f)
                horizontalLineTo(700f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 500f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineTo(670f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(640f, 570f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(670f, 540f)
                horizontalLineToRelative(110f)
                close()
                moveToRelative(-620f, 60f)
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
        
        return _Css!!
    }

private var _Css: ImageVector? = null

