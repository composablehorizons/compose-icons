package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Raw_off: ImageVector
    get() {
        if (_Raw_off != null) return _Raw_off!!
        
        _Raw_off = ImageVector.Builder(
            name = "raw_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 876f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-54f, -398f)
                lineToRelative(-24f, 94f)
                lineToRelative(-98f, -96f)
                lineToRelative(-19f, -80f)
                quadToRelative(-3f, -14f, 5.5f, -25f)
                reflectiveQuadToRelative(22.5f, -11f)
                quadToRelative(10f, 0f, 18.5f, 6f)
                reflectiveQuadToRelative(10.5f, 16f)
                lineToRelative(24f, 98f)
                lineToRelative(25f, -98f)
                quadToRelative(2f, -10f, 10f, -16f)
                reflectiveQuadToRelative(18f, -6f)
                horizontalLineToRelative(14f)
                quadToRelative(10f, 0f, 18.5f, 6f)
                reflectiveQuadToRelative(10.5f, 16f)
                lineToRelative(24f, 98f)
                lineToRelative(25f, -98f)
                quadToRelative(2f, -10f, 10f, -16f)
                reflectiveQuadToRelative(18f, -6f)
                quadToRelative(14f, 0f, 23f, 11f)
                reflectiveQuadToRelative(5f, 25f)
                lineToRelative(-46f, 182f)
                quadToRelative(-2f, 10f, -10f, 16f)
                reflectiveQuadToRelative(-18f, 6f)
                horizontalLineToRelative(-14f)
                quadToRelative(-10f, 0f, -18f, -6f)
                reflectiveQuadToRelative(-10f, -16f)
                lineToRelative(-25f, -100f)
                close()
                moveToRelative(-351f, 86f)
                lineToRelative(33f, -132f)
                lineToRelative(48f, 48f)
                lineToRelative(60f, 60f)
                horizontalLineToRelative(-74f)
                lineToRelative(-10f, 38f)
                quadToRelative(-2f, 10f, -10f, 16f)
                reflectiveQuadToRelative(-19f, 6f)
                quadToRelative(-14f, 0f, -23f, -11f)
                reflectiveQuadToRelative(-5f, -25f)
                close()
                moveToRelative(-239f, 6f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(150f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -9.5f, 32.5f)
                reflectiveQuadTo(284f, 516f)
                lineToRelative(20f, 46f)
                quadToRelative(6f, 14f, -2f, 26f)
                reflectiveQuadToRelative(-24f, 12f)
                quadToRelative(-8f, 0f, -15f, -4f)
                reflectiveQuadToRelative(-10f, -12f)
                lineToRelative(-29f, -64f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(150f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(120f, 570f)
                close()
                moveToRelative(60f, -110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Raw_off!!
    }

private var _Raw_off: ImageVector? = null

