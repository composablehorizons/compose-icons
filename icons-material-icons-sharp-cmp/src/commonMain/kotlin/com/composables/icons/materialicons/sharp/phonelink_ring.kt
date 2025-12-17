package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phonelink_ring: ImageVector
    get() {
        if (_Phonelink_ring != null) return _Phonelink_ring!!
        
        _Phonelink_ring = ImageVector.Builder(
            name = "phonelink_ring",
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
                moveTo(20.1f, 7.7f)
                lineToRelative(-1f, 1f)
                curveToRelative(1.8f, 1.8f, 1.8f, 4.6f, 0f, 6.5f)
                lineToRelative(1f, 1f)
                curveToRelative(2.5f, -2.3f, 2.5f, -6.1f, 0f, -8.5f)
                close()
                moveTo(18f, 9.8f)
                lineToRelative(-1f, 1f)
                curveToRelative(0.5f, 0.7f, 0.5f, 1.6f, 0f, 2.3f)
                lineToRelative(1f, 1f)
                curveToRelative(1.2f, -1.2f, 1.2f, -3f, 0f, -4.3f)
                close()
                moveTo(16f, 1f)
                horizontalLineTo(2f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(14f)
                verticalLineTo(1f)
                close()
                moveToRelative(-2f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Phonelink_ring!!
    }

private var _Phonelink_ring: ImageVector? = null

