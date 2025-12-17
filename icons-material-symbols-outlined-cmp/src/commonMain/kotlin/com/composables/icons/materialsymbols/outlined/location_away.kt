package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Location_away: ImageVector
    get() {
        if (_Location_away != null) return _Location_away!!
        
        _Location_away = ImageVector.Builder(
            name = "location_away",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(343f, 490f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(215f, 162f)
                quadToRelative(-25f, 3f, -47f, 11.5f)
                reflectiveQuadTo(526f, 316f)
                lineToRelative(-126f, -96f)
                lineToRelative(-240f, 180f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(439f, 695f)
                quadToRelative(46f, -27f, 96.5f, -41f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(54f, 0f, 104.5f, 14f)
                reflectiveQuadToRelative(96.5f, 41f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(880f, 764f)
                verticalLineToRelative(76f)
                horizontalLineTo(400f)
                close()
                moveToRelative(86f, -80f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                close()
                moveToRelative(154f, -160f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 520f)
                close()
                moveToRelative(0f, 240f)
                close()
            }
        }.build()
        
        return _Location_away!!
    }

private var _Location_away: ImageVector? = null

