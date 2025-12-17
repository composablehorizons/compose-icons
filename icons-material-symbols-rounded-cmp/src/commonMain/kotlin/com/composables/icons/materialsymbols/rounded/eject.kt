package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Eject: ImageVector
    get() {
        if (_Eject != null) return _Eject!!
        
        _Eject = ImageVector.Builder(
            name = "eject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 680f)
                close()
                moveToRelative(15f, -142f)
                lineToRelative(192f, -288f)
                quadToRelative(6f, -9f, 14.5f, -13.5f)
                reflectiveQuadTo(480f, 232f)
                quadToRelative(10f, 0f, 18.5f, 4.5f)
                reflectiveQuadTo(513f, 250f)
                lineToRelative(192f, 288f)
                quadToRelative(14f, 20f, 2f, 41f)
                reflectiveQuadToRelative(-36f, 21f)
                horizontalLineTo(289f)
                quadToRelative(-24f, 0f, -36f, -21f)
                reflectiveQuadToRelative(2f, -41f)
                close()
                moveToRelative(225f, -18f)
                close()
                moveToRelative(-118f, 0f)
                horizontalLineToRelative(236f)
                lineTo(480f, 344f)
                lineTo(362f, 520f)
                close()
            }
        }.build()
        
        return _Eject!!
    }

private var _Eject: ImageVector? = null

