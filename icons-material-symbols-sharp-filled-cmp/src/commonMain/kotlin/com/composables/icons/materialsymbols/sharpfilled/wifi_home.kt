package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wifi_home: ImageVector
    get() {
        if (_Wifi_home != null) return _Wifi_home!!
        
        _Wifi_home = ImageVector.Builder(
            name = "wifi_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 63f)
                lineToRelative(-72f, -54f)
                verticalLineToRelative(26f)
                quadToRelative(-19f, -6f, -39f, -8.5f)
                reflectiveQuadToRelative(-41f, -2.5f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 20f, 3f, 40f)
                reflectiveQuadToRelative(9f, 40f)
                horizontalLineTo(160f)
                close()
                moveTo(680f, 920f)
                horizontalLineTo(520f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(57f)
                quadToRelative(-26f, -27f, -41.5f, -63f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -72f, 45.5f, -127f)
                reflectiveQuadTo(680f, 524f)
                verticalLineToRelative(62f)
                quadToRelative(-44f, 13f, -72f, 49.5f)
                reflectiveQuadTo(580f, 720f)
                quadToRelative(0f, 29f, 10.5f, 54f)
                reflectiveQuadToRelative(29.5f, 44f)
                verticalLineToRelative(-58f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, -4f)
                verticalLineToRelative(-62f)
                quadToRelative(45f, -14f, 72.5f, -50.5f)
                reflectiveQuadTo(860f, 720f)
                quadToRelative(0f, -29f, -10.5f, -54f)
                reflectiveQuadTo(820f, 622f)
                verticalLineToRelative(58f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-57f)
                quadToRelative(26f, 27f, 41.5f, 63f)
                reflectiveQuadToRelative(15.5f, 77f)
                quadToRelative(0f, 72f, -45.5f, 127f)
                reflectiveQuadTo(760f, 916f)
                close()
            }
        }.build()
        
        return _Wifi_home!!
    }

private var _Wifi_home: ImageVector? = null

