package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Filters: ImageVector
    get() {
        if (_Filters != null) return _Filters!!
        
        _Filters = ImageVector.Builder(
            name = "filters",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.396f, 11.056f)
                arcToRelative(6f, 6f, 0f, false, true, -5.647f, 10.506f)
                quadToRelative(0.206f, -0.21f, 0.396f, -0.44f)
                arcToRelative(8f, 8f, 0f, false, false, 1.789f, -6.155f)
                arcToRelative(8.02f, 8.02f, 0f, false, false, 3.462f, -3.911f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.609f, 11.051f)
                arcToRelative(7.99f, 7.99f, 0f, false, false, 9.386f, 4.698f)
                arcToRelative(6f, 6f, 0f, true, true, -9.534f, -4.594f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(6f, 6f, 0f, true, true, -6f, 6f)
                lineToRelative(0.004f, -0.225f)
                arcToRelative(6f, 6f, 0f, false, true, 5.996f, -5.775f)
            }
        }.build()
        
        return _Filters!!
    }

private var _Filters: ImageVector? = null

