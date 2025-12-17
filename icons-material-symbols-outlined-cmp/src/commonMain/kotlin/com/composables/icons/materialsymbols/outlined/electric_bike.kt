package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Electric_bike: ImageVector
    get() {
        if (_Electric_bike != null) return _Electric_bike!!
        
        _Electric_bike = ImageVector.Builder(
            name = "electric_bike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                quadToRelative(-85f, 0f, -142.5f, -57.5f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -85f, 58.5f, -142.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(77f, 0f, 129.5f, 46f)
                reflectiveQuadTo(396f, 440f)
                horizontalLineToRelative(26f)
                lineToRelative(-72f, -200f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-44f)
                lineToRelative(14f, 40f)
                horizontalLineToRelative(192f)
                lineToRelative(-58f, -160f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(104f)
                quadToRelative(26f, 0f, 46.5f, 14f)
                reflectiveQuadToRelative(29.5f, 38f)
                lineToRelative(68f, 186f)
                horizontalLineToRelative(32f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 478f)
                quadToRelative(0f, 84f, -58f, 143f)
                reflectiveQuadToRelative(-142f, 59f)
                quadToRelative(-72f, 0f, -126.5f, -45f)
                reflectiveQuadTo(564f, 520f)
                horizontalLineTo(396f)
                quadToRelative(-14f, 69f, -68f, 114.5f)
                reflectiveQuadTo(200f, 680f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(41f, 0f, 70.5f, -22.5f)
                reflectiveQuadTo(312f, 520f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(112f)
                quadToRelative(-12f, -36f, -41.5f, -58f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(-51f, 0f, -85.5f, 34.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, 50f, 34.5f, 85f)
                reflectiveQuadToRelative(85.5f, 35f)
                close()
                moveToRelative(308f, -160f)
                horizontalLineToRelative(56f)
                quadToRelative(5f, -23f, 13.5f, -43f)
                reflectiveQuadToRelative(22.5f, -37f)
                horizontalLineTo(478f)
                lineToRelative(30f, 80f)
                close()
                moveToRelative(252f, 160f)
                quadToRelative(51f, 0f, 85.5f, -35f)
                reflectiveQuadToRelative(34.5f, -85f)
                quadToRelative(0f, -51f, -34.5f, -85.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineToRelative(-4f)
                lineToRelative(40f, 106f)
                lineToRelative(-76f, 28f)
                lineToRelative(-38f, -106f)
                quadToRelative(-20f, 17f, -31f, 40f)
                reflectiveQuadToRelative(-11f, 52f)
                quadToRelative(0f, 50f, 34.5f, 85f)
                reflectiveQuadToRelative(85.5f, 35f)
                close()
                moveTo(520f, 920f)
                lineTo(280f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                lineToRelative(240f, 120f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveTo(196f, 480f)
                close()
                moveToRelative(564f, 0f)
                close()
            }
        }.build()
        
        return _Electric_bike!!
    }

private var _Electric_bike: ImageVector? = null

