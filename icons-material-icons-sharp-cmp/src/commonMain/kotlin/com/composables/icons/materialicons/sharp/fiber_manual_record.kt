package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fiber_manual_record: ImageVector
    get() {
        if (_Fiber_manual_record != null) return _Fiber_manual_record!!
        
        _Fiber_manual_record = ImageVector.Builder(
            name = "fiber_manual_record",
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
                moveTo(20f, 12f)
                arcTo(8f, 8f, 0f, false, true, 12f, 20f)
                arcTo(8f, 8f, 0f, false, true, 4f, 12f)
                arcTo(8f, 8f, 0f, false, true, 20f, 12f)
                close()
            }
        }.build()
        
        return _Fiber_manual_record!!
    }

private var _Fiber_manual_record: ImageVector? = null

