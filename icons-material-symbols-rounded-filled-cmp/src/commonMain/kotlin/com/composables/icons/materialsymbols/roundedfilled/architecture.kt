package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Architecture: ImageVector
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
                moveTo(444f, 476f)
                lineTo(336f, 774f)
                quadToRelative(-1f, 3f, -5f, 7f)
                lineToRelative(-32f, 31f)
                quadToRelative(-9f, 9f, -20.5f, 4.5f)
                reflectiveQuadTo(265f, 800f)
                lineToRelative(-4f, -43f)
                lineToRelative(1f, -9f)
                lineToRelative(112f, -310f)
                quadToRelative(15f, 14f, 32.5f, 23.5f)
                reflectiveQuadTo(444f, 476f)
                close()
                moveToRelative(36f, -36f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -69.5f)
                reflectiveQuadTo(440f, 208f)
                verticalLineToRelative(-48f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(48f)
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
                moveToRelative(36f, 116f)
                quadToRelative(20f, -5f, 37.5f, -14.5f)
                reflectiveQuadTo(586f, 438f)
                lineToRelative(112f, 310f)
                quadToRelative(1f, 3f, 1f, 9f)
                lineToRelative(-4f, 43f)
                quadToRelative(-2f, 12f, -13.5f, 16.5f)
                reflectiveQuadTo(661f, 812f)
                lineToRelative(-32f, -31f)
                lineToRelative(-5f, -7f)
                lineToRelative(-108f, -298f)
                close()
            }
        }.build()
        
        return _Architecture!!
    }

private var _Architecture: ImageVector? = null

