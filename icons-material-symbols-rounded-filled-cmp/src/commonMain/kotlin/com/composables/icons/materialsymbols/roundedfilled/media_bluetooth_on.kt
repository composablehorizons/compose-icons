package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Media_bluetooth_on: ImageVector
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
                verticalLineToRelative(-382f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineTo(440f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(390f, -240f)
                lineTo(551f, 483f)
                quadToRelative(-7f, -7f, -7f, -17f)
                reflectiveQuadToRelative(7f, -17f)
                quadToRelative(7f, -7f, 17f, -7f)
                reflectiveQuadToRelative(17f, 7f)
                lineToRelative(93f, 93f)
                verticalLineToRelative(-109f)
                quadToRelative(0f, -18f, 12f, -29.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(65f, 65f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                quadToRelative(0f, 8f, -3f, 15f)
                reflectiveQuadToRelative(-9f, 13f)
                lineToRelative(-75f, 74f)
                lineToRelative(75f, 74f)
                quadToRelative(6f, 6f, 9f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15.5f)
                reflectiveQuadTo(812f, 731f)
                lineToRelative(-64f, 64f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-16f, 0f, -28f, -11f)
                reflectiveQuadToRelative(-12f, -29f)
                verticalLineToRelative(-109f)
                lineToRelative(-93f, 93f)
                quadToRelative(-7f, 7f, -17f, 7f)
                reflectiveQuadToRelative(-17f, -7f)
                quadToRelative(-7f, -7f, -7f, -17f)
                reflectiveQuadToRelative(7f, -17f)
                lineToRelative(117f, -117f)
                close()
                moveToRelative(56f, 148f)
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

