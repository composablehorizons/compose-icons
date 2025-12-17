package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fiber_smart_record: ImageVector
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
                moveTo(17f, 5.55f)
                verticalLineToRelative(0.18f)
                curveToRelative(0f, 0.37f, 0.23f, 0.69f, 0.57f, 0.85f)
                curveTo(19.6f, 7.54f, 21f, 9.61f, 21f, 12f)
                reflectiveCurveToRelative(-1.4f, 4.46f, -3.43f, 5.42f)
                curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f)
                verticalLineToRelative(0.18f)
                curveToRelative(0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f)
                curveTo(21.08f, 18.01f, 23f, 15.23f, 23f, 12f)
                reflectiveCurveToRelative(-1.92f, -6.01f, -4.68f, -7.27f)
                curveToRelative(-0.61f, -0.28f, -1.32f, 0.14f, -1.32f, 0.82f)
                close()
            }
        }.build()
        
        return _Fiber_smart_record!!
    }

private var _Fiber_smart_record: ImageVector? = null

