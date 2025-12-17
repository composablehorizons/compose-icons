package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Phone_bluetooth_speaker: ImageVector
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
                quadToRelative(-125f, 0f, -247.5f, -54f)
                reflectiveQuadTo(328f, 632f)
                quadTo(228f, 532f, 174f, 410f)
                reflectiveQuadToRelative(-54f, -248f)
                verticalLineToRelative(-42f)
                horizontalLineToRelative(236f)
                lineToRelative(37f, 201f)
                lineToRelative(-114f, 115f)
                quadToRelative(22f, 39f, 49f, 74f)
                reflectiveQuadToRelative(58f, 65f)
                quadToRelative(29f, 29f, 63.5f, 55.5f)
                reflectiveQuadTo(524f, 680f)
                lineToRelative(116f, -116f)
                lineToRelative(200f, 41f)
                verticalLineToRelative(235f)
                horizontalLineToRelative(-42f)
                close()
            }
        }.build()
        
        return _Phone_bluetooth_speaker!!
    }

private var _Phone_bluetooth_speaker: ImageVector? = null

