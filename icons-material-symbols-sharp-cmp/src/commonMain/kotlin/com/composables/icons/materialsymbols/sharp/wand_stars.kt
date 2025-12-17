package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wand_stars: ImageVector
    get() {
        if (_Wand_stars != null) return _Wand_stars!!
        
        _Wand_stars = ImageVector.Builder(
            name = "wand_stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(301f, -302f)
                lineToRelative(-181f, -45f)
                lineToRelative(198f, -123f)
                lineToRelative(-17f, -234f)
                lineToRelative(179f, 151f)
                lineToRelative(216f, -88f)
                lineToRelative(-87f, 217f)
                lineToRelative(151f, 178f)
                lineToRelative(-234f, -16f)
                lineToRelative(-124f, 198f)
                lineToRelative(-45f, -181f)
                lineToRelative(-301f, 301f)
                close()
                moveToRelative(24f, -520f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(355f, 197f)
                lineToRelative(48f, -79f)
                lineToRelative(93f, 7f)
                lineToRelative(-60f, -71f)
                lineToRelative(35f, -86f)
                lineToRelative(-86f, 35f)
                lineToRelative(-71f, -59f)
                lineToRelative(7f, 92f)
                lineToRelative(-79f, 49f)
                lineToRelative(90f, 22f)
                lineToRelative(23f, 90f)
                close()
                moveToRelative(165f, 323f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(569f, 390f)
                close()
            }
        }.build()
        
        return _Wand_stars!!
    }

private var _Wand_stars: ImageVector? = null

