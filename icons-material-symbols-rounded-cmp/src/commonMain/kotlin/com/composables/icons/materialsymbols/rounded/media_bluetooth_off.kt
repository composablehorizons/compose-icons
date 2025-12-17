package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Media_bluetooth_off: ImageVector
    get() {
        if (_Media_bluetooth_off != null) return _Media_bluetooth_off!!
        
        _Media_bluetooth_off = ImageVector.Builder(
            name = "media_bluetooth_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 876f)
                lineTo(632f, 744f)
                lineToRelative(-7f, 7f)
                quadToRelative(-7f, 7f, -17f, 7f)
                reflectiveQuadToRelative(-17f, -7f)
                quadToRelative(-7f, -7f, -7f, -17f)
                reflectiveQuadToRelative(7f, -17f)
                lineToRelative(7f, -7f)
                lineToRelative(-158f, -158f)
                verticalLineToRelative(128f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(23f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(360f, 542f)
                verticalLineToRelative(-70f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(2f, -334f)
                lineToRelative(46f, -46f)
                lineToRelative(-46f, -44f)
                verticalLineToRelative(90f)
                close()
                moveTo(440f, 326f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-86f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineTo(440f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(440f, 170f)
                lineTo(776f, 600f)
                lineToRelative(88f, 86f)
                quadToRelative(7f, 7f, 7f, 16f)
                reflectiveQuadToRelative(-7f, 16f)
                quadToRelative(-7f, 7f, -16f, 7f)
                reflectiveQuadToRelative(-16f, -7f)
                lineTo(592f, 480f)
                quadToRelative(-7f, -7f, -7f, -16f)
                reflectiveQuadToRelative(7f, -16f)
                quadToRelative(7f, -7f, 16f, -7f)
                reflectiveQuadToRelative(16f, 7f)
                lineToRelative(94f, 94f)
                verticalLineToRelative(-182f)
                horizontalLineToRelative(24f)
                lineToRelative(138f, 136f)
                close()
            }
        }.build()
        
        return _Media_bluetooth_off!!
    }

private var _Media_bluetooth_off: ImageVector? = null

