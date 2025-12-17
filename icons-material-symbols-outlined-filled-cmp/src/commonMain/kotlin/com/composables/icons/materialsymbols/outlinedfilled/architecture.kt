package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Architecture: ImageVector
    get() {
        if (_Architecture != null) return _Architecture!!
        
        _Architecture = ImageVector.Builder(
            name = "architecture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(270f, 840f)
                lineToRelative(-10f, -88f)
                lineToRelative(114f, -314f)
                quadToRelative(15f, 14f, 32.5f, 23.5f)
                reflectiveQuadTo(444f, 476f)
                lineTo(334f, 778f)
                lineToRelative(-64f, 62f)
                close()
                moveToRelative(420f, 0f)
                lineToRelative(-64f, -62f)
                lineToRelative(-110f, -302f)
                quadToRelative(20f, -5f, 37.5f, -14.5f)
                reflectiveQuadTo(586f, 438f)
                lineToRelative(114f, 314f)
                lineToRelative(-10f, 88f)
                close()
                moveTo(480f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -69.5f)
                reflectiveQuadTo(440f, 208f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(88f)
                quadToRelative(35f, 12f, 57.5f, 42.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 360f)
                close()
            }
        }.build()
        
        return _Architecture!!
    }

private var _Architecture: ImageVector? = null

