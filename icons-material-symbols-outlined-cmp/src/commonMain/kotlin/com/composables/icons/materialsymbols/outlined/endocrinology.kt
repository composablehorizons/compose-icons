package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Endocrinology: ImageVector
    get() {
        if (_Endocrinology != null) return _Endocrinology!!
        
        _Endocrinology = ImageVector.Builder(
            name = "endocrinology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, -45f, -21.5f, -82.5f)
                reflectiveQuadTo(360f, 498f)
                verticalLineToRelative(142f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 680f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 640f)
                verticalLineToRelative(-142f)
                quadToRelative(-37f, 22f, -58.5f, 59.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 680f)
                close()
                moveTo(92f, 838f)
                lineToRelative(-25f, -76f)
                quadToRelative(42f, -14f, 67.5f, -49f)
                reflectiveQuadToRelative(25.5f, -79f)
                verticalLineToRelative(-418f)
                quadToRelative(-24f, -26f, -43.5f, -56f)
                reflectiveQuadTo(83f, 96f)
                lineToRelative(74f, -32f)
                quadToRelative(42f, 98f, 129.5f, 157f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(106f, 0f, 193.5f, -59f)
                reflectiveQuadTo(803f, 64f)
                lineToRelative(74f, 32f)
                quadToRelative(-14f, 34f, -34f, 64f)
                reflectiveQuadToRelative(-43f, 56f)
                verticalLineToRelative(418f)
                quadToRelative(0f, 44f, 25f, 79f)
                reflectiveQuadToRelative(67f, 49f)
                lineToRelative(-25f, 76f)
                quadToRelative(-66f, -22f, -106.5f, -78f)
                reflectiveQuadTo(720f, 634f)
                verticalLineToRelative(-348f)
                quadToRelative(-53f, 35f, -113.5f, 54.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-66f, 0f, -127f, -19.5f)
                reflectiveQuadTo(240f, 286f)
                verticalLineToRelative(348f)
                quadToRelative(0f, 70f, -41f, 126f)
                reflectiveQuadTo(92f, 838f)
                close()
                moveToRelative(308f, -78f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-251f)
                lineToRelative(54f, 13f)
                quadToRelative(46f, 11f, 83.5f, 38.5f)
                reflectiveQuadTo(480f, 506f)
                quadToRelative(25f, -38f, 62.5f, -65.5f)
                reflectiveQuadTo(626f, 402f)
                lineToRelative(54f, -13f)
                verticalLineToRelative(251f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-23f, 0f, -43.5f, -8.5f)
                reflectiveQuadTo(480f, 729f)
                quadToRelative(-16f, 14f, -36.5f, 22.5f)
                reflectiveQuadTo(400f, 760f)
                close()
                moveToRelative(160f, -120f)
                close()
                moveToRelative(-160f, 0f)
                close()
            }
        }.build()
        
        return _Endocrinology!!
    }

private var _Endocrinology: ImageVector? = null

