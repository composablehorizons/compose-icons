package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hive: ImageVector
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
                moveTo(322f, 760f)
                horizontalLineToRelative(-85f)
                quadToRelative(-22f, 0f, -40.5f, -11f)
                reflectiveQuadTo(167f, 719f)
                lineToRelative(-45f, -80f)
                quadToRelative(-11f, -18f, -11f, -39f)
                reflectiveQuadToRelative(11f, -39f)
                lineToRelative(46f, -81f)
                lineToRelative(-46f, -81f)
                quadToRelative(-11f, -18f, -11f, -39f)
                reflectiveQuadToRelative(11f, -39f)
                lineToRelative(45f, -80f)
                quadToRelative(11f, -19f, 29.5f, -30f)
                reflectiveQuadToRelative(40.5f, -11f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -79f)
                quadToRelative(11f, -19f, 29.5f, -30f)
                reflectiveQuadToRelative(40.5f, -11f)
                horizontalLineToRelative(86f)
                quadToRelative(22f, 0f, 40.5f, 11f)
                reflectiveQuadToRelative(29.5f, 30f)
                lineToRelative(45f, 79f)
                horizontalLineToRelative(85f)
                quadToRelative(22f, 0f, 40.5f, 11f)
                reflectiveQuadToRelative(29.5f, 30f)
                lineToRelative(45f, 80f)
                quadToRelative(11f, 18f, 11f, 39f)
                reflectiveQuadToRelative(-11f, 39f)
                lineToRelative(-46f, 81f)
                lineToRelative(46f, 81f)
                quadToRelative(11f, 18f, 11f, 39f)
                reflectiveQuadToRelative(-11f, 39f)
                lineToRelative(-45f, 80f)
                quadToRelative(-11f, 19f, -29.5f, 30f)
                reflectiveQuadTo(723f, 760f)
                horizontalLineToRelative(-85f)
                lineToRelative(-45f, 79f)
                quadToRelative(-11f, 19f, -29.5f, 30f)
                reflectiveQuadTo(523f, 880f)
                horizontalLineToRelative(-86f)
                quadToRelative(-22f, 0f, -40.5f, -11f)
                reflectiveQuadTo(367f, 839f)
                lineToRelative(-45f, -79f)
                close()
                moveToRelative(316f, -320f)
                horizontalLineToRelative(86f)
                lineToRelative(44f, -80f)
                lineToRelative(-44f, -80f)
                horizontalLineToRelative(-86f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
                moveTo(438f, 560f)
                horizontalLineToRelative(84f)
                lineToRelative(45f, -80f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-84f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(84f)
                lineToRelative(46f, -81f)
                lineToRelative(-45f, -79f)
                horizontalLineToRelative(-86f)
                lineToRelative(-45f, 79f)
                lineToRelative(46f, 81f)
                close()
                moveToRelative(-71f, 40f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-85f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -80f)
                close()
                moveToRelative(0f, 240f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-86f)
                lineToRelative(-44f, 80f)
                lineToRelative(45f, 80f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -80f)
                close()
                moveToRelative(71f, 40f)
                lineToRelative(-46f, 81f)
                lineToRelative(45f, 79f)
                horizontalLineToRelative(86f)
                lineToRelative(45f, -79f)
                lineToRelative(-46f, -81f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(200f, 40f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -80f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-85f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

