package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shaved_ice: ImageVector
    get() {
        if (_Shaved_ice != null) return _Shaved_ice!!
        
        _Shaved_ice = ImageVector.Builder(
            name = "shaved_ice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(325f, 841f)
                quadToRelative(-54f, 0f, -96.5f, -34f)
                reflectiveQuadTo(170f, 720f)
                lineToRelative(-50f, -160f)
                horizontalLineToRelative(720f)
                lineToRelative(-50f, 160f)
                quadToRelative(-17f, 53f, -59f, 87f)
                reflectiveQuadToRelative(-96f, 34f)
                horizontalLineTo(325f)
                close()
                moveTo(208f, 480f)
                quadToRelative(7f, -25f, 18f, -48.5f)
                reflectiveQuadToRelative(28f, -43.5f)
                quadToRelative(-6f, -11f, -10f, -24f)
                reflectiveQuadToRelative(-4f, -27f)
                quadToRelative(0f, -60f, 38.5f, -103.5f)
                reflectiveQuadTo(376f, 182f)
                quadToRelative(16f, -29f, 44f, -45.5f)
                reflectiveQuadToRelative(60f, -16.5f)
                quadToRelative(32f, 0f, 60.5f, 16.5f)
                reflectiveQuadTo(585f, 182f)
                quadToRelative(40f, 5f, 70.5f, 28.5f)
                reflectiveQuadTo(703f, 268f)
                lineToRelative(69f, -109f)
                lineToRelative(68f, 43f)
                lineToRelative(-126f, 197f)
                quadToRelative(13f, 19f, 22.5f, 39f)
                reflectiveQuadToRelative(15.5f, 42f)
                horizontalLineTo(208f)
                close()
                moveToRelative(142f, -121f)
                lineToRelative(130f, -43f)
                lineToRelative(129f, 43f)
                quadToRelative(11f, 4f, 21f, -3f)
                reflectiveQuadToRelative(10f, -19f)
                quadToRelative(0f, -29f, -19f, -50f)
                reflectiveQuadToRelative(-48f, -25f)
                lineToRelative(-39f, -6f)
                lineToRelative(-20f, -35f)
                quadToRelative(-5f, -10f, -14f, -15.5f)
                reflectiveQuadToRelative(-20f, -5.5f)
                quadToRelative(-11f, 0f, -20.5f, 5.5f)
                reflectiveQuadTo(445f, 221f)
                lineToRelative(-19f, 35f)
                lineToRelative(-40f, 6f)
                quadToRelative(-29f, 4f, -47.5f, 25f)
                reflectiveQuadTo(320f, 337f)
                quadToRelative(0f, 12f, 9.5f, 19f)
                reflectiveQuadToRelative(20.5f, 3f)
                close()
            }
        }.build()
        
        return _Shaved_ice!!
    }

private var _Shaved_ice: ImageVector? = null

