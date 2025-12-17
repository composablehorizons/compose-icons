package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Infrared: ImageVector
    get() {
        if (_Infrared != null) return _Infrared!!
        
        _Infrared = ImageVector.Builder(
            name = "infrared",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(636f, 876f)
                lineToRelative(-57f, -57f)
                quadToRelative(66f, -66f, 103.5f, -152.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -100f, -37.5f, -186.5f)
                reflectiveQuadTo(579f, 141f)
                lineToRelative(57f, -57f)
                quadToRelative(76f, 76f, 120f, 177.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 117f, -44f, 218.5f)
                reflectiveQuadTo(636f, 876f)
                close()
                moveTo(523f, 763f)
                lineToRelative(-57f, -57f)
                quadToRelative(44f, -44f, 69f, -102f)
                reflectiveQuadToRelative(25f, -124f)
                quadToRelative(0f, -66f, -25f, -124f)
                reflectiveQuadToRelative(-69f, -102f)
                lineToRelative(57f, -57f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(523f, 763f)
                close()
                moveTo(410f, 650f)
                lineToRelative(-57f, -57f)
                quadToRelative(22f, -22f, 34.5f, -51f)
                reflectiveQuadToRelative(12.5f, -62f)
                quadToRelative(0f, -33f, -12.5f, -62f)
                reflectiveQuadTo(353f, 367f)
                lineToRelative(57f, -57f)
                quadToRelative(32f, 32f, 51f, 76f)
                reflectiveQuadToRelative(19f, 94f)
                quadToRelative(0f, 50f, -19f, 94f)
                reflectiveQuadToRelative(-51f, 76f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Infrared!!
    }

private var _Infrared: ImageVector? = null

