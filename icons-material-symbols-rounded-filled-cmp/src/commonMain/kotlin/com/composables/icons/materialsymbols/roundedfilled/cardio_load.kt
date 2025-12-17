package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cardio_load: ImageVector
    get() {
        if (_Cardio_load != null) return _Cardio_load!!
        
        _Cardio_load = ImageVector.Builder(
            name = "cardio_load",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(427f, 793f)
                lineToRelative(-75f, -67f)
                quadToRelative(-72f, -65f, -123.5f, -116f)
                reflectiveQuadToRelative(-85f, -96f)
                quadToRelative(-33.5f, -45f, -49f, -87f)
                reflectiveQuadTo(79f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(299f, 120f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(82f, 62f)
                quadToRelative(35f, -40f, 82f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 62.5f)
                reflectiveQuadTo(881f, 339f)
                quadToRelative(0f, 46f, -15.5f, 88f)
                reflectiveQuadToRelative(-49f, 87f)
                quadToRelative(-33.5f, 45f, -85f, 96f)
                reflectiveQuadTo(608f, 726f)
                lineToRelative(-75f, 67f)
                quadToRelative(-11f, 11f, -25f, 15.5f)
                reflectiveQuadToRelative(-28f, 4.5f)
                quadToRelative(-14f, 0f, -28f, -4.5f)
                reflectiveQuadTo(427f, 793f)
                close()
                moveTo(273f, 540f)
                horizontalLineToRelative(414f)
                quadToRelative(16f, -17f, 29f, -31.5f)
                reflectiveQuadToRelative(24f, -28.5f)
                horizontalLineTo(220f)
                quadToRelative(11f, 14f, 24f, 28.5f)
                reflectiveQuadToRelative(29f, 31.5f)
                close()
                moveToRelative(207f, 192f)
                quadToRelative(36f, -32f, 67.5f, -59.5f)
                reflectiveQuadTo(605f, 620f)
                horizontalLineTo(355f)
                quadToRelative(26f, 25f, 57.5f, 52.5f)
                reflectiveQuadTo(480f, 732f)
                close()
            }
        }.build()
        
        return _Cardio_load!!
    }

private var _Cardio_load: ImageVector? = null

