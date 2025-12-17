package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sync_saved_locally_off: ImageVector
    get() {
        if (_Sync_saved_locally_off != null) return _Sync_saved_locally_off!!
        
        _Sync_saved_locally_off = ImageVector.Builder(
            name = "sync_saved_locally_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(828f, 714f)
                lineToRelative(-74f, -74f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-440f)
                horizontalLineTo(314f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(566f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 26f, -14.5f, 45.5f)
                reflectiveQuadTo(828f, 714f)
                close()
                moveTo(728f, 840f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 760f)
                horizontalLineToRelative(567f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-446f)
                lineToRelative(-25f, -26f)
                quadToRelative(-11f, -12f, -11f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-64f, -64f)
                close()
                moveTo(526f, 640f)
                lineTo(160f, 273f)
                verticalLineToRelative(367f)
                horizontalLineToRelative(366f)
                close()
                moveToRelative(8f, -220f)
                close()
                moveToRelative(-191f, 36f)
                close()
                moveToRelative(157f, -70f)
                lineToRelative(79f, -79f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(635f, 364f)
                lineToRelative(-78f, 79f)
                lineToRelative(-57f, -57f)
                close()
            }
        }.build()
        
        return _Sync_saved_locally_off!!
    }

private var _Sync_saved_locally_off: ImageVector? = null

