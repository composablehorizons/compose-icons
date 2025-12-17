package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.File_upload: ImageVector
    get() {
        if (_File_upload != null) return _File_upload!!
        
        _File_upload = ImageVector.Builder(
            name = "file_upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 16f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(11f, 15.425f, 11f, 15f)
                verticalLineTo(7.85f)
                lineTo(9.125f, 9.725f)
                quadToRelative(-0.3f, 0.3f, -0.7f, 0.3f)
                quadToRelative(-0.4f, 0f, -0.725f, -0.325f)
                quadToRelative(-0.3f, -0.3f, -0.287f, -0.713f)
                quadToRelative(0.012f, -0.412f, 0.287f, -0.687f)
                lineToRelative(3.6f, -3.6f)
                quadToRelative(0.15f, -0.15f, 0.325f, -0.213f)
                quadToRelative(0.175f, -0.062f, 0.375f, -0.062f)
                reflectiveQuadToRelative(0.375f, 0.062f)
                quadToRelative(0.175f, 0.063f, 0.325f, 0.213f)
                lineToRelative(3.6f, 3.6f)
                quadToRelative(0.3f, 0.3f, 0.287f, 0.712f)
                quadToRelative(-0.012f, 0.413f, -0.287f, 0.688f)
                quadToRelative(-0.3f, 0.3f, -0.712f, 0.312f)
                quadToRelative(-0.413f, 0.013f, -0.713f, -0.287f)
                lineTo(13f, 7.85f)
                verticalLineTo(15f)
                quadToRelative(0f, 0.425f, -0.287f, 0.712f)
                quadTo(12.425f, 16f, 12f, 16f)
                close()
                moveToRelative(-6f, 4f)
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
        
        return _File_upload!!
    }

private var _File_upload: ImageVector? = null

