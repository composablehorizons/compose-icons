package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Text_fields_alt: ImageVector
    get() {
        if (_Text_fields_alt != null) return _Text_fields_alt!!
        
        _Text_fields_alt = ImageVector.Builder(
            name = "text_fields_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(680f, -160f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-600f, 0f)
                lineToRelative(210f, -560f)
                horizontalLineToRelative(100f)
                lineToRelative(210f, 560f)
                horizontalLineToRelative(-96f)
                lineToRelative(-50f, -144f)
                horizontalLineTo(308f)
                lineToRelative(-52f, 144f)
                horizontalLineToRelative(-96f)
                close()
                moveToRelative(176f, -224f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
            }
        }.build()
        
        return _Text_fields_alt!!
    }

private var _Text_fields_alt: ImageVector? = null

