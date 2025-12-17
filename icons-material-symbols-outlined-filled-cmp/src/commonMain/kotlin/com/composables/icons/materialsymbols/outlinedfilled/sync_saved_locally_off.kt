package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sync_saved_locally_off: ImageVector
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
                moveTo(820f, 932f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(607f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-446f)
                lineToRelative(-52f, -54f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(8f, -218f)
                lineTo(557f, 443f)
                lineToRelative(107f, -107f)
                lineToRelative(-57f, -57f)
                lineToRelative(-107f, 107f)
                lineToRelative(-266f, -266f)
                horizontalLineToRelative(566f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 26f, -14.5f, 45.5f)
                reflectiveQuadTo(828f, 714f)
                close()
            }
        }.build()
        
        return _Sync_saved_locally_off!!
    }

private var _Sync_saved_locally_off: ImageVector? = null

