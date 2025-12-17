package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Android_wifi_3_bar_plus: ImageVector
    get() {
        if (_Android_wifi_3_bar_plus != null) return _Android_wifi_3_bar_plus!!
        
        _Android_wifi_3_bar_plus = ImageVector.Builder(
            name = "android_wifi_3_bar_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(109f, 429f)
                lineToRelative(-85f, -85f)
                quadToRelative(92f, -89f, 210f, -136.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(128f, 0f, 246f, 47.5f)
                reflectiveQuadTo(936f, 344f)
                lineToRelative(-85f, 85f)
                quadToRelative(-75f, -72f, -171f, -110.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-104f, 0f, -200f, 38.5f)
                reflectiveQuadTo(109f, 429f)
                close()
                moveToRelative(371f, 371f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveTo(278f, 598f)
                lineToRelative(-84f, -84f)
                quadToRelative(59f, -55f, 132.5f, -84.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(68f, 0f, 131.5f, 21f)
                reflectiveQuadTo(729f, 482f)
                quadToRelative(-36f, 5f, -66.5f, 23f)
                reflectiveQuadTo(609f, 549f)
                quadToRelative(-30f, -14f, -62.5f, -21.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-57f, 0f, -108.5f, 20f)
                reflectiveQuadTo(278f, 598f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar_plus!!
    }

private var _Android_wifi_3_bar_plus: ImageVector? = null

