package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Local_see: ImageVector
    get() {
        if (_Local_see != null) return _Local_see!!
        
        _Local_see = ImageVector.Builder(
            name = "local_see",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 740f)
                quadToRelative(54f, 0f, 97.5f, -28.5f)
                reflectiveQuadTo(643f, 637f)
                quadToRelative(-16f, -14f, -32f, -29.5f)
                reflectiveQuadTo(579f, 575f)
                quadToRelative(-6f, 38f, -33.5f, 61.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29.5f, -70.5f)
                reflectiveQuadTo(481f, 460f)
                quadToRelative(-12f, -18f, -23f, -36.5f)
                reflectiveQuadTo(437f, 386f)
                quadToRelative(-59f, 15f, -98f, 63f)
                reflectiveQuadToRelative(-39f, 111f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 740f)
                close()
                moveTo(360f, 160f)
                horizontalLineToRelative(50f)
                quadToRelative(-5f, 19f, -7.5f, 39f)
                reflectiveQuadToRelative(-2.5f, 41f)
                horizontalLineToRelative(-5f)
                lineToRelative(-73f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-165f)
                quadToRelative(20f, -18f, 40f, -37.5f)
                reflectiveQuadToRelative(40f, -39.5f)
                verticalLineToRelative(322f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(206f)
                lineToRelative(74f, -80f)
                close()
                moveToRelative(20f, 400f)
                horizontalLineToRelative(100f)
                horizontalLineToRelative(-100f)
                close()
                moveToRelative(340f, 40f)
                quadToRelative(121f, -103f, 180.5f, -191f)
                reflectiveQuadTo(960f, 246f)
                quadToRelative(0f, -113f, -72.5f, -179.5f)
                reflectiveQuadTo(720f, 0f)
                quadToRelative(-95f, 0f, -167.5f, 66.5f)
                reflectiveQuadTo(480f, 246f)
                quadToRelative(0f, 75f, 59.5f, 163f)
                reflectiveQuadTo(720f, 600f)
                close()
                moveToRelative(0f, -107f)
                quadToRelative(-104f, -98f, -132f, -158f)
                reflectiveQuadToRelative(-28f, -89f)
                quadToRelative(0f, -81f, 50.5f, -123.5f)
                reflectiveQuadTo(720f, 80f)
                quadToRelative(59f, 0f, 109.5f, 42.5f)
                reflectiveQuadTo(880f, 246f)
                quadToRelative(0f, 29f, -28f, 89f)
                reflectiveQuadTo(720f, 493f)
                close()
                moveToRelative(-74f, -133f)
                lineToRelative(28f, -91f)
                lineToRelative(-74f, -59f)
                horizontalLineToRelative(91f)
                lineToRelative(29f, -90f)
                lineToRelative(29f, 90f)
                horizontalLineToRelative(91f)
                lineToRelative(-74f, 59f)
                lineToRelative(28f, 91f)
                lineToRelative(-74f, -56f)
                lineToRelative(-74f, 56f)
                close()
                moveToRelative(74f, -74f)
                close()
            }
        }.build()
        
        return _Local_see!!
    }

private var _Local_see: ImageVector? = null

