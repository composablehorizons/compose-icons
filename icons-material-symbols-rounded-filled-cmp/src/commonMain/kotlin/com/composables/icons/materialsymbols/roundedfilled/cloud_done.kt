package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cloud_done: ImageVector
    get() {
        if (_Cloud_done != null) return _Cloud_done!!
        
        _Cloud_done = ImageVector.Builder(
            name = "cloud_done",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(413f, 565f)
                lineToRelative(-56f, -56f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-12f, 12f, -12f, 28.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                lineToRelative(85f, 86f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(169f, -169f)
                quadToRelative(12f, -12f, 12f, -29f)
                reflectiveQuadToRelative(-12f, -29f)
                quadToRelative(-12f, -12f, -29f, -12f)
                reflectiveQuadToRelative(-29f, 12f)
                lineTo(413f, 565f)
                close()
                moveTo(260f, 800f)
                quadToRelative(-91f, 0f, -155.5f, -63f)
                reflectiveQuadTo(40f, 583f)
                quadToRelative(0f, -78f, 47f, -139f)
                reflectiveQuadToRelative(123f, -78f)
                quadToRelative(25f, -92f, 100f, -149f)
                reflectiveQuadToRelative(170f, -57f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(69f, 8f, 114.5f, 59.5f)
                reflectiveQuadTo(920f, 620f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(740f, 800f)
                horizontalLineTo(260f)
                close()
            }
        }.build()
        
        return _Cloud_done!!
    }

private var _Cloud_done: ImageVector? = null

