package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Body_fat: ImageVector
    get() {
        if (_Body_fat != null) return _Body_fat!!
        
        _Body_fat = ImageVector.Builder(
            name = "body_fat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(684f, 830f)
                lineTo(124f, 552f)
                quadToRelative(-23f, -11f, -33.5f, -30.5f)
                reflectiveQuadTo(80f, 481f)
                quadToRelative(0f, -21f, 10.5f, -41f)
                reflectiveQuadToRelative(33.5f, -31f)
                lineToRelative(560f, -280f)
                quadToRelative(20f, -10f, 40.5f, -8.5f)
                reflectiveQuadTo(762f, 133f)
                quadToRelative(17f, 11f, 27.5f, 28f)
                reflectiveQuadToRelative(10.5f, 40f)
                verticalLineToRelative(119f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 400f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 320f)
                verticalLineToRelative(-117f)
                lineToRelative(-176f, 87f)
                quadToRelative(27f, 43f, 41.5f, 91f)
                reflectiveQuadToRelative(14.5f, 99f)
                quadToRelative(0f, 51f, -14.5f, 100f)
                reflectiveQuadTo(543f, 672f)
                lineToRelative(176f, 87f)
                verticalLineToRelative(-119f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 600f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(119f)
                quadToRelative(0f, 23f, -10.5f, 40f)
                reflectiveQuadTo(762f, 827f)
                quadToRelative(-17f, 11f, -37.5f, 12f)
                reflectiveQuadToRelative(-40.5f, -9f)
                close()
                moveTo(470f, 635f)
                quadToRelative(24f, -34f, 37f, -73.5f)
                reflectiveQuadToRelative(13f, -81.5f)
                quadToRelative(0f, -42f, -13f, -80.5f)
                reflectiveQuadTo(471f, 326f)
                lineTo(160f, 480f)
                lineToRelative(310f, 155f)
                close()
            }
        }.build()
        
        return _Body_fat!!
    }

private var _Body_fat: ImageVector? = null

