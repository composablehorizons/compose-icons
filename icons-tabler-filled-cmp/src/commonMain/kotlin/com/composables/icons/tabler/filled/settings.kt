package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Settings: ImageVector
    get() {
        if (_Settings != null) return _Settings!!
        
        _Settings = ImageVector.Builder(
            name = "settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.647f, 4.081f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, 1.08f, 0.448f)
                curveToRelative(2.439f, -1.485f, 5.23f, 1.305f, 3.745f, 3.744f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, 0.447f, 1.08f)
                curveToRelative(2.775f, 0.673f, 2.775f, 4.62f, 0f, 5.294f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, -0.448f, 1.08f)
                curveToRelative(1.485f, 2.439f, -1.305f, 5.23f, -3.744f, 3.745f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, -1.08f, 0.447f)
                curveToRelative(-0.673f, 2.775f, -4.62f, 2.775f, -5.294f, 0f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, -1.08f, -0.448f)
                curveToRelative(-2.439f, 1.485f, -5.23f, -1.305f, -3.745f, -3.744f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, -0.447f, -1.08f)
                curveToRelative(-2.775f, -0.673f, -2.775f, -4.62f, 0f, -5.294f)
                arcToRelative(0.724f, 0.724f, 0f, false, false, 0.448f, -1.08f)
                curveToRelative(-1.485f, -2.439f, 1.305f, -5.23f, 3.744f, -3.745f)
                arcToRelative(0.722f, 0.722f, 0f, false, false, 1.08f, -0.447f)
                curveToRelative(0.673f, -2.775f, 4.62f, -2.775f, 5.294f, 0f)
                close()
                moveToRelative(-2.647f, 4.919f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                close()
            }
        }.build()
        
        return _Settings!!
    }

private var _Settings: ImageVector? = null

