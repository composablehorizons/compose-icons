package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.File_download: ImageVector
    get() {
        if (_File_download != null) return _File_download!!
        
        _File_download = ImageVector.Builder(
            name = "file_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 15.575f)
                quadToRelative(-0.2f, 0f, -0.375f, -0.063f)
                quadToRelative(-0.175f, -0.062f, -0.325f, -0.212f)
                lineToRelative(-3.6f, -3.6f)
                quadToRelative(-0.275f, -0.275f, -0.275f, -0.7f)
                quadToRelative(0f, -0.425f, 0.275f, -0.7f)
                quadToRelative(0.275f, -0.275f, 0.712f, -0.288f)
                quadToRelative(0.438f, -0.012f, 0.713f, 0.263f)
                lineTo(11f, 12.15f)
                verticalLineTo(5f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(11.575f, 4f, 12f, 4f)
                reflectiveQuadToRelative(0.713f, 0.287f)
                quadTo(13f, 4.575f, 13f, 5f)
                verticalLineToRelative(7.15f)
                lineToRelative(1.875f, -1.875f)
                quadToRelative(0.275f, -0.275f, 0.713f, -0.263f)
                quadToRelative(0.437f, 0.013f, 0.712f, 0.288f)
                quadToRelative(0.275f, 0.275f, 0.275f, 0.7f)
                quadToRelative(0f, 0.425f, -0.275f, 0.7f)
                lineToRelative(-3.6f, 3.6f)
                quadToRelative(-0.15f, 0.15f, -0.325f, 0.212f)
                quadToRelative(-0.175f, 0.063f, -0.375f, 0.063f)
                close()
                moveTo(6f, 20f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(4f, 18.825f, 4f, 18f)
                verticalLineToRelative(-2f)
                quadToRelative(0f, -0.425f, 0.287f, -0.713f)
                quadTo(4.575f, 15f, 5f, 15f)
                reflectiveQuadToRelative(0.713f, 0.287f)
                quadTo(6f, 15.575f, 6f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(18.575f, 15f, 19f, 15f)
                reflectiveQuadToRelative(0.712f, 0.287f)
                quadTo(20f, 15.575f, 20f, 16f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(18.825f, 20f, 18f, 20f)
                close()
            }
        }.build()
        
        return _File_download!!
    }

private var _File_download: ImageVector? = null

