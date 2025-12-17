package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Local_police: ImageVector
    get() {
        if (_Local_police != null) return _Local_police!!
        
        _Local_police = ImageVector.Builder(
            name = "local_police",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 540f)
                lineToRelative(85f, 65f)
                quadToRelative(6f, 5f, 12f, 0.5f)
                reflectiveQuadToRelative(4f, -11.5f)
                lineToRelative(-33f, -106f)
                lineToRelative(89f, -70f)
                quadToRelative(5f, -5f, 3f, -11.5f)
                reflectiveQuadToRelative(-9f, -6.5f)
                horizontalLineTo(524f)
                lineToRelative(-34f, -107f)
                quadToRelative(-2f, -7f, -10f, -7f)
                reflectiveQuadToRelative(-10f, 7f)
                lineToRelative(-34f, 107f)
                horizontalLineTo(329f)
                quadToRelative(-7f, 0f, -9.5f, 6.5f)
                reflectiveQuadTo(322f, 418f)
                lineToRelative(88f, 70f)
                lineToRelative(-33f, 107f)
                quadToRelative(-2f, 7f, 4f, 11.5f)
                reflectiveQuadToRelative(12f, -0.5f)
                lineToRelative(87f, -66f)
                close()
                moveToRelative(0f, 336f)
                quadToRelative(-7f, 0f, -13f, -1f)
                reflectiveQuadToRelative(-12f, -3f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 140f, -80f, 261.5f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(104f, -33f, 172f, -132f)
                reflectiveQuadToRelative(68f, -220f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
                moveToRelative(0f, -316f)
                close()
            }
        }.build()
        
        return _Local_police!!
    }

private var _Local_police: ImageVector? = null

