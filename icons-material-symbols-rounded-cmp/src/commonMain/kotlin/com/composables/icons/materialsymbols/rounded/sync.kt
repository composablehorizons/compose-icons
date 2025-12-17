package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sync: ImageVector
    get() {
        if (_Sync != null) return _Sync!!
        
        _Sync = ImageVector.Builder(
            name = "sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 482f)
                quadToRelative(0f, 45f, 17f, 87.5f)
                reflectiveQuadToRelative(53f, 78.5f)
                lineToRelative(10f, 10f)
                verticalLineToRelative(-58f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 720f)
                horizontalLineToRelative(70f)
                lineToRelative(-16f, -14f)
                quadToRelative(-52f, -46f, -73f, -105f)
                reflectiveQuadToRelative(-21f, -119f)
                quadToRelative(0f, -94f, 48f, -170.5f)
                reflectiveQuadTo(337f, 194f)
                quadToRelative(14f, -8f, 29.5f, -1f)
                reflectiveQuadToRelative(20.5f, 23f)
                quadToRelative(5f, 15f, -0.5f, 30f)
                reflectiveQuadTo(367f, 269f)
                quadToRelative(-58f, 32f, -92.5f, 88.5f)
                reflectiveQuadTo(240f, 482f)
                close()
                moveToRelative(480f, -4f)
                quadToRelative(0f, -45f, -17f, -87.5f)
                reflectiveQuadTo(650f, 312f)
                lineToRelative(-10f, -10f)
                verticalLineToRelative(58f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 160f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 240f)
                horizontalLineToRelative(-70f)
                lineToRelative(16f, 14f)
                quadToRelative(49f, 49f, 71.5f, 106.5f)
                reflectiveQuadTo(800f, 478f)
                quadToRelative(0f, 94f, -48f, 170.5f)
                reflectiveQuadTo(623f, 766f)
                quadToRelative(-14f, 8f, -29.5f, 1f)
                reflectiveQuadTo(573f, 744f)
                quadToRelative(-5f, -15f, 0.5f, -30f)
                reflectiveQuadToRelative(19.5f, -23f)
                quadToRelative(58f, -32f, 92.5f, -88.5f)
                reflectiveQuadTo(720f, 478f)
                close()
            }
        }.build()
        
        return _Sync!!
    }

private var _Sync: ImageVector? = null

