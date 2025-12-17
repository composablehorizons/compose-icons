package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Phone_bluetooth_speaker: ImageVector
    get() {
        if (_Phone_bluetooth_speaker != null) return _Phone_bluetooth_speaker!!
        
        _Phone_bluetooth_speaker = ImageVector.Builder(
            name = "phone_bluetooth_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 480f)
                verticalLineToRelative(-152f)
                lineToRelative(-92f, 92f)
                lineToRelative(-28f, -28f)
                lineToRelative(112f, -112f)
                lineToRelative(-112f, -112f)
                lineToRelative(28f, -28f)
                lineToRelative(92f, 92f)
                verticalLineToRelative(-152f)
                horizontalLineToRelative(20f)
                lineToRelative(114f, 116f)
                lineToRelative(-86f, 84f)
                lineToRelative(86f, 86f)
                lineToRelative(-114f, 114f)
                horizontalLineToRelative(-20f)
                close()
                moveToRelative(40f, -76f)
                lineToRelative(38f, -38f)
                lineToRelative(-38f, -38f)
                verticalLineToRelative(76f)
                close()
                moveToRelative(0f, -172f)
                lineToRelative(38f, -36f)
                lineToRelative(-38f, -38f)
                verticalLineToRelative(74f)
                close()
                moveToRelative(78f, 608f)
                quadToRelative(-125f, 0f, -247f, -54.5f)
                reflectiveQuadTo(329f, 631f)
                quadTo(229f, 531f, 174.5f, 409f)
                reflectiveQuadTo(120f, 162f)
                quadToRelative(0f, -18f, 12f, -30f)
                reflectiveQuadToRelative(30f, -12f)
                horizontalLineToRelative(162f)
                quadToRelative(14f, 0f, 25f, 9.5f)
                reflectiveQuadToRelative(13f, 22.5f)
                lineToRelative(26f, 140f)
                quadToRelative(2f, 16f, -1f, 27f)
                reflectiveQuadToRelative(-11f, 19f)
                lineToRelative(-97f, 98f)
                quadToRelative(20f, 37f, 47.5f, 71.5f)
                reflectiveQuadTo(387f, 574f)
                quadToRelative(31f, 31f, 65f, 57.5f)
                reflectiveQuadToRelative(72f, 48.5f)
                lineToRelative(94f, -94f)
                quadToRelative(9f, -9f, 23.5f, -13.5f)
                reflectiveQuadTo(670f, 570f)
                lineToRelative(138f, 28f)
                quadToRelative(14f, 4f, 23f, 14.5f)
                reflectiveQuadToRelative(9f, 23.5f)
                verticalLineToRelative(162f)
                quadToRelative(0f, 18f, -12f, 30f)
                reflectiveQuadToRelative(-30f, 12f)
                close()
                moveTo(241f, 360f)
                lineToRelative(66f, -66f)
                lineToRelative(-17f, -94f)
                horizontalLineToRelative(-89f)
                quadToRelative(5f, 41f, 14f, 81f)
                reflectiveQuadToRelative(26f, 79f)
                close()
                moveToRelative(358f, 358f)
                quadToRelative(39f, 17f, 79.5f, 27f)
                reflectiveQuadToRelative(81.5f, 13f)
                verticalLineToRelative(-88f)
                lineToRelative(-94f, -19f)
                lineToRelative(-67f, 67f)
                close()
                moveTo(241f, 360f)
                close()
                moveToRelative(358f, 358f)
                close()
            }
        }.build()
        
        return _Phone_bluetooth_speaker!!
    }

private var _Phone_bluetooth_speaker: ImageVector? = null

