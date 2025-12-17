package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Burst_mode: ImageVector
    get() {
        if (_Burst_mode != null) return _Burst_mode!!
        
        _Burst_mode = ImageVector.Builder(
            name = "burst_mode",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveToRelative(18f, 0f)
                horizontalLineTo(9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                close()
                moveTo(11f, 17f)
                lineToRelative(2.5f, -3.15f)
                lineTo(15.29f, 16f)
                lineToRelative(2.5f, -3.22f)
                lineTo(21f, 17f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _Burst_mode!!
    }

private var _Burst_mode: ImageVector? = null

