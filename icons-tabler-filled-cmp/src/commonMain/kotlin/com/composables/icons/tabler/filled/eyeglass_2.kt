package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Eyeglass2: ImageVector
    get() {
        if (_Eyeglass2 != null) return _Eyeglass2!!
        
        _Eyeglass2 = ImageVector.Builder(
            name = "eyeglass-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-1.257f)
                lineToRelative(-2.24f, 7.467f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 6.24f, 2.533f)
                horizontalLineToRelative(2.513f)
                arcToRelative(4.502f, 4.502f, 0f, false, true, 6.241f, -2.534f)
                lineToRelative(-2.241f, -7.466f)
                horizontalLineToRelative(-1.256f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.958f, 0.713f)
                lineToRelative(3f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, 0.042f, 0.287f)
                verticalLineToRelative(2.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -8.972f, 0.5f)
                horizontalLineToRelative(-2.056f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -8.972f, -0.5f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.042f, -0.287f)
                lineToRelative(3f, -10f)
                arcToRelative(1f, 1f, 0f, false, true, 0.958f, -0.713f)
                close()
            }
        }.build()
        
        return _Eyeglass2!!
    }

private var _Eyeglass2: ImageVector? = null

