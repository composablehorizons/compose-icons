package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Terrain: ImageVector
    get() {
        if (_Terrain != null) return _Terrain!!
        
        _Terrain = ImageVector.Builder(
            name = "terrain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 6f)
                lineToRelative(-3.75f, 5f)
                lineToRelative(2.85f, 3.8f)
                lineToRelative(-1.6f, 1.2f)
                curveTo(9.81f, 13.75f, 7f, 10f, 7f, 10f)
                lineToRelative(-6f, 8f)
                horizontalLineToRelative(22f)
                lineTo(14f, 6f)
                close()
            }
        }.build()
        
        return _Terrain!!
    }

private var _Terrain: ImageVector? = null

