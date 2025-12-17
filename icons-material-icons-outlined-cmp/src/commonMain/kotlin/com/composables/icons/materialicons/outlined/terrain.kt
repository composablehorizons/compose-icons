package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Terrain: ImageVector
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
                lineToRelative(-4.22f, 5.63f)
                lineToRelative(1.25f, 1.67f)
                lineTo(14f, 9.33f)
                lineTo(19f, 16f)
                horizontalLineToRelative(-8.46f)
                lineToRelative(-4.01f, -5.37f)
                lineTo(1f, 18f)
                horizontalLineToRelative(22f)
                lineTo(14f, 6f)
                close()
                moveTo(5f, 16f)
                lineToRelative(1.52f, -2.03f)
                lineTo(8.04f, 16f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Terrain!!
    }

private var _Terrain: ImageVector? = null

