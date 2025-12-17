package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Csv: ImageVector
    get() {
        if (_Csv != null) return _Csv!!
        
        _Csv = ImageVector.Builder(
            name = "csv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(230f, 600f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(350f, 570f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(320f, 540f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(350f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(190f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(230f, 600f)
                close()
                moveToRelative(186f, 0f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(546f, 560f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -31.5f)
                reflectiveQuadTo(506f, 454f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(546f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(516f, 360f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(386f, 400f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, 11.5f, 30.5f)
                reflectiveQuadTo(426f, 504f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(36f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(386f, 570f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(416f, 600f)
                close()
                moveToRelative(264f, -102f)
                lineToRelative(-34f, -117f)
                quadToRelative(-3f, -9f, -10.5f, -15f)
                reflectiveQuadToRelative(-17.5f, -6f)
                quadToRelative(-14f, 0f, -22.5f, 11.5f)
                reflectiveQuadTo(591f, 397f)
                lineToRelative(53f, 182f)
                quadToRelative(3f, 9f, 10.5f, 15f)
                reflectiveQuadToRelative(17.5f, 6f)
                horizontalLineToRelative(16f)
                quadToRelative(10f, 0f, 17.5f, -6f)
                reflectiveQuadToRelative(10.5f, -15f)
                lineToRelative(53f, -182f)
                quadToRelative(4f, -14f, -4.5f, -25.5f)
                reflectiveQuadTo(742f, 360f)
                quadToRelative(-10f, 0f, -17.5f, 6f)
                reflectiveQuadTo(714f, 381f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Csv!!
    }

private var _Csv: ImageVector? = null

