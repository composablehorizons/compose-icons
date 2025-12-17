package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Seedling: ImageVector
    get() {
        if (_Seedling != null) return _Seedling!!
        
        _Seedling = ImageVector.Builder(
            name = "seedling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3f)
                arcToRelative(7f, 7f, 0f, false, true, 6.95f, 6.155f)
                arcToRelative(6.97f, 6.97f, 0f, false, true, 5.05f, -2.155f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(7f, 7f, 0f, false, true, -7f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                arcToRelative(7f, 7f, 0f, false, true, -7f, -7f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Seedling!!
    }

private var _Seedling: ImageVector? = null

