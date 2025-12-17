package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hand_gesture: ImageVector
    get() {
        if (_Hand_gesture != null) return _Hand_gesture!!
        
        _Hand_gesture = ImageVector.Builder(
            name = "hand_gesture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 201f)
                quadToRelative(0f, -51f, -35f, -86f)
                reflectiveQuadToRelative(-86f, -35f)
                verticalLineToRelative(-60f)
                quadToRelative(75f, 0f, 128f, 53f)
                reflectiveQuadToRelative(53f, 128f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(240f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 720f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(99f, 0f)
                lineTo(48f, 495f)
                lineToRelative(69f, -66f)
                lineToRelative(163f, 114f)
                verticalLineToRelative(-423f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(577f)
                lineTo(212f, 593f)
                lineToRelative(169f, 247f)
                horizontalLineToRelative(379f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(760f)
                horizontalLineTo(339f)
                close()
                moveToRelative(101f, -440f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, 180f)
                close()
            }
        }.build()
        
        return _Hand_gesture!!
    }

private var _Hand_gesture: ImageVector? = null

