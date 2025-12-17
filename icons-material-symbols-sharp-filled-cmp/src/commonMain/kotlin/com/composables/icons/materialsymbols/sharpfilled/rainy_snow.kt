package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Rainy_snow: ImageVector
    get() {
        if (_Rainy_snow != null) return _Rainy_snow!!
        
        _Rainy_snow = ImageVector.Builder(
            name = "rainy_snow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(302f, 774f)
                lineToRelative(-96f, -192f)
                lineToRelative(72f, -36f)
                lineToRelative(96f, 191f)
                lineToRelative(-72f, 37f)
                close()
                moveToRelative(360f, 0f)
                lineTo(446f, 342f)
                lineToRelative(72f, -36f)
                lineToRelative(216f, 431f)
                lineToRelative(-72f, 37f)
                close()
                moveToRelative(-152f, -14f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(470f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(510f, 680f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(550f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(510f, 760f)
                close()
                moveToRelative(352f, 14f)
                lineToRelative(-56f, -112f)
                lineToRelative(72f, -36f)
                lineToRelative(55f, 112f)
                lineToRelative(-71f, 36f)
                close()
                moveTo(422f, 654f)
                lineTo(206f, 222f)
                lineToRelative(72f, -35f)
                lineToRelative(215f, 431f)
                lineToRelative(-71f, 36f)
                close()
                moveToRelative(378f, -54f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 600f)
                close()
                moveToRelative(-600f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 520f)
                close()
                moveToRelative(522f, -26f)
                lineTo(586f, 222f)
                lineToRelative(72f, -36f)
                lineToRelative(135f, 272f)
                lineToRelative(-71f, 36f)
                close()
                moveToRelative(-600f, -80f)
                lineTo(26f, 222f)
                lineToRelative(72f, -35f)
                lineToRelative(95f, 191f)
                lineToRelative(-71f, 36f)
                close()
                moveToRelative(328f, -134f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(410f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(450f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(490f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(450f, 280f)
                close()
            }
        }.build()
        
        return _Rainy_snow!!
    }

private var _Rainy_snow: ImageVector? = null

