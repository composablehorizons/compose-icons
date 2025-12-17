package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sync_disabled: ImageVector
    get() {
        if (_Sync_disabled != null) return _Sync_disabled!!
        
        _Sync_disabled = ImageVector.Builder(
            name = "sync_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 482f)
                quadToRelative(0f, 47f, 18.5f, 90f)
                reflectiveQuadToRelative(51.5f, 76f)
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
                quadToRelative(-45f, -45f, -69.5f, -103f)
                reflectiveQuadTo(160f, 482f)
                quadToRelative(0f, -44f, 11f, -85.5f)
                reflectiveQuadToRelative(34f, -79.5f)
                lineTo(84f, 196f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(85f, 139f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(764f, 875f)
                lineTo(643f, 755f)
                quadToRelative(-11f, 7f, -22f, 12f)
                lineToRelative(-22f, 10f)
                quadToRelative(-15f, 6f, -29.5f, -1.5f)
                reflectiveQuadTo(550f, 751f)
                quadToRelative(-5f, -17f, 4f, -30.5f)
                reflectiveQuadToRelative(25f, -21.5f)
                quadToRelative(11f, -5f, 20f, -11f)
                reflectiveQuadToRelative(19f, -12f)
                lineToRelative(-26f, 28f)
                lineToRelative(-328f, -328f)
                quadToRelative(-11f, 25f, -17.5f, 51.5f)
                reflectiveQuadTo(240f, 482f)
                close()
                moveToRelative(517f, 159f)
                lineToRelative(-60f, -60f)
                quadToRelative(11f, -24f, 17f, -50f)
                reflectiveQuadToRelative(6f, -53f)
                quadToRelative(0f, -47f, -18.5f, -90f)
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
                quadToRelative(45f, 45f, 69.5f, 103f)
                reflectiveQuadTo(800f, 478f)
                quadToRelative(0f, 43f, -11f, 84f)
                reflectiveQuadToRelative(-32f, 79f)
                close()
                moveTo(379f, 263f)
                lineToRelative(-60f, -60f)
                quadToRelative(11f, -6f, 21f, -10.5f)
                reflectiveQuadToRelative(21f, -9.5f)
                quadToRelative(16f, -6f, 30f, 1.5f)
                reflectiveQuadToRelative(19f, 24.5f)
                quadToRelative(4f, 16f, -4.5f, 30f)
                reflectiveQuadTo(382f, 261f)
                quadToRelative(-1f, 1f, -1.5f, 1f)
                reflectiveQuadToRelative(-1.5f, 1f)
                close()
            }
        }.build()
        
        return _Sync_disabled!!
    }

private var _Sync_disabled: ImageVector? = null

