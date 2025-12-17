package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Local_see: ImageVector
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
                moveTo(480f, 560f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(126f)
                lineToRelative(61f, -67f)
                quadToRelative(6f, -6f, 13.5f, -9f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(26f, 0f, 37f, 23.5f)
                reflectiveQuadToRelative(-7f, 43.5f)
                lineToRelative(-60f, 66f)
                quadToRelative(-11f, 13f, -26.5f, 19.5f)
                reflectiveQuadTo(287f, 320f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -140f)
                quadToRelative(42f, 0f, 78.5f, -18f)
                reflectiveQuadToRelative(62.5f, -50f)
                quadToRelative(11f, -14f, 10f, -30.5f)
                reflectiveQuadTo(617f, 614f)
                quadToRelative(-14f, -11f, -30.5f, -9.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(-14f, 19f, -35f, 29.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -14f, 3.5f, -27.5f)
                reflectiveQuadTo(395f, 507f)
                quadToRelative(8f, -12f, 17.5f, -21.5f)
                reflectiveQuadTo(435f, 470f)
                quadToRelative(14f, -8f, 18.5f, -23.5f)
                reflectiveQuadTo(450f, 417f)
                quadToRelative(-8f, -14f, -24.5f, -19f)
                reflectiveQuadToRelative(-30.5f, 3f)
                quadToRelative(-22f, 12f, -39f, 29.5f)
                reflectiveQuadTo(326f, 468f)
                quadToRelative(-13f, 20f, -19.5f, 43.5f)
                reflectiveQuadTo(300f, 560f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 740f)
                close()
                moveToRelative(240f, -740f)
                quadToRelative(-95f, 0f, -167.5f, 66.5f)
                reflectiveQuadTo(480f, 246f)
                quadToRelative(0f, 98f, 73.5f, 183f)
                reflectiveQuadTo(693f, 575f)
                quadToRelative(6f, 5f, 12.5f, 7.5f)
                reflectiveQuadTo(720f, 585f)
                quadToRelative(8f, 0f, 15f, -2.5f)
                reflectiveQuadToRelative(12f, -7.5f)
                quadToRelative(66f, -61f, 139.5f, -146f)
                reflectiveQuadTo(960f, 246f)
                quadToRelative(0f, -113f, -72.5f, -179.5f)
                reflectiveQuadTo(720f, 0f)
                close()
                moveToRelative(0f, 493f)
                quadToRelative(-104f, -98f, -132f, -158f)
                reflectiveQuadToRelative(-28f, -89f)
                quadToRelative(0f, -81f, 50.5f, -123.5f)
                reflectiveQuadTo(720f, 80f)
                quadToRelative(59f, 0f, 109.5f, 42.5f)
                reflectiveQuadTo(880f, 246f)
                quadToRelative(0f, 29f, -28f, 89f)
                reflectiveQuadTo(720f, 493f)
                close()
                moveToRelative(0f, -207f)
                close()
                moveToRelative(-74f, 74f)
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
            }
        }.build()
        
        return _Local_see!!
    }

private var _Local_see: ImageVector? = null

