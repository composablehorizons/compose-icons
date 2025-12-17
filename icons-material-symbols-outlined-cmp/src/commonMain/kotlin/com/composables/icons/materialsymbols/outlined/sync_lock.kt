package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sync_lock: ImageVector
    get() {
        if (_Sync_lock != null) return _Sync_lock!!
        
        _Sync_lock = ImageVector.Builder(
            name = "sync_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
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
                moveToRelative(560f, -320f)
                quadToRelative(0f, -51f, -20.5f, -95.5f)
                reflectiveQuadTo(640f, 302f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(691f)
                quadToRelative(59f, 53f, 83.5f, 113.5f)
                reflectiveQuadTo(800f, 480f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(640f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(640f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Sync_lock!!
    }

private var _Sync_lock: ImageVector? = null

