package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sync_problem: ImageVector
    get() {
        if (_Sync_problem != null) return _Sync_problem!!
        
        _Sync_problem = ImageVector.Builder(
            name = "sync_problem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(110f)
                lineToRelative(-16f, -14f)
                quadToRelative(-52f, -46f, -73f, -105f)
                reflectiveQuadToRelative(-21f, -119f)
                quadToRelative(0f, -111f, 66.5f, -197.5f)
                reflectiveQuadTo(360f, 170f)
                verticalLineToRelative(84f)
                quadToRelative(-72f, 26f, -116f, 88.5f)
                reflectiveQuadTo(200f, 482f)
                quadToRelative(0f, 45f, 17f, 87.5f)
                reflectiveQuadToRelative(53f, 78.5f)
                lineToRelative(10f, 10f)
                verticalLineToRelative(-98f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-40f, -160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 270f)
                verticalLineToRelative(-84f)
                quadToRelative(72f, -26f, 116f, -88.5f)
                reflectiveQuadTo(760f, 478f)
                quadToRelative(0f, -45f, -17f, -87.5f)
                reflectiveQuadTo(690f, 312f)
                lineToRelative(-10f, -10f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(730f)
                lineToRelative(16f, 14f)
                quadToRelative(49f, 49f, 71.5f, 106.5f)
                reflectiveQuadTo(840f, 478f)
                quadToRelative(0f, 111f, -66.5f, 197.5f)
                reflectiveQuadTo(600f, 790f)
                close()
            }
        }.build()
        
        return _Sync_problem!!
    }

private var _Sync_problem: ImageVector? = null

