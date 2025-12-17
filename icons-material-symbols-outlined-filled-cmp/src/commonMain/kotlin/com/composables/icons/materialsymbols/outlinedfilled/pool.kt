package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pool: ImageVector
    get() {
        if (_Pool != null) return _Pool!!
        
        _Pool = ImageVector.Builder(
            name = "pool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 57f, -20f)
                reflectiveQuadToRelative(75f, -20f)
                quadToRelative(56f, 0f, 77f, 20f)
                reflectiveQuadToRelative(57f, 20f)
                quadToRelative(36f, 0f, 57f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(56f, 0f, 77f, 20f)
                reflectiveQuadToRelative(57f, 20f)
                quadToRelative(36f, 0f, 57f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(56f, 0f, 75f, 20f)
                reflectiveQuadToRelative(57f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-59f, 0f, -77.5f, -20f)
                reflectiveQuadTo(748f, 800f)
                quadToRelative(-36f, 0f, -57f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-56f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-57f, -20f)
                quadToRelative(-36f, 0f, -57f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-56f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-57f, -20f)
                quadToRelative(-36f, 0f, -54.5f, 20f)
                reflectiveQuadTo(80f, 840f)
                close()
                moveToRelative(0f, -180f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 57f, -20f)
                reflectiveQuadToRelative(75f, -20f)
                quadToRelative(56f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                quadToRelative(36f, 0f, 57f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(56f, 0f, 77f, 20f)
                reflectiveQuadToRelative(57f, 20f)
                quadToRelative(36f, 0f, 57f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(56f, 0f, 75f, 20f)
                reflectiveQuadToRelative(57f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-59f, 0f, -77.5f, -20f)
                reflectiveQuadTo(748f, 620f)
                quadToRelative(-36f, 0f, -55.5f, 20f)
                reflectiveQuadTo(614f, 660f)
                quadToRelative(-57f, 0f, -77.5f, -20f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(-38f, 0f, -56.5f, 20f)
                reflectiveQuadTo(346f, 660f)
                quadToRelative(-59f, 0f, -78.5f, -20f)
                reflectiveQuadTo(212f, 620f)
                quadToRelative(-36f, 0f, -54.5f, 20f)
                reflectiveQuadTo(80f, 660f)
                close()
                moveToRelative(196f, -204f)
                lineToRelative(133f, -133f)
                lineToRelative(-40f, -40f)
                quadToRelative(-33f, -33f, -70f, -48f)
                reflectiveQuadToRelative(-91f, -15f)
                verticalLineToRelative(-100f)
                quadToRelative(75f, 0f, 124f, 16.5f)
                reflectiveQuadToRelative(96f, 63.5f)
                lineToRelative(256f, 256f)
                quadToRelative(-17f, 11f, -33f, 17.5f)
                reflectiveQuadToRelative(-37f, 6.5f)
                quadToRelative(-36f, 0f, -57f, -20f)
                reflectiveQuadToRelative(-77f, -20f)
                quadToRelative(-56f, 0f, -77f, 20f)
                reflectiveQuadToRelative(-57f, 20f)
                quadToRelative(-21f, 0f, -37f, -6.5f)
                reflectiveQuadTo(276f, 456f)
                close()
                moveToRelative(392f, -336f)
                quadToRelative(42f, 0f, 71f, 29.5f)
                reflectiveQuadToRelative(29f, 70.5f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -41f, 29f, -70.5f)
                reflectiveQuadToRelative(71f, -29.5f)
                close()
            }
        }.build()
        
        return _Pool!!
    }

private var _Pool: ImageVector? = null

