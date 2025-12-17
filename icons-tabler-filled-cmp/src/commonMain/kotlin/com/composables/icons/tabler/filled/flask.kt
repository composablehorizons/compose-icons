package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flask: ImageVector
    get() {
        if (_Flask != null) return _Flask!!
        
        _Flask = ImageVector.Builder(
            name = "flask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(4.826f)
                lineToRelative(3.932f, 10.814f)
                lineToRelative(0.034f, 0.077f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -0.002f, 1.193f)
                lineToRelative(-0.07f, 0.162f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -1.213f, 0.911f)
                lineToRelative(-0.181f, 0.017f)
                horizontalLineToRelative(-11f)
                lineToRelative(-0.181f, -0.017f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -1.285f, -2.266f)
                lineToRelative(0.039f, -0.09f)
                lineToRelative(3.927f, -10.804f)
                verticalLineToRelative(-4.823f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                horizontalLineToRelative(6f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Flask!!
    }

private var _Flask: ImageVector? = null

