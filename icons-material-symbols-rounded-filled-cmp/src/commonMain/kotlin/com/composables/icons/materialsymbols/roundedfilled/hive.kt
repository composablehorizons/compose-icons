package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hive: ImageVector
    get() {
        if (_Hive != null) return _Hive!!
        
        _Hive = ImageVector.Builder(
            name = "hive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(651f, 460f)
                horizontalLineToRelative(134f)
                lineToRelative(46f, -81f)
                quadToRelative(11f, -18f, 11f, -39f)
                reflectiveQuadToRelative(-11f, -39f)
                lineToRelative(-23f, -40f)
                quadToRelative(-11f, -19f, -29.5f, -30f)
                reflectiveQuadTo(738f, 220f)
                horizontalLineToRelative(-87f)
                lineToRelative(-68f, 120f)
                lineToRelative(68f, 120f)
                close()
                moveTo(413f, 600f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, -120f)
                lineToRelative(-68f, -120f)
                horizontalLineTo(413f)
                lineToRelative(-68f, 120f)
                lineToRelative(68f, 120f)
                close()
                moveToRelative(0f, -280f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, -120f)
                lineToRelative(-45f, -79f)
                quadToRelative(-11f, -19f, -29.5f, -30f)
                reflectiveQuadTo(500f, 80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-22f, 0f, -40.5f, 11f)
                reflectiveQuadTo(390f, 121f)
                lineToRelative(-45f, 79f)
                lineToRelative(68f, 120f)
                close()
                moveToRelative(-39f, 20f)
                lineToRelative(-65f, -120f)
                horizontalLineToRelative(-87f)
                quadToRelative(-22f, 0f, -40.5f, 11f)
                reflectiveQuadTo(152f, 261f)
                lineToRelative(-23f, 40f)
                quadToRelative(-11f, 18f, -11f, 39f)
                reflectiveQuadToRelative(11f, 39f)
                lineToRelative(46f, 81f)
                horizontalLineToRelative(134f)
                lineToRelative(65f, -120f)
                close()
                moveToRelative(0f, 280f)
                lineToRelative(-65f, -120f)
                horizontalLineTo(175f)
                lineToRelative(-46f, 81f)
                quadToRelative(-11f, 18f, -11f, 39f)
                reflectiveQuadToRelative(11f, 39f)
                lineToRelative(23f, 40f)
                quadToRelative(11f, 19f, 29.5f, 30f)
                reflectiveQuadToRelative(40.5f, 11f)
                horizontalLineToRelative(87f)
                lineToRelative(65f, -120f)
                close()
                moveToRelative(39f, 20f)
                lineToRelative(-68f, 120f)
                lineToRelative(49f, 81f)
                quadToRelative(11f, 18f, 29f, 28.5f)
                reflectiveQuadTo(462f, 880f)
                horizontalLineToRelative(38f)
                quadToRelative(22f, 0f, 40.5f, -11f)
                reflectiveQuadToRelative(29.5f, -30f)
                lineToRelative(45f, -79f)
                lineToRelative(-68f, -120f)
                horizontalLineTo(413f)
                close()
                moveToRelative(238f, 100f)
                horizontalLineToRelative(87f)
                quadToRelative(22f, 0f, 40.5f, -11f)
                reflectiveQuadToRelative(29.5f, -30f)
                lineToRelative(23f, -40f)
                quadToRelative(11f, -18f, 11f, -39f)
                reflectiveQuadToRelative(-11f, -39f)
                lineToRelative(-46f, -81f)
                horizontalLineTo(651f)
                lineToRelative(-68f, 120f)
                lineToRelative(68f, 120f)
                close()
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

