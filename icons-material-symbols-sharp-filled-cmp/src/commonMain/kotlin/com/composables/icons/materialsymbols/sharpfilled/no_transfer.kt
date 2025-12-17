package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.No_transfer: ImageVector
    get() {
        if (_No_transfer != null) return _No_transfer!!
        
        _No_transfer = ImageVector.Builder(
            name = "no_transfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(652f, 765f)
                horizontalLineToRelative(114f)
                verticalLineToRelative(75f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(-122f)
                quadToRelative(-18f, -20f, -29f, -44.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-347f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-30f, -258f)
                lineTo(515f, 400f)
                horizontalLineToRelative(205f)
                verticalLineToRelative(-120f)
                horizontalLineTo(395f)
                lineTo(235f, 120f)
                quadToRelative(39f, -20f, 99.5f, -30f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(172f, 0f, 246f, 37f)
                reflectiveQuadToRelative(74f, 123f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 14f, -3f, 27.5f)
                reflectiveQuadToRelative(-8f, 26.5f)
                close()
                moveToRelative(-449f, -34f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 640f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(47f)
                lineToRelative(-47f, -47f)
                verticalLineToRelative(47f)
                close()
            }
        }.build()
        
        return _No_transfer!!
    }

private var _No_transfer: ImageVector? = null

