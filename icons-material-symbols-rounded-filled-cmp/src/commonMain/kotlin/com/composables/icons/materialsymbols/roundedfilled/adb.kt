package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Adb: ImageVector
    get() {
        if (_Adb != null) return _Adb!!
        
        _Adb = ImageVector.Builder(
            name = "adb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 440f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -72f, 32.5f, -131.5f)
                reflectiveQuadTo(320f, 171f)
                lineToRelative(-75f, -75f)
                lineToRelative(35f, -36f)
                lineToRelative(85f, 85f)
                quadToRelative(26f, -12f, 55.5f, -18.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(30f, 0f, 59.5f, 6.5f)
                reflectiveQuadTo(595f, 145f)
                lineToRelative(85f, -85f)
                lineToRelative(35f, 36f)
                lineToRelative(-75f, 75f)
                quadToRelative(55f, 38f, 87.5f, 97.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(40f)
                horizontalLineTo(200f)
                close()
                moveToRelative(400f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 360f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 360f)
                close()
                moveTo(480f, 920f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 920f)
                close()
            }
        }.build()
        
        return _Adb!!
    }

private var _Adb: ImageVector? = null

