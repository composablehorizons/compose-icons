package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mode_comment: ImageVector
    get() {
        if (_Mode_comment != null) return _Mode_comment!!
        
        _Mode_comment = ImageVector.Builder(
            name = "mode_comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(623f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 812f)
                lineToRelative(-92f, -92f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Mode_comment!!
    }

private var _Mode_comment: ImageVector? = null

