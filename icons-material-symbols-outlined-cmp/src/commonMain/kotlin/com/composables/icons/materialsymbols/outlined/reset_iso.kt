package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Reset_iso: ImageVector
    get() {
        if (_Reset_iso != null) return _Reset_iso!!
        
        _Reset_iso = ImageVector.Builder(
            name = "reset_iso",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(540f, 480f)
                horizontalLineToRelative(60f)
                lineTo(480f, 600f)
                close()
                moveToRelative(0f, 161f)
                verticalLineToRelative(-85f)
                lineToRelative(196f, -196f)
                horizontalLineToRelative(85f)
                lineTo(480f, 761f)
                close()
                moveToRelative(2f, 75f)
                lineToRelative(353f, -354f)
                quadToRelative(16f, 4f, 27.5f, 15.5f)
                reflectiveQuadTo(878f, 525f)
                lineTo(524f, 878f)
                quadToRelative(-16f, -5f, -26.5f, -15.5f)
                reflectiveQuadTo(482f, 836f)
                close()
                moveToRelative(117f, 44f)
                lineToRelative(281f, -281f)
                verticalLineToRelative(85f)
                lineTo(684f, 880f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(161f, 0f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(71f, -480f)
                horizontalLineToRelative(-83f)
                quadToRelative(-26f, -88f, -99f, -144f)
                reflectiveQuadToRelative(-169f, -56f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(94f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(129f, 0f, 226.5f, 79.5f)
                reflectiveQuadTo(831f, 400f)
                close()
            }
        }.build()
        
        return _Reset_iso!!
    }

private var _Reset_iso: ImageVector? = null

