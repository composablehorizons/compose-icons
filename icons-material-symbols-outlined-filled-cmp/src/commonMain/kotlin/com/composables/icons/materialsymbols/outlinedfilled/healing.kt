package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Healing: ImageVector
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
                moveTo(218f, 856f)
                lineTo(104f, 742f)
                quadToRelative(-23f, -23f, -23f, -56f)
                reflectiveQuadToRelative(23f, -56f)
                lineToRelative(526f, -526f)
                quadToRelative(23f, -23f, 56f, -23f)
                reflectiveQuadToRelative(56f, 23f)
                lineToRelative(114f, 114f)
                quadToRelative(23f, 23f, 23f, 56f)
                reflectiveQuadToRelative(-23f, 56f)
                lineTo(330f, 856f)
                quadToRelative(-23f, 23f, -56f, 23f)
                reflectiveQuadToRelative(-56f, -23f)
                close()
                moveToRelative(290f, -122f)
                lineToRelative(226f, -226f)
                lineToRelative(122f, 122f)
                quadToRelative(23f, 23f, 23f, 56f)
                reflectiveQuadToRelative(-23f, 56f)
                lineTo(742f, 856f)
                quadToRelative(-23f, 23f, -56f, 23f)
                reflectiveQuadToRelative(-56f, -23f)
                lineTo(508f, 734f)
                close()
                moveToRelative(-28f, -134f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(-80f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 520f)
                close()
                moveToRelative(-335f, -69f)
                lineTo(104f, 330f)
                quadToRelative(-23f, -23f, -23f, -56f)
                reflectiveQuadToRelative(23f, -56f)
                lineToRelative(114f, -114f)
                quadToRelative(23f, -23f, 56f, -23f)
                reflectiveQuadToRelative(56f, 23f)
                lineToRelative(122f, 122f)
                lineToRelative(-227f, 225f)
                close()
                moveToRelative(255f, -11f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                close()
            }
        }.build()
        
        return _Healing!!
    }

private var _Healing: ImageVector? = null

