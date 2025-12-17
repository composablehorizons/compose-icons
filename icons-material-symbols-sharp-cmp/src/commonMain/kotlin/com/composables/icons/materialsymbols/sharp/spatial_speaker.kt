package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Spatial_speaker: ImageVector
    get() {
        if (_Spatial_speaker != null) return _Spatial_speaker!!
        
        _Spatial_speaker = ImageVector.Builder(
            name = "spatial_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadTo(40f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -140f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(180f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-40f, -140f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(480f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(200f, 220f)
                verticalLineToRelative(-80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(600f, 740f)
                close()
                moveToRelative(0f, 140f)
                verticalLineToRelative(-80f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadTo(600f, 880f)
                close()
                moveTo(400f, 520f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Spatial_speaker!!
    }

private var _Spatial_speaker: ImageVector? = null

