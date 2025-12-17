package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fiber_smart_record: ImageVector
    get() {
        if (_Fiber_smart_record != null) return _Fiber_smart_record!!
        
        _Fiber_smart_record = ImageVector.Builder(
            name = "fiber_smart_record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 12f)
                    arcTo(8f, 8f, 0f, false, true, 9f, 20f)
                    arcTo(8f, 8f, 0f, false, true, 1f, 12f)
                    arcTo(8f, 8f, 0f, false, true, 17f, 12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 4.26f)
                    verticalLineToRelative(2.09f)
                    curveToRelative(2.33f, 0.82f, 4f, 3.04f, 4f, 5.65f)
                    reflectiveCurveToRelative(-1.67f, 4.83f, -4f, 5.65f)
                    verticalLineToRelative(2.09f)
                    curveToRelative(3.45f, -0.89f, 6f, -4.01f, 6f, -7.74f)
                    reflectiveCurveToRelative(-2.55f, -6.85f, -6f, -7.74f)
                    close()
                }
            }
        }.build()
        
        return _Fiber_smart_record!!
    }

private var _Fiber_smart_record: ImageVector? = null

