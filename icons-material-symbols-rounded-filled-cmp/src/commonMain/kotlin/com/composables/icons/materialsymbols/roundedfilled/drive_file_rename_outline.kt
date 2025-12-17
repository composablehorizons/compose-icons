package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Drive_file_rename_outline: ImageVector
    get() {
        if (_Drive_file_rename_outline != null) return _Drive_file_rename_outline!!
        
        _Drive_file_rename_outline = ImageVector.Builder(
            name = "drive_file_rename_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 21f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(6f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(22f, 18.175f, 22f, 19f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 21f, 20f, 21f)
                close()
                moveToRelative(8.3f, -12.075f)
                lineToRelative(-4.25f, -4.2f)
                lineToRelative(1.4f, -1.4f)
                quadToRelative(0.575f, -0.575f, 1.413f, -0.575f)
                quadToRelative(0.837f, 0f, 1.412f, 0.575f)
                lineToRelative(1.4f, 1.4f)
                quadToRelative(0.575f, 0.575f, 0.6f, 1.388f)
                quadToRelative(0.025f, 0.812f, -0.55f, 1.387f)
                close()
                moveTo(3f, 21f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(2f, 20.425f, 2f, 20f)
                verticalLineToRelative(-2.825f)
                quadToRelative(0f, -0.2f, 0.075f, -0.387f)
                quadToRelative(0.075f, -0.188f, 0.225f, -0.338f)
                lineToRelative(10.3f, -10.3f)
                lineToRelative(4.25f, 4.25f)
                lineToRelative(-10.3f, 10.3f)
                quadToRelative(-0.15f, 0.15f, -0.337f, 0.225f)
                quadToRelative(-0.188f, 0.075f, -0.388f, 0.075f)
                close()
            }
        }.build()
        
        return _Drive_file_rename_outline!!
    }

private var _Drive_file_rename_outline: ImageVector? = null

