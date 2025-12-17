package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folded_hands: ImageVector
    get() {
        if (_Folded_hands != null) return _Folded_hands!!
        
        _Folded_hands = ImageVector.Builder(
            name = "folded_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(630f, 640f)
                verticalLineToRelative(-112f)
                lineToRelative(-76f, -139f)
                quadToRelative(-20f, 10f, -32f, 29f)
                reflectiveQuadToRelative(-12f, 42f)
                verticalLineToRelative(320f)
                lineToRelative(57f, 100f)
                horizontalLineToRelative(313f)
                lineToRelative(-40f, -500f)
                lineToRelative(-280f, -320f)
                lineToRelative(-13f, 13f)
                quadToRelative(-29f, 29f, -34.5f, 68f)
                reflectiveQuadToRelative(14.5f, 74f)
                lineToRelative(163f, 297f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-360f, 0f)
                verticalLineToRelative(-128f)
                lineToRelative(163f, -297f)
                quadToRelative(20f, -35f, 13.5f, -74f)
                reflectiveQuadTo(412f, 73f)
                lineToRelative(-12f, -13f)
                lineToRelative(-280f, 320f)
                lineTo(80f, 880f)
                horizontalLineToRelative(313f)
                lineToRelative(57f, -100f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -23f, -12.5f, -42f)
                reflectiveQuadTo(406f, 389f)
                lineToRelative(-76f, 139f)
                verticalLineToRelative(112f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Folded_hands!!
    }

private var _Folded_hands: ImageVector? = null

