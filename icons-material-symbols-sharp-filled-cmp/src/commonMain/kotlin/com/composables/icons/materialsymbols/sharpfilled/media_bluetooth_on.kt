package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Media_bluetooth_on: ImageVector
    get() {
        if (_Media_bluetooth_on != null) return _Media_bluetooth_on!!
        
        _Media_bluetooth_on = ImageVector.Builder(
            name = "media_bluetooth_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(23f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(360f, 542f)
                verticalLineToRelative(-422f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineTo(440f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-182f)
                lineTo(570f, 768f)
                lineToRelative(-34f, -34f)
                lineToRelative(134f, -134f)
                lineToRelative(-136f, -134f)
                lineToRelative(34f, -34f)
                lineToRelative(110f, 110f)
                verticalLineToRelative(-182f)
                horizontalLineToRelative(24f)
                lineToRelative(138f, 138f)
                lineToRelative(-104f, 102f)
                lineToRelative(104f, 102f)
                lineToRelative(-136f, 138f)
                horizontalLineToRelative(-24f)
                close()
                moveToRelative(46f, -92f)
                lineToRelative(46f, -46f)
                lineToRelative(-46f, -44f)
                verticalLineToRelative(90f)
                close()
                moveToRelative(0f, -206f)
                lineToRelative(46f, -44f)
                lineToRelative(-46f, -46f)
                verticalLineToRelative(90f)
                close()
            }
        }.build()
        
        return _Media_bluetooth_on!!
    }

private var _Media_bluetooth_on: ImageVector? = null

