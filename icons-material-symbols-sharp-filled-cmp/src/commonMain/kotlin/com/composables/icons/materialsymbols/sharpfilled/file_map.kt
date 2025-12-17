package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_map: ImageVector
    get() {
        if (_File_map != null) return _File_map!!
        
        _File_map = ImageVector.Builder(
            name = "file_map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -120f)
                quadToRelative(97f, -82f, 144.5f, -152.5f)
                reflectiveQuadTo(672f, 437f)
                quadToRelative(0f, -91f, -58f, -144f)
                reflectiveQuadToRelative(-134f, -53f)
                quadToRelative(-76f, 0f, -134f, 53f)
                reflectiveQuadToRelative(-58f, 144f)
                quadToRelative(0f, 60f, 47.5f, 130.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(0f, -230f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(430f, 440f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(480f, 390f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(530f, 440f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(480f, 490f)
                close()
            }
        }.build()
        
        return _File_map!!
    }

private var _File_map: ImageVector? = null

