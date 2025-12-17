package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pedal_bike: ImageVector
    get() {
        if (_Pedal_bike != null) return _Pedal_bike!!
        
        _Pedal_bike = ImageVector.Builder(
            name = "pedal_bike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                quadToRelative(-85f, 0f, -142.5f, -57.5f)
                reflectiveQuadTo(0f, 600f)
                quadToRelative(0f, -85f, 58.5f, -142.5f)
                reflectiveQuadTo(200f, 400f)
                quadToRelative(77f, 0f, 129.5f, 46f)
                reflectiveQuadTo(396f, 560f)
                horizontalLineToRelative(26f)
                lineToRelative(-72f, -200f)
                horizontalLineToRelative(-30f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineToRelative(-4f)
                lineToRelative(14f, 40f)
                horizontalLineToRelative(192f)
                lineToRelative(-58f, -160f)
                horizontalLineToRelative(-64f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 160f)
                horizontalLineToRelative(64f)
                quadToRelative(26f, 0f, 46.5f, 14f)
                reflectiveQuadToRelative(29.5f, 38f)
                lineToRelative(68f, 186f)
                horizontalLineToRelative(32f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 598f)
                quadToRelative(0f, 84f, -58f, 143f)
                reflectiveQuadToRelative(-142f, 59f)
                quadToRelative(-72f, 0f, -126.5f, -45f)
                reflectiveQuadTo(564f, 640f)
                horizontalLineTo(396f)
                quadToRelative(-14f, 69f, -68f, 114.5f)
                reflectiveQuadTo(200f, 800f)
                close()
                moveToRelative(112f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-72f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 640f)
                horizontalLineToRelative(72f)
                close()
                moveToRelative(196f, -80f)
                horizontalLineToRelative(56f)
                quadToRelative(5f, -23f, 13.5f, -43f)
                reflectiveQuadToRelative(22.5f, -37f)
                horizontalLineTo(478f)
                lineToRelative(30f, 80f)
                close()
                moveToRelative(174f, -52f)
                lineToRelative(24f, 68f)
                quadToRelative(5f, 16f, 20.5f, 23f)
                reflectiveQuadToRelative(31.5f, 1f)
                quadToRelative(16f, -6f, 23f, -21f)
                reflectiveQuadToRelative(1f, -31f)
                lineToRelative(-26f, -68f)
                lineToRelative(-74f, 28f)
                close()
            }
        }.build()
        
        return _Pedal_bike!!
    }

private var _Pedal_bike: ImageVector? = null

