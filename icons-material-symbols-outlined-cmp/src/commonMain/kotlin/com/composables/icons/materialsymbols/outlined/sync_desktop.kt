package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sync_desktop: ImageVector
    get() {
        if (_Sync_desktop != null) return _Sync_desktop!!
        
        _Sync_desktop = ImageVector.Builder(
            name = "sync_desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(716f, 440f)
                quadToRelative(-7f, -41f, -27f, -76f)
                reflectiveQuadToRelative(-49f, -62f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(691f)
                quadToRelative(43f, 38f, 70.5f, 89f)
                reflectiveQuadTo(797f, 440f)
                horizontalLineToRelative(-81f)
                close()
                moveTo(600f, 680f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-20f, 80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 700f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 520f)
                horizontalLineToRelative(240f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 580f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 760f)
                horizontalLineTo(580f)
                close()
                moveToRelative(-420f, 40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(109f)
                quadToRelative(-51f, -44f, -80f, -106f)
                reflectiveQuadToRelative(-29f, -134f)
                quadToRelative(0f, -112f, 68f, -197.5f)
                reflectiveQuadTo(400f, 170f)
                verticalLineToRelative(84f)
                quadToRelative(-70f, 25f, -115f, 86.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 54f, 21.5f, 99.5f)
                reflectiveQuadTo(320f, 658f)
                verticalLineToRelative(-98f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(120f, -200f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Sync_desktop!!
    }

private var _Sync_desktop: ImageVector? = null

