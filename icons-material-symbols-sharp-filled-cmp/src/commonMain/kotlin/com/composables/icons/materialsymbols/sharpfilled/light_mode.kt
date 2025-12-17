package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Light_mode: ImageVector
    get() {
        if (_Light_mode != null) return _Light_mode!!
        
        _Light_mode = ImageVector.Builder(
            name = "light_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(200f, 520f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(720f, 0f)
                horizontalLineTo(760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveTo(440f, 200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(256f, 310f)
                lineToRelative(-101f, -97f)
                lineToRelative(57f, -59f)
                lineToRelative(96f, 100f)
                lineToRelative(-52f, 56f)
                close()
                moveToRelative(492f, 496f)
                lineToRelative(-97f, -101f)
                lineToRelative(53f, -55f)
                lineToRelative(101f, 97f)
                lineToRelative(-57f, 59f)
                close()
                moveToRelative(-98f, -550f)
                lineToRelative(97f, -101f)
                lineToRelative(59f, 57f)
                lineToRelative(-100f, 96f)
                lineToRelative(-56f, -52f)
                close()
                moveTo(154f, 748f)
                lineToRelative(101f, -97f)
                lineToRelative(55f, 53f)
                lineToRelative(-97f, 101f)
                lineToRelative(-59f, -57f)
                close()
            }
        }.build()
        
        return _Light_mode!!
    }

private var _Light_mode: ImageVector? = null

