package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Media_bluetooth_off: ImageVector
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
                moveTo(792f, 904f)
                lineTo(632f, 744f)
                lineToRelative(-24f, 24f)
                lineToRelative(-34f, -34f)
                lineToRelative(24f, -24f)
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
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(56f, -170f)
                lineTo(576f, 464f)
                lineToRelative(32f, -32f)
                lineToRelative(110f, 110f)
                verticalLineToRelative(-182f)
                horizontalLineToRelative(24f)
                lineToRelative(138f, 136f)
                lineToRelative(-104f, 104f)
                lineToRelative(104f, 102f)
                lineToRelative(-32f, 32f)
                close()
                moveToRelative(-82f, -192f)
                lineToRelative(46f, -46f)
                lineToRelative(-46f, -44f)
                verticalLineToRelative(90f)
                close()
                moveTo(440f, 326f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-126f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineTo(440f)
                verticalLineToRelative(46f)
                close()
            }
        }.build()
        
        return _Media_bluetooth_off!!
    }

private var _Media_bluetooth_off: ImageVector? = null

