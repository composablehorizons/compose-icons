package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hvac: ImageVector
    get() {
        if (_Hvac != null) return _Hvac!!
        
        _Hvac = ImageVector.Builder(
            name = "hvac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-29f, 0f, -56f, -10.5f)
                reflectiveQuadTo(375f, 600f)
                horizontalLineToRelative(210f)
                quadToRelative(-22f, 19f, -49f, 29.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(-138f, -80f)
                quadToRelative(-8f, -14f, -13f, -29f)
                reflectiveQuadToRelative(-7f, -31f)
                horizontalLineToRelative(316f)
                quadToRelative(-2f, 16f, -7f, 31f)
                reflectiveQuadToRelative(-13f, 29f)
                horizontalLineTo(342f)
                close()
                moveToRelative(-20f, -100f)
                quadToRelative(2f, -16f, 7f, -31f)
                reflectiveQuadToRelative(13f, -29f)
                horizontalLineToRelative(276f)
                quadToRelative(8f, 14f, 13f, 29f)
                reflectiveQuadToRelative(7f, 31f)
                horizontalLineTo(322f)
                close()
                moveToRelative(53f, -100f)
                quadToRelative(22f, -19f, 49f, -29.5f)
                reflectiveQuadToRelative(56f, -10.5f)
                quadToRelative(29f, 0f, 56f, 10.5f)
                reflectiveQuadToRelative(49f, 29.5f)
                horizontalLineTo(375f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Hvac!!
    }

private var _Hvac: ImageVector? = null

