package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Mountain: ImageVector
    get() {
        if (_Mountain != null) return _Mountain!!
        
        _Mountain = ImageVector.Builder(
            name = "mountain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.18f, 10.95f)
                lineToRelative(2.54f, 3.175f)
                lineToRelative(0.084f, 0.093f)
                arcToRelative(1f, 1f, 0f, false, false, 1.403f, -0.01f)
                lineToRelative(1.637f, -1.638f)
                lineToRelative(1.324f, 1.985f)
                arcToRelative(1f, 1f, 0f, false, false, 1.457f, 0.226f)
                lineToRelative(3.632f, -2.906f)
                lineToRelative(3.647f, 7.697f)
                arcToRelative(1f, 1f, 0f, false, true, -0.904f, 1.428f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, false, true, -0.904f, -1.428f)
                close()
                moveToRelative(5.82f, -7.878f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, 2.983f, 1.888f)
                lineToRelative(2.394f, 5.057f)
                lineToRelative(-3.15f, 2.52f)
                lineToRelative(-1.395f, -2.092f)
                lineToRelative(-0.075f, -0.099f)
                arcToRelative(1f, 1f, 0f, false, false, -1.464f, -0.053f)
                lineToRelative(-1.711f, 1.709f)
                lineToRelative(-1.301f, -1.627f)
                lineToRelative(-1.151f, -1.435f)
                lineToRelative(1.888f, -3.98f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, 2.982f, -1.888f)
            }
        }.build()
        
        return _Mountain!!
    }

private var _Mountain: ImageVector? = null

