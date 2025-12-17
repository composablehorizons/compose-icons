package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hd: ImageVector
    get() {
        if (_Hd != null) return _Hd!!
        
        _Hd = ImageVector.Builder(
            name = "hd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(380f, 390f)
                verticalLineToRelative(70f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(270f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(300f, 570f)
                verticalLineToRelative(-50f)
                close()
                moveToRelative(240f, 80f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineTo(540f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(40f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Hd!!
    }

private var _Hd: ImageVector? = null

