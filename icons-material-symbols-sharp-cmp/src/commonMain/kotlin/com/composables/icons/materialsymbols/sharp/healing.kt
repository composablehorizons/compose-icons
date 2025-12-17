package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Healing: ImageVector
    get() {
        if (_Healing != null) return _Healing!!
        
        _Healing = ImageVector.Builder(
            name = "healing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 706f)
                lineTo(274f, 912f)
                lineTo(48f, 686f)
                lineToRelative(206f, -206f)
                lineTo(48f, 274f)
                lineToRelative(226f, -226f)
                lineToRelative(206f, 206f)
                lineToRelative(206f, -206f)
                lineToRelative(226f, 226f)
                lineToRelative(-206f, 206f)
                lineToRelative(206f, 206f)
                lineTo(686f, 912f)
                lineTo(480f, 706f)
                close()
                moveToRelative(0f, -266f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveToRelative(-170f, -16f)
                lineToRelative(114f, -114f)
                lineToRelative(-150f, -150f)
                lineToRelative(-114f, 114f)
                lineToRelative(150f, 150f)
                close()
                moveToRelative(90f, 96f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                close()
                moveToRelative(80f, 80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(80f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 520f)
                close()
                moveToRelative(-24f, 130f)
                lineToRelative(150f, 150f)
                lineToRelative(114f, -114f)
                lineToRelative(-150f, -150f)
                lineToRelative(-114f, 114f)
                close()
                moveTo(339f, 339f)
                close()
                moveToRelative(282f, 282f)
                close()
            }
        }.build()
        
        return _Healing!!
    }

private var _Healing: ImageVector? = null

